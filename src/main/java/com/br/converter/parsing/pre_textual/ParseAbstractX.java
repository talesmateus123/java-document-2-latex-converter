package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseAbstractX extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\abstractX":
				return document.getElementosPreTextuais().getAbstractX() != null ? document.getElementosPreTextuais().getAbstractX().getTexto() : "";
			case"\\keywords":
				String palavrasChave = "";
				if(document.getElementosPreTextuais().getAbstractX() != null) {
				for (String palavraChave : document.getElementosPreTextuais().getAbstractX().getPalavrasChave())
					palavrasChave += palavraChave;
				}
				return palavrasChave;
			default:
				return string;
		}
	}

}
