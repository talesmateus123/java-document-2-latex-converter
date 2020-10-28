package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseDocument extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\include{elementos/pre-textuais/folha-aprovacao}":
				return document.getDataAprovacao() != null ? "\\include{elementos/pre-textuais/folha-aprovacao}\n" 
						: "\\include{elementos/pre-textuais/folha-aprovacao_old}\n";
			case"\\include{elementos/pre-textuais/dedicatoria}":
				
				return "\\include{elementos/pre-textuais/dedicatoria}";
			case"\\include{elementos/pre-textuais/agradecimentos}":
				
				return "\\include{elementos/pre-textuais/agradecimentos}";
			case"\\include{elementos/pre-textuais/epigrafe}":
				
				return "\\include{elementos/pre-textuais/epigrafe}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}":
				
				return "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}":
				
				return "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}";
			case"\\include{elementos/pre-textuais/listas/lista-tabelas}":
				
				return "\\include{elementos/pre-textuais/listas/lista-tabelas}";
			case"\\include{elementos/pre-textuais/listas/lista-siglas}":
				
				return "\\include{elementos/pre-textuais/listas/lista-siglas}";
			case"\\include{elementos/pre-textuais/listas/lista-simbolos}":
				
				return "\\include{elementos/pre-textuais/listas/lista-simbolos}";
			case"\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}":
				
				return "\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}";
			case"\\include{elementos/textuais/introducao}":
				
				return "\\include{elementos/textuais/introducao}";
			case"\\include{elementos/textuais/referencial_teorico}":
				
				return "\\include{elementos/textuais/referencial_teorico}";
			case"\\include{elementos/textuais/desenvolvimento/revisao-de-literatura}":
				
				return "\\include{elementos/textuais/desenvolvimento/revisao-de-literatura}";
			case"\\include{elementos/textuais/desenvolvimento/metodologia}":
				
				return "\\include{elementos/textuais/desenvolvimento/metodologia}";
			case"\\include{elementos/textuais/desenvolvimento/resultados}":
				
				return "\\include{elementos/textuais/desenvolvimento/resultados}";
			case"\\include{elementos/textuais/conclusao}":
				
				return "\\include{elementos/textuais/conclusao}";
			case"\\include{elementos/pos-textuais/referencias}":
				
				return "\\include{elementos/pos-textuais/referencias}";
			case"\\include{elementos/pos-textuais/apendices}":
				
				return "\\include{elementos/pos-textuais/apendices}";
			case"\\include{elementos/pos-textuais/anexos}":
				
				return "\\include{elementos/pos-textuais/anexos}";
			default:
				return string;
		}
	}

}
