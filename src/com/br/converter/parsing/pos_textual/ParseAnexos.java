package com.br.converter.parsing.pos_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseAnexos extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/anexos":
				// TODO To implement
				return string;
			default:
				return string;
		}
	}

}
