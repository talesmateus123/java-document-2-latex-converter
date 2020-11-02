package com.br.components.parsing;

import com.br.models.Capitulo;
import com.br.util.Html2LatexUtil;

public class ParseElementosComponent extends Parse {
	
	/**
	 * 
	 * @param string
	 * @param capitulo
	 * @return string
	 */
	protected String persistCapitulo(Capitulo capitulo) {
		String isUnlisted = capitulo.isUnlisted() ? "*" : "";
		return 
				"% ----------------------------------------------------------\n" +
				"% " + capitulo.getTitulo() + "\n" +
				"% ----------------------------------------------------------\n" +
				"\\chapter" + isUnlisted + "{" + capitulo.getTitulo() + "}" +
				"\n" +
				"\\label{chap:" + capitulo.getLabel() + "}" +
				"\n" +
				"\t" + Html2LatexUtil.toConvert(capitulo.getBody()) + 
				"\n" +
				"\n";
}

}
