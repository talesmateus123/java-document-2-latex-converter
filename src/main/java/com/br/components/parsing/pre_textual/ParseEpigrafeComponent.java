package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
public final class ParseEpigrafeComponent extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\epigrafe":
				return document.getElementosPreTextuais().getEpigrafe() != null ? document.getElementosPreTextuais().getEpigrafe() : "";
			default:
				return string;
		}
	}

}
