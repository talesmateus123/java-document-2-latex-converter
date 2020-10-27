package com.br.converter.parsing.pre_textual;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseFolhaAprovacao extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\dataporextenso":
				if(document.getDataAprovacao() != null) {
					Locale locale = new Locale("pt","BR");
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' YYYY", locale);
					return document.getDataAprovacao().format(formatter);
				}
				return "";
			default:
				return string;
		}
	}

}
