package com.br.tests;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;

import com.br.converter.Converter;
import com.br.models.Documento;
import com.br.models.ElementosPosTextuais;
import com.br.models.ElementosTextuais;
import com.br.models.enums.NivelEscolar;
import com.br.models.enums.TipoPessoa;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;

public class Tests {
	public static void initTests() {
		/*
		Pessoa autor = new Pessoa(null, "nome", "sobrenome", TipoPessoa.ORIENTANDO, null);
		Pessoa orientador = new Pessoa(null, "nome", "sobrenome", TipoPessoa.ORIENTADOR, null);
		Pessoa coorientador = new Pessoa(null, "nome", "sobrenome", TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, "nome", "sigla", "campus", "departamento");
		
		Curso curso = new Curso(null, "nome", NivelEscolar.SUPERIOR);
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais();
		
		Documento documento = new Documento(null, "titulo", "subTitulo", "title", autor, "nomeCidade", 
				Year.now(), LocalDate.now(), TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, "areaConcentracao", "linhaPesquisa", 
				instituicao, curso, orientador, coorientador, elementosPreTextuais, elementosTextuais, 
				elementosPosTextuais);
		*/
		
		Pessoa autor = new Pessoa(null, "Tales Mateus O.", "Ferreira", TipoPessoa.ORIENTANDO, null);
		Pessoa orientador = new Pessoa(null, "Vagner", "Bezerra", TipoPessoa.ORIENTADOR, null);
		Pessoa coorientador = new Pessoa(null, "Afonso", "Leite", TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, "Instituto Federal do Mato Grosso do Sul", "IFMS", "Corumbá", null);
		
		Curso curso = new Curso(null, "Análise e Desenvolvimento de Sistemas", NivelEscolar.SUPERIOR);
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais();
		
		Documento documento = new Documento(null, "O desenvolvimento de software na era contemporânea", null, 
				"The software development in the contemporary era", autor, "Corumbá", 
				Year.now(), null, TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, null, null, 
				instituicao, curso, orientador, coorientador, elementosPreTextuais, elementosTextuais, 
				elementosPosTextuais);
		
		Converter converter = new Converter();
		try {
			converter.toConvert(documento);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
