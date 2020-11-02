package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public class ParseDedicatoria extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\dedicatoria":
				return document.getElementosPreTextuais().getDedicatoria() != null ? document.getElementosPreTextuais().getDedicatoria() : "";
			default:
				return string;
		}
	}

}
