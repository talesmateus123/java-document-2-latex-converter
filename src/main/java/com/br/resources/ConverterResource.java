package com.br.resources;

import java.io.IOException;
import java.time.Year;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.models.Capitulo;
import com.br.models.Documento;
import com.br.models.enums.NivelEscolar;
import com.br.models.enums.TipoPessoa;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.models.pos_textual.Anexos;
import com.br.models.pos_textual.Apendices;
import com.br.models.pos_textual.ElementosPosTextuais;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;
import com.br.models.textual.ElementosTextuais;
import com.br.services.ConverterService;

@RestController
@RequestMapping(value = "/api/converter")
public class ConverterResource {
	@Autowired
	private ConverterService service;
	
	/**
	 * Finds all computers.
	 * @return ResponseEntity<List<ComputerDTO>>
	 */
	@GetMapping
	public ResponseEntity<Void> findAll() {
		Pessoa autor = new Pessoa(null, "Tales Mateus de Oliveira", "Ferreira", TipoPessoa.ORIENTANDO, null);
		Pessoa orientador = new Pessoa(null, "Vagner", "Bezerra", TipoPessoa.ORIENTADOR, null);
		Pessoa coorientador = new Pessoa(null, "Afonso", "Leite", TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, "Instituto Federal do Mato Grosso do Sul", "IFMS", "Corumbá", null);
		
		Curso curso = new Curso(null, "Análise e Desenvolvimento de Sistemas", NivelEscolar.SUPERIOR);
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		
		Capitulo capitulo1 = new Capitulo(null, "Introducao", 
				"<p>Parágrafo 1</p>"
				+ "<h1>Seção 1</h1>"
				+ "<p>Parágrafo 1 <a href=\"https://www.google.com/\">Link</a></p>"
				+ "<p>Parágrafo 2 <b>texto em negrito</b></p>"
				+ "<h2>Subseção 1</h2>"
				+ "<p>Lista ordenada:</p>"
				+ "<ol><li>Item 1</li> <li>Item 2</li></ol>"
				);
		Capitulo capitulo2 = new Capitulo(null, "Desenvolvimento", "body");
		Capitulo capitulo3 = new Capitulo(null, "Conclusao", "body");
		
		elementosTextuais.setCapitulos(Arrays.asList(capitulo1, capitulo2, capitulo3));
		
		Capitulo apendice1 = new Capitulo(null, "Apendice 1", "body");
		Capitulo apendice2 = new Capitulo(null, "Apendice 2", "body");

		Apendices apendices = new Apendices(null, Arrays.asList(apendice1, apendice2));
				
		Capitulo anexo1 = new Capitulo(null, "Anexo 1", "body");
		Capitulo anexo2 = new Capitulo(null, "Anexo 2", "body");
		
		Anexos anexos = new Anexos(null, Arrays.asList(anexo1, anexo2));
		
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais(null, apendices, anexos);
		
		Documento documento = new Documento(null, "O desenvolvimento de software na era contemporânea", null, 
				"The software development in the contemporary era", autor, "Corumbá", 
				Year.now(), null, TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, null, null, 
				instituicao, curso, orientador, coorientador, elementosPreTextuais, elementosTextuais, 
				elementosPosTextuais);
		
		try {
			service.toConvert(documento);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.noContent().build();
	}
	
	
}
