package com.br.converter.parsing.pre_textual;

import com.br.converter.parsing.Parse;
import com.br.models.Documento;

public class ParseCapa extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\titulo{}":
				return document.getTitulo() != null ? "\\titulo{" + document.getTitulo() + "}" : "%\\titulo{}";
			case"\\subtitulo{}":
				return document.getSubTitulo() != null ? "\\subtitulo{" + document.getSubTitulo() + "}" : "%\\subtitulo{}";
			case"\\titleabstract{}":
				return document.getAbstractX() != null ? "\\titleabstract{" + document.getAbstractX() + "}" : "%\\titleabstract{}";
			case"\\autor{}":
				return document.getAbstractX() != null ? "\\autor{autor}" : "%\\autor{}";
			case"\\autorcitacao{}":
				return document.getAbstractX() != null ? "\\autorcitacao{autor}" : "%\\autorcitacao{}";
			case"\\local{}":
				return document.getNomeCidade() != null ? "\\local{" + document.getNomeCidade() + "}" : "%\\local{}";
			case"\\data{}":
				return document.getAno() != null ? "\\data{" + Integer.toString(document.getAno()) + "}" : "%\\data{}";
			case"\\projeto{}":
				return null != null ? "\\projeto{" + "to implement" + "}" : "\\projeto{}";
			case"\\tituloAcademico{}":
				return null != null ? "\\tituloAcademico{" + "to implement" + "}" : "%\\tituloAcademico{}";
			case"\\areaconcentracao{}":
				return null != null ? "\\areaconcentracao{" + "to implement" + "}" : "%\\areaconcentracao{}";
			case"\\linhapesquisa{}":
				return null != null ? "\\linhapesquisa{" + "to implement" + "}" : "%\\linhapesquisa{}";
			case"\\instituicao{}":
				return null != null ? "\\instituicao{" + "to implement" + "}" : "\\instituicao{Instituto Federal de Mato Grosso do Sul - IFMS}";
			case"\\newcommand\\instituicaosigla{}":
				return null != null ? "\\newcommand\\instituicaosigla{" + "to implement" + "}" : "%\\newcommand\\instituicaosigla{}";
			case"\\newcommand\\instituicaocampus{}":
				return null != null ? "\\newcommand\\instituicaocampus{" + "to implement" + "}" : "%\\newcommand\\instituicaocampus{}";
			case"\\departamento{}":
				return null != null ? "\\departamento{" + "to implement" + "}" : "%\\departamento{}";
			case"\\programa{}":
				return null != null ? "\\programa{" + "to implement" + "}" : "\\programa{Curso de Tecnologia em Análise e Desenvolvimento de Sistemas}";				
			case"\\newcommand\\programanivel{}":
				return null != null ? "\\newcommand\\programanivel{" + "to implement" + "}" : "";
			case"\\orientador{Prof. }":
				return null != null ? "\\orientador{" + "to implement" + "}" : "%\\orientador{Prof. }";
			case"\\instOrientador{}":
				return null != null ? "\\instOrientador{" + "Prof. " + "to implement" + "}" : "";
			case"\\coorientador{Prof. }":
				return null != null ? "\\coorientador{" + "Prof. " + "to implement" + "}" : "%\\coorientador{Prof. }";
			case"\\instCoorientador{}":
				return null != null ? "\\instCoorientador{" + "to implement" + "}" : "";
			default:
				return string;
		}
	}

}
