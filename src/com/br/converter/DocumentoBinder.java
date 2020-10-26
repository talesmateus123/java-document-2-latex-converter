package com.br.converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.br.converter.models.Documento;

public class DocumentoBinder {
	
	/**
	 * <p>Esse método realiza as seguintes operações:</p>
	 * <ul>
	 * 	<li>Realiza a leitura do arquivo;</li>
	 * 	<li>Separa os atributos LaTeX com base em um caractere especial;</li>
	 * 	<li>Substitui os atributos LaTeX com os dados da capa do documento;</li>
	 * 	<li>Realiza a reescrita do arquivo atual.</li>
	 * </ul>
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public static void bindCapa(File file, Documento documento) {
		List<String> parts = null;
		String data = readFile(file);
		parts = splitData(data);
		
		parts = parts.stream().map(part -> {
			if (part.startsWith("/")) 
				return persistCapaData(part, documento);
			return part;
		}).collect(Collectors.toList());
		
		String string = "";
		
		for(String part : parts)
			string += part;
		
		writeFile(file, string);
	}
	
	/**
	 * <p>Esse método realiza as seguintes operações:</p>
	 * <ul>
	 * 	<li>Realiza a leitura do arquivo;</li>
	 * 	<li>Separa os atributos LaTeX com base em um caractere especial;</li>
	 * 	<li>Substitui os atributos LaTeX com os dados da capa do documento;</li>
	 * 	<li>Realiza a reescrita do arquivo atual.</li>
	 * </ul>
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public static void bindDedicatoria(File file, String text) {
		List<String> parts = null;
		String data = readFile(file);
		parts = splitData(data);
		
		parts = parts.stream().map(part -> {
			if (part.startsWith("/")) 
				return persistDedicatoriaData(part, text);
			return part;
		}).collect(Collectors.toList());
		
		String string = "";
		
		for(String part : parts)
			string += part;
		
		writeFile(file, string);
	}
	
	/**
	 * Escreve o conteúdo de uma string em um arquivo.
	 * @param file
	 * @param string
	 * @return void
	 */
	private static void writeFile(File file, String string) {
		try {
		      FileWriter myWriter = new FileWriter(file.getPath());
		      myWriter.write(string);
		      myWriter.close();
		} 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
	
	/**
	 * Lê todas as linhas de um arquivo e retorna uma string com seu conteúdo.
	 * @param file
	 * @return String
	 */
	private static String readFile(File file) {
		String data = "";
		try {
		     Scanner scanner = new Scanner(file);
		     while (scanner.hasNextLine()) {
		    	 String line = scanner.nextLine();
		    	 data += line + "\n";
		     }
		     scanner.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	    return data;
	}
	
	/**
	 * Separa uma string de acordo com um caractere especial e retorna uma lista com as partes obtidas.
	 * @param string
	 * @return list
	 */
	private static List<String> splitData(String string) {
		return Arrays.asList(string.split("!"));
	}
	
	/**
	 * Substitui um dos atributos da capa, com base nos dados do documento atual.
	 * @param string
	 * @param documento
	 * @return string
	 */
	private static String persistCapaData(String string, Documento documento) {
		switch(string) {
			case"/titulo":
				string = documento.getTitulo();
				break;
			case"/subtitulo":
				string = documento.getSubTitulo();
				break;
			case"/titleabstract":
				string = documento.getAbstractX();
				break;
			case"/autor":
				// TODO Implementation is missing
				break;
			case"/autorcitacao":
				// TODO Implementation is missing
				break;
			case"/local":
				string = documento.getNomeCidade();
				break;
			case"/data":
				string = Integer.toString(documento.getAno());
				break;
		}
		return string;
	}
	
	/**
	 * Substitui um dos atributos da capa, com base no texto da dedicatoria.
	 * @param string
	 * @param string
	 * @return string
	 */
	private static String persistDedicatoriaData(String string, String text) {
		switch(string) {
			case"/dedicatoria":
				string = text;;
				break;
		}
		return string;
	}
}
