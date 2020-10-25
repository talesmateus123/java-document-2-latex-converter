package com.br.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.br.converter.models.Documento;

public class Converter {
	public void toConvert(Documento documento) throws IOException {
		parseDocumentToTemplate(documento);
	}
	
	private void parseDocumentToTemplate(Documento documento) throws IOException {
		File templateFile = new File("resources/templates/monografia");

		String mainDirectoryPath = generateFileName();
        File mainDirectory = new File(mainDirectoryPath);
        mainDirectory.mkdirs();
        
        File fileCopied = new File(mainDirectoryPath);
		
		copyFolder(templateFile, fileCopied);
		
		List<File> elementos = new ArrayList<File>();
		for (File file : new File(fileCopied.getPath() + "/elementos").listFiles()) elementos.add(file);
		bindDocumento2Files(elementos);
	}
	
	private void bindDocumento2Files(List<File> elementos) {
		for (File elemento : elementos) {
			switch(elemento.getName()) {
				case "textuais":
					break;
				case "pre-textuais":
					bindElementosPreTextuais(elemento.listFiles());
					break;
				case "pos-textuais":
					break;
			}
		}
	}
	
	private void bindElementosPreTextuais(File[] elementos) {
		for(File file : elementos) {
			switch(file.getName()) {
				case "agradecimentos.tex":
					break;
				case "epigrafe.tex":
					break;
				case "abstract.tex":
					break;
				case "resumo.tex":
					break;
				case "dedicatoria.tex":
					break;
				case "capa.tex":
					DocumentoBinder.bindCapa(file);
					break;
			}
		}
	}
	
	private void copyFolder(File src, File dest) throws IOException{
	    if(src.isDirectory()) {
	        if(!dest.exists()) dest.mkdir();

	        String files[] = src.list();

	        for (String file : files) {
	            File srcFile = new File(src, file);
	            File destFile = new File(dest, file);

	            copyFolder(srcFile, destFile);
	        }

	    } 
	    else {
	        InputStream in = new FileInputStream(src);
	        OutputStream out = new FileOutputStream(dest); 

	        byte[] buffer = new byte[1024];

	        int length;
	        while ((length = in.read(buffer)) > 0) out.write(buffer, 0, length);

	        in.close();
	        out.close();
	    }
	}
	
	private String generateFileName() {
		return "/tmp/document-converter-2-latex/" + new Date().getTime();
	}
	
}
