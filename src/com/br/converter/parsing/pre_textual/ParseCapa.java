package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseCapa extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"/titulo":
				return document.getTitulo();
			case"/subtitulo":
				return document.getSubTitulo();
			case"/titleabstract":
				return document.getAbstractX();
			case"/autor":
				// TODO Missing implementation
				return string;
			case"/autorcitacao":
				// TODO Missing implementation
				return string;
			case"/local":
				return document.getNomeCidade();
			case"/data":
				return Integer.toString(document.getAno());
			default:
				return string;
		}
	}

}
