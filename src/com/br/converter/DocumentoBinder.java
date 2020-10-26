package com.br.converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.br.converter.models.Documento;

public class DocumentoBinder {
	
	public static void bindCapa(File file, Documento documento) {
		List<String> parts = readFile(file);
		
		for(String string : parts) {
			if (string.startsWith("/"))
				string = persistCapaData(string, documento);
			System.out.println(string);
		}
	}
	
	private static List<String> readFile(File file) {
		String data = "";
		List<String> dataSplited = null; 
		try {
		     Scanner myReader = new Scanner(file);
		     while (myReader.hasNextLine()) {
		    	 String line = myReader.nextLine();
		    	 data += line + "\n";
		     }
		     myReader.close();
		     
		     dataSplited = splitData(data);
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	    return dataSplited;
	}
	
	private static List<String> splitData(String str) {
		return Arrays.asList(str.split("!"));
	}
	
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
}
