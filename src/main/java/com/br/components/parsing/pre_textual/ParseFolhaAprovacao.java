package com.br.components.parsing.pre_textual;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;

@Component
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
