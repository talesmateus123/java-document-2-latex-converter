package com.br.converter;

import java.io.File;

import com.br.converter.parsing.ParseAbstractX;
import com.br.converter.parsing.ParseAgradecimentos;
import com.br.converter.parsing.ParseCapa;
import com.br.converter.parsing.ParseDedicatoria;
import com.br.converter.parsing.ParseEpigrafe;
import com.br.converter.parsing.ParseResumo;
import com.br.models.Documento;

public class DocumentParser {
	private ParseAbstractX parseAbstractX = new ParseAbstractX();
	private ParseAgradecimentos parseAgradecimentos = new ParseAgradecimentos();
	private ParseCapa parseCapa = new ParseCapa();
	private ParseDedicatoria parseDedicatoria = new ParseDedicatoria();
	private ParseEpigrafe parseEpigrafe = new ParseEpigrafe();
	private ParseResumo parseResumo = new ParseResumo();
	
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
	public void parseResumo(File file, Documento document) {
		this.parseResumo.parse(file, document);
	}
	
}
