package com.br.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import com.br.models.Documento;

public class Converter {
	private final DocumentParser documentParser = new DocumentParser();
	private Documento documento;
	
	public void toConvert(Documento documento) throws IOException {
		this.documento = documento;
		parseDocumentToTemplate();
	}
	
	private void parseDocumentToTemplate() throws IOException {
		File templateFile = new File("src/main/resources/templates/monografia");

		String mainDirectoryPath = generateFileName();
        File mainDirectory = new File(mainDirectoryPath);
        mainDirectory.mkdirs();
        
        File fileCopied = new File(mainDirectoryPath);
		
		copyFolder(templateFile, fileCopied);
		
		File[] elementos = new File(fileCopied.getPath() + "/elementos").listFiles();
		File document = new File(fileCopied.getPath() + "/tcc.tex");
		
		parseDocument(document);
		parseElementos(elementos);
	}
	
	private void parseDocument(File document) {
		documentParser.parseDocument(document, documento);
	}
	
	private void parseElementos(File[] elementos) {
		for (File elemento : elementos) {
			switch(elemento.getName()) {
				case "pre-textuais":
					parseElementosPreTextuais(elemento.listFiles());
					break;
				case "textuais":
					parseElementosTextuais(elemento.listFiles());
					break;
				case "pos-textuais":
					parseElementosPosTextuais(elemento.listFiles());
					break;
			}
		}
	}
	
	private void parseElementosPreTextuais(File[] elementos) {
		for(File file : elementos) {
			switch(file.getName()) {
				case "abstract.tex":
					documentParser.parseAbstractX(file, documento);
					break;
				case "agradecimentos.tex":
					documentParser.parseAgradecimentos(file, documento);
					break;
				case "capa.tex":
					documentParser.parseCapa(file, documento);
					break;
				case "dedicatoria.tex":
					documentParser.parseDedicatoria(file, documento);
					break;
				case "epigrafe.tex":
					documentParser.parseEpigrafe(file, documento);
					break;
				case "folha-aprovacao.tex":
					documentParser.parseFolhaAprovacao(file, documento);
					break;
				case "ficha-catalografica.tex":
					documentParser.parseFichaCatalografica(file, documento);
					break;
				case "folha-rosto.tex":
					documentParser.parseFolhaDeRosto(file, documento);
				case "resumo.tex":
					documentParser.parseResumo(file, documento);
					break;
			}
		}
	}
	
	private void parseElementosTextuais(File[] elementos) {
		// TODO To implement
	}
	
	private void parseElementosPosTextuais(File[] elementos) {
		// TODO To implement
	}
	
	private void copyFolder(File src, File dest) throws IOException {
	    if(src.isDirectory()) {
	        if(!dest.exists()) dest.mkdir();

	        File[] files = src.listFiles();

	        for (File file : files) {
	            File srcFile = new File(src, file.getName());
	            File destFile = new File(dest, file.getName());

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
