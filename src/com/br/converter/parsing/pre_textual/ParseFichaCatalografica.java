package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseFichaCatalografica extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\palavraschave":
				return "1. \\LaTeX.\n" + 
						"		2. Editor WYSIWYG.\n" + 
						"		3. Linguagens de marcação.\n" + 
						"		4. Orientador.";
			default:
				return string;
		}
	}

}
