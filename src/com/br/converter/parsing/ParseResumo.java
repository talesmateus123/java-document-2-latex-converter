package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseResumo extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/resumo":
				return document.getResumo();
			case"/palavraschave":
				// TODO Missing implementation
			default:
				return string;
		}
	}

}
