package com.br.converter;

import java.io.File;

import com.br.converter.parsing.ParseDocument;
import com.br.converter.parsing.pre_textual.ParseAbstractX;
import com.br.converter.parsing.pre_textual.ParseAgradecimentos;
import com.br.converter.parsing.pre_textual.ParseCapa;
import com.br.converter.parsing.pre_textual.ParseDedicatoria;
import com.br.converter.parsing.pre_textual.ParseEpigrafe;
import com.br.converter.parsing.pre_textual.ParseFichaCatalografica;
import com.br.converter.parsing.pre_textual.ParseFolhaDeRosto;
import com.br.converter.parsing.pre_textual.ParseResumo;
import com.br.models.Documento;

public class DocumentParser {
	private ParseDocument parseDocument = new ParseDocument();
	private ParseAbstractX parseAbstractX = new ParseAbstractX();
	private ParseAgradecimentos parseAgradecimentos = new ParseAgradecimentos();
	private ParseCapa parseCapa = new ParseCapa();
	private ParseDedicatoria parseDedicatoria = new ParseDedicatoria();
	private ParseEpigrafe parseEpigrafe = new ParseEpigrafe();
	private ParseFichaCatalografica parseFichaCatalografica = new ParseFichaCatalografica();
	private ParseFolhaDeRosto parseFolhaDeRosto = new ParseFolhaDeRosto();
	private ParseResumo parseResumo = new ParseResumo();
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseDocument(File file, Documento document) {
		this.parseDocument.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseAbstractX(File file, Documento document) {
		this.parseAbstractX.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseAgradecimentos(File file, Documento document) {
		this.parseAgradecimentos.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseCapa(File file, Documento document) {
		this.parseCapa.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseDedicatoria(File file, Documento document) {
		this.parseDedicatoria.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseEpigrafe(File file, Documento document) {
		this.parseEpigrafe.parse(file, document);
	}
	

	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseFichaCatalografica(File file, Documento document) {
		this.parseFichaCatalografica.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseFolhaDeRosto(File file, Documento document) {
		this.parseFolhaDeRosto.parse(file, document);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseResumo(File file, Documento document) {
		this.parseResumo.parse(file, document);
	}
	
}
