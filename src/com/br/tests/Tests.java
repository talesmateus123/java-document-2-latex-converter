package com.br.tests;

import java.io.IOException;
import java.time.LocalDate;

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
		Pessoa autor = new Pessoa(null, "nome", "sobrenome", TipoPessoa.ORIENTANDO, null);
		Pessoa orientador = new Pessoa(null, "nome", "sobrenome", TipoPessoa.ORIENTADOR, null);
		Pessoa coorientador = new Pessoa(null, "nome", "sobrenome", TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, "nome", "sigla", "campus", "departamento");
		
		Curso curso = new Curso(null, "nome", NivelEscolar.SUPERIOR);
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais();
		
		/* Documento documento = new Documento(null, "titulo", "subTitulo", "title", autor, "nomeCidade", LocalDate.now(), 
				TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, "areaConcentracao", "linhaPesquisa", instituicao, curso, 
				orientador, coorientador, false, elementosPreTextuais, elementosTextuais, elementosPosTextuais);
		 */
		
		Documento documento = new Documento(null, "titulo", "subTitulo", "title", autor, "nomeCidade", LocalDate.now(), 
				TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, null, null, instituicao, curso, 
				orientador, coorientador, false, elementosPreTextuais, elementosTextuais, elementosPosTextuais);
		
		Converter converter = new Converter();
		try {
			converter.toConvert(documento);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
