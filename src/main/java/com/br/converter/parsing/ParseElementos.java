package com.br.converter.parsing;

import com.br.converter.util.Html2LatexUtil;
import com.br.models.Capitulo;

public class ParseElementos extends Parse {
	
	/**
	 * 
	 * @param string
	 * @param capitulo
	 * @return string
	 */
	protected String persistCapitulo(Capitulo capitulo) {
		return 
				"% ----------------------------------------------------------\n" +
				"% " + capitulo.getTitulo() + "\n" +
				"% ----------------------------------------------------------\n" +
				"\\chapter{" + capitulo.getTitulo() + "}" +
				"\n" +
				"\t\\label{chap:" + capitulo.getLabel() + "}" +
				"\n" +
				"\t" + Html2LatexUtil.toConvert(capitulo.getBody()) + 
				"\n" +
				"\n";
}

}
