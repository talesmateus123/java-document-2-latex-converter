package com.br.tests;

import com.br.util.Html2LatexUtil;

public class HtmlParsingTests {
	public static void initTests() {
		String htmlText =
				"     	<h1>Titulo</h1>"
				+ "		<h2>Subtitulo</h2>"
		        + "		<p>"
		        + "			Paragrafo 1"
		        + "			<a href='link'>Link</a>"
		        + "			<img src='image.png'></img>"
		        + "			Continuacao"
		        + "		</p> "
		        + "		<p>"
		        + "			Paragrafo 2"
		        + "			<u>Outro</u> <b>parágrafo</b> <i>italico</i>"
		        + "		</p>"
		        + "		<ul>"
		        + "			<li>primeiro</li>"
		        + "			<li>segundo <a href='link'>Link2</a> fwefwefwef <b>bold</b></li>"
		        + "		</ul>"
		        + "		<p>"
		        + "			Parágrafo 4"
		        + "			\"aspas\""
		        + "		</p>"
		        + "		<ol>"
		        + "			<li>primeiro</li>"
		        + "			<li>segundo</li>"
		        + "		</ol>"
		;
		
		System.out.println(Html2LatexUtil.toConvertDocument(htmlText));
	}
	
}
