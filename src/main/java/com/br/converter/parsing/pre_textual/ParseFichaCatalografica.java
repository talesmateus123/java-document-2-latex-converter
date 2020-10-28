package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseFichaCatalografica extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\palavraschave":
				String palavrasChave = "";
				if(document.getElementosPreTextuais().getFichaCatalografica() != null) {
				for (String palavraChave : document.getElementosPreTextuais().getFichaCatalografica().getPalavrasChave())
					palavrasChave += palavraChave;
				}
				return palavrasChave;
			default:
				return string;
		}
	}

}
