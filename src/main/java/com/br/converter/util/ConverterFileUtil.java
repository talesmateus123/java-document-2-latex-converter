package com.br.converter.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConverterFileUtil {
	
	/**
	 * Escreve o conteúdo de uma string em um arquivo.
	 * @param file
	 * @param string
	 * @return void
	 */
	public static void writeFile(File file, String string) {
		try {
		      FileWriter fileWriter = new FileWriter(file.getPath());
		      fileWriter.write(string);
		      fileWriter.close();
		}
		catch (IOException e) {
		      e.printStackTrace();
		}
	}
	
	/**
	 * Lê todas as linhas de um arquivo e retorna uma string com seu conteúdo.
	 * @param file
	 * @return string
	 */
	public static String readFile(File file) {
		String lines = "";
		try {
		     Scanner scanner = new Scanner(file);
		     while (scanner.hasNextLine()) {
		    	 String line = scanner.nextLine();
		    	 lines += line + "\n";
		     }
		     scanner.close();
		} 
		catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	    return lines;
	}
	
	/**
	 * Separa uma string de acordo com um caractere especial e retorna uma lista com as partes obtidas.
	 * @param string
	 * @return list
	 */
	public static List<String> splitData(String string) {
		return Arrays.asList(string.split("!"));
	}
	
	public static void createFile(File file) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
