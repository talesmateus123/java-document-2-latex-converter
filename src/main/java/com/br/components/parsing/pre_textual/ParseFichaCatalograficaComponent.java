package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public final class ParseFichaCatalograficaComponent extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\palavraschave":
				String palavrasChave = "";
				int counter = 1;
				for (String palavraChave : document.getElementosPreTextuais().getFichaCatalograficaPalavrasChave()) {
					palavrasChave += counter + ". " + palavraChave + ".\n";
					counter++;
				}
				return palavrasChave;
			default:
				return string;
		}
	}

}
