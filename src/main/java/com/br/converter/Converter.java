package com.br.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import com.br.converter.util.ConverterFileUtil;
import com.br.models.Capitulo;
import com.br.models.Documento;

public class Converter {
	private final DocumentParser documentParser = new DocumentParser();
	private Documento documento;
	private String mainDirectoryPath;
	
	public void toConvert(Documento documento) throws IOException {
		this.documento = documento;
		parseDocumentToTemplate();
	}
	
	private void parseDocumentToTemplate() throws IOException {
		File templateFile = new File("src/main/resources/templates/monografia");

		generateFileName();
		
        File mainDirectory = new File(this.mainDirectoryPath);
        mainDirectory.mkdirs();
        
        File fileCopied = new File(this.mainDirectoryPath);
		
		copyFolder(templateFile, fileCopied);
		
		parseDocument();
		parseElementosPreTextuais();
		parseElementosTextuais();
		parseElementosPosTextuaisApendices();
		parseElementosPosTextuaisAnexos();
	}
	
	private void parseDocument() {
		File document = new File(this.mainDirectoryPath + "/tcc.tex");
		documentParser.parseDocument(document, documento);
	}
	
	private void parseElementosPreTextuais() {
		File directory = new File(this.mainDirectoryPath + "/elementos/pre-textuais");
		File[] elementos = directory.listFiles();
		
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
	
	private void parseElementosTextuais() {
		for(Capitulo capitulo : this.documento.getElementosTextuais().getCapitulos()) {
			File file = new File(this.mainDirectoryPath + "/elementos/textuais/" + capitulo.getLabel() + ".tex");
			ConverterFileUtil.createFile(file);
			documentParser.parseElementosTextuais(file, capitulo);
		}
	}

	private void parseElementosPosTextuaisApendices() {
		List<Capitulo> capitulos = this.documento.getElementosPosTextuais().getApendices().getCapitulos();
		if(!capitulos.isEmpty()) {
			File file = new File(this.mainDirectoryPath + "/elementos/pos-textuais/apendices.tex");
			documentParser.parseElementosPosTextuais(file, capitulos);
		}
	}

	private void parseElementosPosTextuaisAnexos() {
		List<Capitulo> capitulos = this.documento.getElementosPosTextuais().getAnexos().getCapitulos();
		if(!capitulos.isEmpty()) {
			File file = new File(this.mainDirectoryPath + "/elementos/pos-textuais/anexos.tex");
			documentParser.parseElementosPosTextuais(file, capitulos);
		}
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
	
	private void generateFileName() {
		this.mainDirectoryPath = "/tmp/document-converter-2-latex/" + new Date().getTime();
	}
	
}
