package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseDocument extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\include{elementos/pre-textuais/folha-aprovacao}":
				return document.getDataAprovacao() != null ? "\\include{elementos/pre-textuais/folha-aprovacao}\n" 
						: "%\\include{elementos/pre-textuais/folha-aprovacao}\n";
			case"\\include{elementos/pre-textuais/dedicatoria}":
				return document.getElementosPreTextuais().getDedicatoria() != null ? "\\include{elementos/pre-textuais/dedicatoria}"
						: "%\\include{elementos/pre-textuais/dedicatoria}";
			case"\\include{elementos/pre-textuais/agradecimentos}":
				return document.getElementosPreTextuais().getAgradecimentos() != null ? "\\include{elementos/pre-textuais/agradecimentos}"
						: "%\\include{elementos/pre-textuais/agradecimentos}";
			case"\\include{elementos/pre-textuais/epigrafe}":
				return document.getElementosPreTextuais().getEpigrafe() != null ? "\\include{elementos/pre-textuais/epigrafe}"
						: "%\\include{elementos/pre-textuais/epigrafe}";
			case"\\include{elementos/pre-textuais/listas/lista-siglas}":
				return document.getElementosPreTextuais().getListaSiglas() != null ? "\\include{elementos/pre-textuais/listas/lista-siglas}"
						: "%\\include{elementos/pre-textuais/listas/lista-siglas}";
			case"\\include{elementos/pre-textuais/listas/lista-simbolos}":
				return document.getElementosPreTextuais().getListaSimbolos() != null ? "\\include{elementos/pre-textuais/listas/lista-simbolos}"
						: "%\\include{elementos/pre-textuais/listas/lista-simbolos}";
			case"\\include{elementos/pos-textuais/apendices}":
				return document.getElementosPosTextuais().getApendices() != null ? "\\include{elementos/pos-textuais/apendices}" 
						: "%\\include{elementos/pos-textuais/apendices}";
			case"\\include{elementos/pos-textuais/anexos}":
				return document.getElementosPosTextuais().getAnexos() != null ? "\\include{elementos/pos-textuais/anexos}" 
						: "%\\include{elementos/pos-textuais/anexos}";
			case"\\elementostextuais":
				// TODO Implement parsing for "capitulos"
				return "";
			default:
				return string;
		}
	}

}
