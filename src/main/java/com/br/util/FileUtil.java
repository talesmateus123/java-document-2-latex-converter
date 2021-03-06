package com.br.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
	
	/**
	 * Escreve o conteúdo de uma string em um arquivo.
	 * @param file
	 * @param string
	 * @return void
	 * @throws IOException 
	 */
	public static void writeFile(File file, String string) throws IOException {
	      FileWriter fileWriter = new FileWriter(file.getPath());
	      fileWriter.write(string);
	      fileWriter.close();
	}
	
	/**
	 * Lê todas as linhas de um arquivo e retorna uma string com seu conteúdo.
	 * @param file
	 * @return string
	 */
	public static String readFile(File file) throws IOException {
		String lines = "";
	     Scanner scanner = new Scanner(file);
	     while (scanner.hasNextLine()) {
	    	 String line = scanner.nextLine();
	    	 lines += line + "\n";
	     }
	     scanner.close();
	    return lines;
	}
	
	public static void deleteDirectory (File file) throws IOException {
		Path path = Paths.get(file.getPath());
		
		Files.walk(path)
			.sorted(Comparator.reverseOrder())
		    .map(Path::toFile)
		    .forEach(File::delete);
	}
	
	public static void deleteFile (File file) throws IOException {
		file.delete();
	}
	
	/**
	 * Separa uma string de acordo com um caractere especial e retorna uma lista com as partes obtidas.
	 * @param string
	 * @return list
	 */
	public static List<String> splitData(String string) {
		return Arrays.asList(string.split("!"));
	}
	
	public static void createFile(File file) throws IOException {
		file.createNewFile();
	}
	
}
