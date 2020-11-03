package com.br.components.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

import com.br.models.Capitulo;
import com.br.models.Documento;
import com.br.util.FilePdfUtil;
import com.br.util.FileUtil;
import com.br.util.FileZipperUtil;

@Component
public class ConverterComponent {
	@Autowired
	private DocumentParserComponent documentParser;
	private Documento documento;
	private String mainDirectoryPath;
	
	public Resource convert(Documento documento) throws IOException, MalformedURLException {
		this.documento = documento;

		File file = parseDocumentToZip();
		Resource resource = null;
		resource = new UrlResource(file.toURI());
		return resource;
	}
	
	public Resource convert(Documento documento, boolean toPdf) throws IOException, MalformedURLException, InterruptedException {
		this.documento = documento;
		File file = toPdf ? parseDocumentToPdf() : parseDocumentToZip();
		
		Resource resource = file != null ? new UrlResource(file.toURI()) : null;
		return resource;
	}
	
	private File parseDocumentToZip() throws IOException {
		File fileCopied = parseDocumentToTemplate();
		return FileZipperUtil.zipDirectory(fileCopied);
	}
	
	private File parseDocumentToPdf() throws IOException, InterruptedException {
		File fileCopied = parseDocumentToTemplate();
		return FilePdfUtil.pdfDirectory(fileCopied);
	}
	
	private File parseDocumentToTemplate() throws IOException {
		File templateFile = new File("src/main/resources/latex-templates/monografia");

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
		this.documento = null;

		return fileCopied;
	}
	
	private void parseDocument() throws IOException {
		File document = new File(this.mainDirectoryPath + "/main.tex");
		documentParser.parseDocument(document, documento);
	}
	
	private void parseElementosPreTextuais() throws IOException {
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
	
	private void parseElementosTextuais() throws IOException {
		List<Capitulo> capitulos = this.documento.getElementosTextuais().getCapitulos();
		for(Capitulo capitulo : capitulos) {
			File file = new File(this.mainDirectoryPath + "/elementos/textuais/" + capitulo.getLabel() + ".tex");
			FileUtil.createFile(file);
			documentParser.parseElementosTextuais(file, capitulo);
		}
	}

	private void parseElementosPosTextuaisApendices() throws IOException {
		List<Capitulo> capitulos = this.documento.getElementosPosTextuais().getApendices();
		if(!capitulos.isEmpty()) {
			File file = new File(this.mainDirectoryPath + "/elementos/pos-textuais/apendices.tex");
			documentParser.parseElementosPosTextuais(file, capitulos);
		}
	}

	private void parseElementosPosTextuaisAnexos() throws IOException {
		List<Capitulo> capitulos = this.documento.getElementosPosTextuais().getAnexos();
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
