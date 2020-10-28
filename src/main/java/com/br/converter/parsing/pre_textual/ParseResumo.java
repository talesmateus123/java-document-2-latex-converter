package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseResumo extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\resumo":
				return document.getElementosPreTextuais().getResumo() != null ? document.getElementosPreTextuais().getResumo().getTexto() : "";
			case"\\palavraschave":
				String palavrasChave = "";
				if(document.getElementosPreTextuais().getResumo() != null) {
				for (String palavraChave : document.getElementosPreTextuais().getResumo().getPalavrasChave())
					palavrasChave += palavraChave;
				}
				return palavrasChave;
			default:
				return string;
		}
	}

}
