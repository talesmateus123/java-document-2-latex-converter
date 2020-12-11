package com.br.services;

import java.io.IOException;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.br.components.converter.ConverterComponent;
import com.br.dto.DocumentoNewDTO;
import com.br.models.Capitulo;
import com.br.models.Documento;
import com.br.models.enums.TipoPessoa;
import com.br.models.pos_textual.ElementosPosTextuais;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;
import com.br.models.pre_textual.Resumo;
import com.br.models.textual.ElementosTextuais;

@Service
public class ConverterService {
	
	@Autowired
	private ConverterComponent converterComponent;
	
	public Resource convertToZipFile(Documento documento) {
		try {
			return converterComponent.convert(documento);
		} 
		catch (IOException e) {
			throw new com.br.services.exceptions.IOException(e.getMessage());
		}
	}
	
	public Resource convertToPdfFile(Documento documento) {
		try {
			return converterComponent.convert(documento, true);
		}
		catch (IOException e) {
			throw new com.br.services.exceptions.IOException(e.getMessage());
		} 
		catch (InterruptedException e) {
			throw new com.br.services.exceptions.InterruptedException(e.getMessage());
		}
	}
	
	private String extractName(String name) {
		if(name.contains(" ")) {
			String[] splitedName = name.split(" ");
			return splitedName[0];
		}
		else
			return name;
	}
	
	private String extractLastName(String name) {
		if(name.contains(" ")) {
			String[] splitedName = name.split(" ");
			return splitedName[splitedName.length-1];
		}
		else
			return name;
	}
	
	public Documento fromDTO(DocumentoNewDTO documentoNewDTO) {
		Pessoa autor, orientador = null, coorientador = null;
		autor = new Pessoa(null, extractName(documentoNewDTO.getNomeAutor()), extractLastName(documentoNewDTO.getNomeAutor()), 
				TipoPessoa.ORIENTANDO, null);
		
		if(documentoNewDTO.getNomeOrientador() != null) {
		orientador = new Pessoa(null, extractName(documentoNewDTO.getNomeOrientador()), extractLastName(documentoNewDTO.getNomeOrientador()), 
				TipoPessoa.ORIENTADOR, null);
		}
		
		if(documentoNewDTO.getNomeCoorientador() != null) {
		coorientador = new Pessoa(null, extractName(documentoNewDTO.getNomeCoorientador()), extractLastName(documentoNewDTO.getNomeCoorientador()), 
				TipoPessoa.COORIENTADOR, null);
		}
		
		Instituicao instituicao = new Instituicao(null, documentoNewDTO.getNomeInstituicao(), documentoNewDTO.getSiglaInstituicao(), 
				documentoNewDTO.getCampusInstituicao(), documentoNewDTO.getDepartamentoInstituicao());
		
		Curso curso = new Curso(null, documentoNewDTO.getNomeCurso(), documentoNewDTO.getNivelEscolarCurso());
		
		Resumo abstractX = new Resumo(null, documentoNewDTO.getTextoAbstractX(), new Locale("en", "US"), documentoNewDTO.getPalavrasChaveAbstractX());
		Resumo resumo = new Resumo(null, documentoNewDTO.getTextoResumo(), new Locale("pt", "BR"), documentoNewDTO.getPalavrasChaveResumo());
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais(null, abstractX, documentoNewDTO.getAgradecimentos(), 
				documentoNewDTO.getDedicatoria(), documentoNewDTO.getEpigrafe(), documentoNewDTO.getFichaCatalograficaPalavrasChave(),
				documentoNewDTO.getPreAmbulo(), resumo, documentoNewDTO.getListaSiglas(), documentoNewDTO.getListaSimbolos(),
				documentoNewDTO.isEnabledAgradecimentos(), documentoNewDTO.isEnabledDedicatoria(), documentoNewDTO.isEnabledEpigrafe(),
				documentoNewDTO.isEnabledFichaCatalografica(), documentoNewDTO.isEnabledListaSiglas(), documentoNewDTO.isEnabledListaSimbolos(),
				documentoNewDTO.isEnabledListaTabelas(), documentoNewDTO.isEnabledListaAlgoritmos(), documentoNewDTO.isEnabledListaFiguras(),
				documentoNewDTO.isEnabledListaQuadros());
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		
		elementosPreTextuais.setFichaCatalograficaPalavrasChave(documentoNewDTO.getFichaCatalograficaPalavrasChave());
		
		elementosTextuais.setCapitulos(documentoNewDTO.getCapitulos().stream().map(capitulo -> 
		new Capitulo(null, capitulo.getTitulo(), capitulo.getBody(), capitulo.isUnlisted())).collect(Collectors.toList()));
		
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais(null, 
				documentoNewDTO.getApendices().stream().map(capitulo -> 
				new Capitulo(null, capitulo.getTitulo(), capitulo.getBody(), capitulo.isUnlisted())).collect(Collectors.toList()), 
				documentoNewDTO.getAnexos().stream().map(capitulo -> 
				new Capitulo(null, capitulo.getTitulo(), capitulo.getBody(), capitulo.isUnlisted())).collect(Collectors.toList())
				);
		
		return new Documento(null, documentoNewDTO.getTitulo(), documentoNewDTO.getSubTitulo(), documentoNewDTO.getTitle(), autor, documentoNewDTO.getNomeCidade(), documentoNewDTO.getAno(), documentoNewDTO.getDataAprovacao(), documentoNewDTO.getTipoTrabalho(), documentoNewDTO.getTituloAcademico(), documentoNewDTO.getAreaConcentracao(), documentoNewDTO.getLinhaPesquisa(), instituicao, curso, orientador, coorientador, elementosPreTextuais, elementosTextuais, elementosPosTextuais);
	}
	
}
