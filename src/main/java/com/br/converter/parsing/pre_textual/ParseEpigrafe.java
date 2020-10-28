package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseEpigrafe extends Parse {

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
