package com.br.components.parsing;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.br.models.Capitulo;
import com.br.models.Documento;

@Component
public final class ParseDocumentComponent extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\include{elementos/pre-textuais/folha-catalografica}":
				return document.getElementosPreTextuais().isEnabledFichaCatalografica() ? "\\include{elementos/pre-textuais/folha-catalografica}\n" 
						: "%\\include{elementos/pre-textuais/folha-catalografica}\n";
			case"\\include{elementos/pre-textuais/folha-aprovacao}":
				return document.getDataAprovacao() != null ? "\\include{elementos/pre-textuais/folha-aprovacao}\n" 
						: "%\\include{elementos/pre-textuais/folha-aprovacao}\n";
			case"\\include{elementos/pre-textuais/dedicatoria}":
				return document.getElementosPreTextuais().isEnabledDedicatoria() ? "\\include{elementos/pre-textuais/dedicatoria}"
						: "%\\include{elementos/pre-textuais/dedicatoria}";
			case"\\include{elementos/pre-textuais/agradecimentos}":
				return document.getElementosPreTextuais().isEnabledAgradecimentos() ? "\\include{elementos/pre-textuais/agradecimentos}"
						: "%\\include{elementos/pre-textuais/agradecimentos}";
			case"\\include{elementos/pre-textuais/epigrafe}":
				return document.getElementosPreTextuais().isEnabledEpigrafe() ? "\\include{elementos/pre-textuais/epigrafe}"
						: "%\\include{elementos/pre-textuais/epigrafe}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}}":
				return document.getElementosPreTextuais().isEnabledListaFiguras() ? "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}}"
						: "%\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}}":
				return document.getElementosPreTextuais().isEnabledListaQuadros() ? "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}}"
						: "%\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}}";
			case"\\include{elementos/pre-textuais/listas/lista-tabelas}":
				return document.getElementosPreTextuais().isEnabledListaTabelas() ? "\\include{elementos/pre-textuais/listas/lista-tabelas}"
						: "%\\include{elementos/pre-textuais/listas/lista-tabelas}";
			case"\\include{elementos/pre-textuais/listas/lista-siglas}":
				return document.getElementosPreTextuais().isEnabledListaSiglas() ? "\\include{elementos/pre-textuais/listas/lista-siglas}"
						: "%\\include{elementos/pre-textuais/listas/lista-siglas}";
			case"\\include{elementos/pre-textuais/listas/lista-simbolos}":
				return document.getElementosPreTextuais().isEnabledListaSimbolos() ? "\\include{elementos/pre-textuais/listas/lista-simbolos}"
						: "%\\include{elementos/pre-textuais/listas/lista-simbolos}";
			case"\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}":
				return document.getElementosPreTextuais().isEnabledListaAlgoritmos() ? "\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}"
						: "%\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}":
				return document.getElementosPreTextuais().isEnabledListaAlgoritmos() ? "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}"
						: "%\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}";
			case"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}":
				return document.getElementosPreTextuais().isEnabledListaAlgoritmos() ? "\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}"
						: "%\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}";
			case"\\include{elementos/pos-textuais/apendices}":
				return !document.getElementosPosTextuais().getApendices().isEmpty() ? "\\include{elementos/pos-textuais/apendices}" 
						: "%\\include{elementos/pos-textuais/apendices}";
			case"\\include{elementos/pos-textuais/anexos}":
				return !document.getElementosPosTextuais().getAnexos().isEmpty() ? "\\include{elementos/pos-textuais/anexos}" 
						: "%\\include{elementos/pos-textuais/anexos}";
			case"\\elementostextuais":
				return !document.getElementosTextuais().getCapitulos().isEmpty() ? includeCapitulos(document.getElementosTextuais().getCapitulos()) : "";
			default:
				return string;
		}
	}
	
	private String includeCapitulos(List<Capitulo> capitulos) {
		return capitulos.stream().map(capitulo -> "\n\t% " + capitulo.getTitulo() + "\n\t\\include{elementos/textuais/" 
				+ capitulo.getLabel() + "}\n").collect(Collectors.joining());
	}

}
