package com.br.converter.parsing.textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseIntroducao extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/introducao":
				// TODO To implement
				return string;
			default:
				return string;
		}
	}

}
