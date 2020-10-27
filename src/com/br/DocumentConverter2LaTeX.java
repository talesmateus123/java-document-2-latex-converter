package com.br;


import org.jsoup.nodes.Element;

public class DocumentConverter2LaTeX {

	public static void main(String[] args) {
		com.br.tests.Tests.initTests();
		/*
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
		*/	

	}
	
	public static Element getChildren() {
		return null;
	}

}
