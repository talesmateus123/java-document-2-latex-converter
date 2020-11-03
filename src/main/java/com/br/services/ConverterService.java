package com.br.services;

import java.io.IOException;
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
	
	public Documento fromDTO(DocumentoNewDTO documentoNewDTO) {
		Pessoa autor = new Pessoa(null, documentoNewDTO.getNomeAutor(), documentoNewDTO.getSobrenomeAutor(), 
				TipoPessoa.ORIENTANDO, null);
		
		Pessoa orientador = new Pessoa(null, documentoNewDTO.getNomeOrientador(), documentoNewDTO.getSobrenomeOrientador(), 
				TipoPessoa.ORIENTADOR, null);
		
		Pessoa coorientador_1 = new Pessoa(null, documentoNewDTO.getNomeCoorientador_1(), documentoNewDTO.getSobrenomeCoorientador_1(), 
				TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, documentoNewDTO.getNomeInstituicao(), documentoNewDTO.getSiglaInstituicao(), 
				documentoNewDTO.getCampusInstituicao(), documentoNewDTO.getDepartamentoInstituicao());
		
		Curso curso = new Curso(null, documentoNewDTO.getNomeCurso(), documentoNewDTO.getNivelEscolarCurso());
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
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
		
		return new Documento(null, documentoNewDTO.getTitulo(), documentoNewDTO.getSubTitulo(), documentoNewDTO.getTitle(), autor, documentoNewDTO.getNomeCidade(), documentoNewDTO.getAno(), documentoNewDTO.getDataAprovacao(), documentoNewDTO.getTipoTrabalho(), documentoNewDTO.getTituloAcademico(), documentoNewDTO.getAreaConcentracao(), documentoNewDTO.getLinhaPesquisa(), instituicao, curso, orientador, coorientador_1, null, elementosPreTextuais, elementosTextuais, elementosPosTextuais);
	}
	
}
