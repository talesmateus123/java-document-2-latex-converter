package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;

@Component
public final class ParseCapaComponent extends Parse {
	
	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\titulo{}":
				return document.getTitulo() != null ? "\\titulo{" + document.getTitulo() + "}" : "%\\titulo{}";
			case"\\subtitulo{}":
				return document.getSubTitulo() != null ? "\\subtitulo{" + document.getSubTitulo() + "}" : "%\\subtitulo{}";
			case"\\titleabstract{}":
				return document.getElementosPreTextuais().getAbstractX() != null ? "\\titleabstract{" + document.getElementosPreTextuais().getAbstractX() + "}" : "%\\titleabstract{}";
			case"\\autor{}":
				return document.getAutor() != null ? "\\autor{" + document.getAutor().getNomeCompleto() + "}" : "%\\autor{}";
			case"\\autorcitacao{}":
				return document.getAutor() != null ? "\\autorcitacao{" + document.getAutor().getCitacao() + "}" : "%\\autorcitacao{}";
			case"\\local{}":
				return document.getNomeCidade() != null ? "\\local{" + document.getNomeCidade() + "}" : "%\\local{}";
			case"\\data{}":
				return document.getAno() != null ? "\\data{" + document.getAno() + "}" : "%\\data{}";
			case"\\projeto{}":
				return document.getTipoTrabalho() != null ? "\\projeto{" + document.getTipoTrabalho().getDescription() + "}" : "\\projeto{}";
			case"\\tituloAcademico{}":
				return document.getTituloAcademico() != null ? "\\tituloAcademico{" + document.getTituloAcademico().getDescription() + "}" : "%\\tituloAcademico{}";
			case"\\areaconcentracao{}":
				return document.getAreaConcentracao() != null ? "\\areaconcentracao{" + document.getAreaConcentracao() + "}" : "%\\areaconcentracao{}";
			case"\\linhapesquisa{}":
				return document.getLinhaPesquisa() != null ? "\\linhapesquisa{" + document.getLinhaPesquisa() + "}" : "%\\linhapesquisa{}";
			case"\\instituicao{}":
				return document.getInstituicao().getNome() != null ? "\\instituicao{" + document.getInstituicao().getNome() + "}" : "\\instituicao{" + "to implement" + "}";
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
						tituloAcademico = "técnico";
					if (document.getTituloAcademico() == TituloAcademico.TECNOLOGO)
						tituloAcademico = "de tecnologia";
					if (document.getTituloAcademico() == TituloAcademico.MESTRE)
						tituloAcademico = "de mestrado";
					if (document.getTituloAcademico() == TituloAcademico.DOUTOR)
						tituloAcademico = "de doutorado";
				}
				return document.getCurso() != null ? "\\programa{Curso " + tituloAcademico + " em " + document.getCurso().getNome() + "}" : "\\programa{" + "Nome do curso" + "}";				
			case"\\newcommand\\programanivel{}":
				return document.getCurso() != null ? "\\newcommand\\programanivel{" + document.getCurso().getNivelEscolar() + "}" : "";
			case"\\orientador{}":
				return document.getOrientador() != null ? "\\orientador{" + document.getOrientador().getNomeCompleto() + "}" : "%\\orientador{Prof. }";
			case"\\coorientador{}":
				return document.getCoorientador() != null ? "\\coorientador{" + "Prof. " + document.getCoorientador().getNomeCompleto() + "}" : "%\\coorientador{Prof. }";
			default:
				return string;
		}
	}

}
