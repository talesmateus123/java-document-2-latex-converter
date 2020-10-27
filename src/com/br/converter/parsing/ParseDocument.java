package com.br.converter.parsing;

import com.br.models.Documento;

public class ParseDocument extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\document":
				return "% INSERE ELEMENTOS PRÉ-TEXTUAIS\n" + 
						"\\pretextual\n" + 
						"\n" + 
						"% Comando para imprimir Capa\n" + 
						"\\imprimircapa\n" + 
						"\n" + 
						"% Comando para imprimir Folha de rosto\n" + 
						"\\imprimirfolhaderosto{}                                     		   \n" + 
						"\n" + 
						"% Ficha Catalográfica\n" + 
						"\\include{elementos/pre-textuais/ficha-catalografica}\n" + 
						"\n" + 
						"% Folha de Aprovação\n" + 
						"\\include{elementos/pre-textuais/folha-aprovacao}\n" + 
						"\n" + 
						"% Dedicatória\n" + 
						"\\include{elementos/pre-textuais/dedicatoria}\n" + 
						"\n" + 
						"% Agradecimentos\n" + 
						"\\include{elementos/pre-textuais/agradecimentos}        		\n" + 
						"\n" + 
						"% Epígrafe\n" + 
						"\\include{elementos/pre-textuais/epigrafe}\n" + 
						"\n" + 
						"%obrigatorio\n" + 
						"% Resumo em Português\n" + 
						"\\include{elementos/pre-textuais/resumo}\n" + 
						"%obrigatorio\n" + 
						"% Resumo em Inglês\n" + 
						"\\include{elementos/pre-textuais/abstract}\n" + 
						"\n" + 
						"% Lista de Figuras\n" + 
						"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}\n" + 
						"\n" + 
						"% Lista de Quadros\n" + 
						"\\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}\n" + 
						"\n" + 
						"% Lista de Tabelas\n" + 
						"\\include{elementos/pre-textuais/listas/lista-tabelas}\n" + 
						"\n" + 
						"% Lista de Abreviaturas e Siglas\n" + 
						"\\include{elementos/pre-textuais/listas/lista-siglas}\n" + 
						"\n" + 
						"% Lista de Símbolos\n" + 
						"\\include{elementos/pre-textuais/listas/lista-simbolos}\n" + 
						"\n" + 
						"% Lista de Algoritmos\n" + 
						"\\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}\n" + 
						"\n" + 
						"% Sumário\n" + 
						"\\include{elementos/pre-textuais/sumario}\n" + 
						"\n" + 
						"% INSERE ELEMENTOS TEXTUAIS\n" + 
						"\\textual\n" + 
						"\n" + 
						"% Introdução\n" + 
						"\\include{elementos/textuais/introducao}\n" + 
						"\n" + 
						"% Ref. teorico\n" + 
						"\\include{elementos/textuais/referencial_teorico}\n" + 
						"\n" + 
						"% Revisão de Literatura\n" + 
						"\\include{elementos/textuais/desenvolvimento/revisao-de-literatura}\n" + 
						"\n" + 
						"% Metodologia\n" + 
						"\\include{elementos/textuais/desenvolvimento/metodologia}\n" + 
						"\n" + 
						"% Resultados\n" + 
						"\\include{elementos/textuais/desenvolvimento/resultados}\n" + 
						"\n" + 
						"% Capítulo com Orientações de uso do Template\n" + 
						"%\\include{elementos/textuais/desenvolvimento/orientacoes}        \n" + 
						"\n" + 
						"% Conclusão\n" + 
						"\\include{elementos/textuais/conclusao}\n" + 
						"\n" + 
						"% INSERE ELEMENTOS PÓS-TEXTUAIS\n" + 
						"\\postextual\n" + 
						"\n" + 
						"% Referências\n" + 
						"\\include{elementos/pos-textuais/referencias}\n" + 
						"\n" + 
						"% Apêndices\n" + 
						"\\include{elementos/pos-textuais/apendices}\n" + 
						"\n" + 
						"% Anexos\n" + 
						"\\include{elementos/pos-textuais/anexos}";
			default:
				return string;
		}
	}

}
