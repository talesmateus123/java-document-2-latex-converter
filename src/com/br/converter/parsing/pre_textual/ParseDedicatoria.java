package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseDedicatoria extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\dedicatoria":
				return document.getDedicatoria();
			default:
				return string;
		}
	}

}
