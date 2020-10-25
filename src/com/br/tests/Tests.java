package com.br.tests;

import java.util.ArrayList;
import java.util.List;

import com.br.converter.Converter;
import com.br.converter.models.Citacao;
import com.br.converter.models.Documento;
import com.br.converter.models.Palavra;
import com.br.converter.models.Pessoa;
import com.br.converter.models.data.Particao;

public class Tests {
	public static void initTests() {
		List<Particao> particoes = null;
		List<Citacao> citacoes = null;
		List<Palavra> palavras = null;
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Fulano Beltrano");
		pessoa1.setTipoPessoa("Orientando");
		pessoas.add(pessoa1);
		
		Documento documento = new Documento(
				null, "titulo", "subTitulo", "title", 2020, "nivelEscolar", "tipo", "nomeCidade",
				"nomeCurso", "nomeInstituicao", "siglaInstituicao", "tituloAcademico", "preAmbulo",
				"fichaCatalografica", "dedicatoria", "epigrafe", "resumo", "abstractX", "agradecimentos", 
				particoes, citacoes, palavras, pessoas
		);
		
		Converter.toConvert(documento);
		
	}
	
}
