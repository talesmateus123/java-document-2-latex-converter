package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.util.Html2LatexUtil;

@Component
public final class ParseCapaComponent extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\titulo{}":
				return "\\titulo{" + Html2LatexUtil.toConvertTextualElement(document.getTitulo()) + "}";
			case"\\subtitulo{}":
				return document.getSubTitulo() != null ? "\\subtitulo{" + Html2LatexUtil.toConvertTextualElement(document.getSubTitulo()) + "}" : "%\\subtitulo{}";
			case"\\titleabstract{}":
				return "\\titleabstract{" + Html2LatexUtil.toConvertTextualElement(document.getTitle()) + "}";
			case"\\autor{}":
				return "\\autor{" + document.getAutor().getNomeCompleto() + "}";
			case"\\autorcitacao{}":
				return "\\autorcitacao{" + document.getAutor().getCitacao() + "}";
			case"\\local{}":
				return "\\local{" + document.getNomeCidade() + "}";
			case"\\data{}":
				return "\\data{" + document.getAno() + "}";
			case"\\projeto{}":
				return "\\projeto{" + document.getTipoTrabalho().getDescription() + "}";
			case"\\tituloAcademico{}":
				return document.getTituloAcademico() != null ? "\\tituloAcademico{" + document.getTituloAcademico().getDescription() + "}" : "%\\tituloAcademico{}";
			case"\\areaconcentracao{}":
				return document.getAreaConcentracao() != null ? "\\areaconcentracao{" + document.getAreaConcentracao() + "}" : "%\\areaconcentracao{}";
			case"\\linhapesquisa{}":
				return document.getLinhaPesquisa() != null ? "\\linhapesquisa{" + document.getLinhaPesquisa() + "}" : "%\\linhapesquisa{}";
			case"\\instituicao{}":
				return "\\instituicao{" + document.getInstituicao().getNome() + "}";
			case"\\newcommand\\instituicaosigla{}":
				return document.getInstituicao().getSigla() != null ? "\\newcommand\\instituicaosigla{" + document.getInstituicao().getSigla() + "}" : "%\\newcommand\\instituicaosigla{}";
			case"\\newcommand\\instituicaocampus{}":
				return document.getInstituicao() != null ? "\\newcommand\\instituicaocampus{" + document.getInstituicao().getCampus() + "}" : "%\\newcommand\\instituicaocampus{}";
			case"\\departamento{}":
				return document.getTipoTrabalho() != TipoTrabalho.TCC && document.getInstituicao().getDepartamento() != null ? "\\departamento{" + document.getInstituicao().getDepartamento() + "}" : "%\\departamento{}";
			case"\\programa{}":
				String tituloAcademico = "";
				if (document.getCurso() != null) {
					if (document.getTituloAcademico() == TituloAcademico.BACHAREL)
						tituloAcademico = "de bacharelado";
					if (document.getTituloAcademico() == TituloAcademico.TECNOLOGO)
						tituloAcademico = "de tecnologia";
					if (document.getTituloAcademico() == TituloAcademico.MESTRE)
						tituloAcademico = "de mestrado";
					if (document.getTituloAcademico() == TituloAcademico.DOUTOR)
						tituloAcademico = "de doutorado";
				}
				return "\\programa{Curso " + tituloAcademico + " em " + document.getCurso().getNome() + "}";				
			case"\\newcommand\\programanivel{}":
				return document.getCurso() != null ? "\\newcommand\\programanivel{" + document.getCurso().getNivelEscolar().getDescription() + "}" : "";
			case"\\orientador{}":
				return document.getOrientador() != null ? "\\orientador{Prof. " + document.getOrientador().getNomeCompleto() + "}" : "%\\orientador{Prof. }";
			case"\\coorientador{}":
				return document.getCoorientador() != null ? "\\coorientador{Prof. " + document.getCoorientador().getNomeCompleto() + "}" : "%\\coorientador{Prof. }";
			default:
				return string;
		}
	}

}
