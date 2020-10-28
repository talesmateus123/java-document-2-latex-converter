package com.br.converter.parsing;

import com.br.models.Capitulo;

public class ParseCapitulo extends Parse {
	
	public String persistData(String string, Capitulo capitulo) {
		return 
			"% ----------------------------------------------------------\n" + 
			"% " + capitulo.getTitulo() + " \n" +  
			"% ----------------------------------------------------------\n" + 
			"\n" + 
			"\\chapter{" + capitulo.getTitulo() + "}\n" + 
			"    \\label{chap:" + capitulo.getLabel() + "}\n" + 
			"    " + capitulo.getBody();
	}

}
