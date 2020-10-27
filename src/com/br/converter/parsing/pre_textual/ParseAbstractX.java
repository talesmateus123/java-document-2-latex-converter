package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseAbstractX extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\abstractX":
				return document.getA;
			case"\\keywords":
				// TODO Missing implementation
				return "words";
			default:
				return string;
		}
	}

}
