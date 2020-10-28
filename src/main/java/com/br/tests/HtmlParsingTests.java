package com.br.tests;

import javax.swing.text.html.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class HtmlParsingTests {
	public static void initTests() {
		Document document = Jsoup.parse(
				"     	<h1>Titulo</h1>"
				+ "		<h2>Subtitulo</h2>"
		        + "		<p>"
		        + "			Paragrafo"
		        + "			<a href='link'>Link</a>"
		        + "		</p>"
		);
		
		System.out.println(HTML.Tag.P);
		
		
		for(Element element : document.body().getAllElements()) {
			System.out.print("-" + element.tagName());
			System.out.println("\t" + element.children());
		}		
	}
	
}
