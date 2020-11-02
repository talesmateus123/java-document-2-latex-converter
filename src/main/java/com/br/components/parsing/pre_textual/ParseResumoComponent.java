package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public final class ParseResumoComponent extends Parse {

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
