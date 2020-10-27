package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseEpigrafe extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/epigrafe":
				return document.getEpigrafe();
			default:
				return string;
		}
	}

}
