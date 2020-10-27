package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseAbstractX extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/abstractX":
				return document.getAbstractX();
			case"/keywords":
				// TODO Missing implementation
				return string;
			default:
				return string;
		}
	}

}
