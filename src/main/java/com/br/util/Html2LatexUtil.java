package com.br.util;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Html2LatexUtil {
	
	/**
	 * Converte elementos html em formato de string em elementos LaTeX e retorna em uma string. 
	 * @param string
	 * @return string
	 */
	public static String toConvertDocument(String string) {
		return parseDocument(Jsoup.parse(string));
	}
	
	/**
	 * Converte elementos html em formato de string em elementos LaTeX e retorna em uma string. 
	 * @param string
	 * @return string
	 */
	public static String toConvertTextualElement(String string) {
		if (!string.contains("<p>")) {
			string = "<p>" + string + "</p>";
		}
		
		return parseTextualElement(Jsoup.parse(string));
	}
	
	private static String parseDocument(Document document) {
		List<Node> nodes = document.body().childNodes();
		String body = "";
		for (Node node : nodes) {
			if (node instanceof Element) body += parseElement((Element) node);
		}
		return body;
	}
	
	private static String parseTextualElement(Document document) {
		List<Node> nodes = document.body().childNodes();
		String body = "";
		for (Node node : nodes) {
			if (node instanceof Element) body += parseTextualElement((Element) node);
		}
		return body;
	}
	
	// TODO To implement new LaTeX components from HTML
	private static String parseElement(Element element) {
		switch(element.tagName()) {
			case"h1":
				return "\n\\section{" + element.text() + "}\n" +
						"\\label{sec:" + getLabel(element.text()) + "}\n";
			case"h2":
				return "\n\\subsection{" + element.text() + "}\n" +
						"\\label{subsec:" + getLabel(element.text()) + "}\n";
			case"h3":
				return "\n\\subsubsection{" + element.text() + "}\n" +
						"\\label{subsubsec:" + getLabel(element.text()) + "}\n";
			case"h4":
				return "\n\\subsubsubsection{" + element.text() + "}\n" +
						"\\label{subsubsubsec:" + getLabel(element.text()) + "}\n";
			case"img":
				// TODO Missing implementation
				break;
			case"ul":
				return parseList(element, false);
			case"ol":
				return parseList(element, true);
			default:
				return parseTextualElement(element);
		}
		return "";
	}
	
	private static String parseTextualElement(Element element) {
		switch(element.tagName()) {
			case"p":
				return parseParagraph(element);
			case"i":
				return "\\textit{" + handleSpecialCharacters(element.text()) + "}";
			case"b":
				return "\\textbf{" + handleSpecialCharacters(element.text()) + "}";
			case"u":
				return "\\underline{" + handleSpecialCharacters(element.text()) + "}";
			case"a":
				return handleSpecialCharacters(element.text()) + " \\url{" + element.attr("href") + "}" ;
		}
		return "";
	}
	
	private static String getLabel(String string) {
		return string.toLowerCase().replace(" ", "_");
	}
	
	private static String parseParagraph(Element element) {
		String body = "\n";
		for (Node n : element.childNodes()) {
	        if (n instanceof TextNode) {
	        	String text = ((TextNode) n).text();
	        	body += handleSpecialCharacters(text);
	        } 
	        else if (n instanceof Element) {
	        	body += parseElement((Element) n);
	        }
	    }
		body += "\n";
		return body;
	}

	// TODO Está faltando implementar listas com index 
	private static String parseList(Element element, boolean ordered) {
		String listType = ordered ? "enumerate" : "itemize";
		String body = "\n\\begin{" + listType + "}";
		
		for (Element childElement : element.children()) {
			if (childElement.tagName().equals("li")) {
				String index = childElement.attr("index");
				
				body += index.isEmpty() ? "\n\t\\item " : "\n\t\\item [" + index + "] ";
				if (childElement.childrenSize() > 0) {
					for (Node n : childElement.childNodes()) {
				        if (n instanceof TextNode) {
				        	body += ((TextNode) n).text();
				        } 
				        else if (n instanceof Element) {
				        	body += parseTextualElement((Element) n);
				        }
					}
				}
				else body += childElement.text();
			}
		}
		
		body += "\n\\end{" + listType + "}\n";
		return body;
	}
	
	// TODO Falta tratar todos os caracteres especiais do LaTeX
	public static String handleSpecialCharacters(String text) {
		if (text.contains("\""))
			text = text.replaceAll("\" ", "\"{} ");
		if (text.contains("\\"))
			text = text.replaceAll("\\\\", "");
		
		return text;
	}


}
