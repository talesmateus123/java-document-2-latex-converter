package com.br.tests;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;

import com.br.converter.Converter;
import com.br.models.Documento;
import com.br.models.Options;
import com.br.models.enums.NivelEscolar;
import com.br.models.enums.TipoPessoa;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.models.pos_textual.ElementosPosTextuais;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;
import com.br.models.textual.ElementosTextuais;

public class DocumentTests {
	public static void initTests() {
		Pessoa autor = new Pessoa(null, "Tales Mateus de Oliveira", "Ferreira", TipoPessoa.ORIENTANDO, null);
		Pessoa orientador = new Pessoa(null, "Vagner", "Bezerra", TipoPessoa.ORIENTADOR, null);
		Pessoa coorientador = new Pessoa(null, "Afonso", "Leite", TipoPessoa.COORIENTADOR, null);
		
		Instituicao instituicao = new Instituicao(null, "Instituto Federal do Mato Grosso do Sul", "IFMS", "Corumbá", null);
		
		Curso curso = new Curso(null, "Análise e Desenvolvimento de Sistemas", NivelEscolar.SUPERIOR);
		
		ElementosPreTextuais elementosPreTextuais = new ElementosPreTextuais();
		ElementosTextuais elementosTextuais = new ElementosTextuais();
		ElementosPosTextuais elementosPosTextuais = new ElementosPosTextuais();
		
		Options options = new Options();
		
		Documento documento = new Documento(null, "O desenvolvimento de software na era contemporânea", null, 
				"The software development in the contemporary era", autor, "Corumbá", 
				Year.now(), LocalDate.now(), TipoTrabalho.TCC, TituloAcademico.TECNOLOGO, null, null, 
				instituicao, curso, orientador, coorientador, options, elementosPreTextuais, elementosTextuais, 
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
