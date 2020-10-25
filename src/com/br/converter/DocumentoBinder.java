package com.br.converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocumentoBinder {
	
	public static void bindCapa(File file) {
		readFile(file);
	}
	
	private static String readFile(File file) {
		String data = "";
		try {
		     Scanner myReader = new Scanner(file);
		     while (myReader.hasNextLine()) {
		    	 data += myReader.nextLine() + "\n";
		     }
		     myReader.close();
		     System.out.println(data);
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	    return data;
	}
}
