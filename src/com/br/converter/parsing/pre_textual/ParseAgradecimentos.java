package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseAgradecimentos extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/agradecimentos":
				return document.getAgradecimentos();
			default:
				return string;
		}
	}

}
