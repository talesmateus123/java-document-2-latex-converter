package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public class ParseAgradecimentos extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\agradecimentos":
				return document.getElementosPreTextuais().getAgradecimentos() != null ? document.getElementosPreTextuais().getAgradecimentos() : "";
			default:
				return string;
		}
	}

}
