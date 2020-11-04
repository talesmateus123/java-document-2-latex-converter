package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public final class ParseAbstractXComponent extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\abstractX":
				return document.getElementosPreTextuais().getAbstractX().getTexto() != null ? document.getElementosPreTextuais().getAbstractX().getTexto() : "";
			case"\\keywords":
				String palavrasChave = "";
				if(document.getElementosPreTextuais().getAbstractX() != null) {
					for (String palavraChave : document.getElementosPreTextuais().getAbstractX().getPalavrasChave())
						palavrasChave += palavraChave + ". ";
				}
				return palavrasChave;
			default:
				return string;
		}
	}

}
