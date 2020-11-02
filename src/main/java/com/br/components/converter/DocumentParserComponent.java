package com.br.components.converter;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.components.parsing.ParseDocumentComponent;
import com.br.components.parsing.pos_textual.ParseElementosPosTextuaisComponent;
import com.br.components.parsing.pre_textual.ParseAbstractXComponent;
import com.br.components.parsing.pre_textual.ParseAgradecimentosComponent;
import com.br.components.parsing.pre_textual.ParseCapaComponent;
import com.br.components.parsing.pre_textual.ParseDedicatoriaComponent;
import com.br.components.parsing.pre_textual.ParseEpigrafeComponent;
import com.br.components.parsing.pre_textual.ParseFichaCatalograficaComponent;
import com.br.components.parsing.pre_textual.ParseFolhaAprovacaoComponent;
import com.br.components.parsing.pre_textual.ParseFolhaDeRostoComponent;
import com.br.components.parsing.pre_textual.ParseResumoComponent;
import com.br.components.parsing.textual.ParseElementosTextuaisComponent;
import com.br.models.Capitulo;
import com.br.models.Documento;

@Component
public class DocumentParserComponent {
	@Autowired
	private ParseDocumentComponent parseDocument;
	@Autowired
	private ParseAbstractXComponent parseAbstractX;
	@Autowired
	private ParseAgradecimentosComponent parseAgradecimentos;
	@Autowired
	private ParseCapaComponent parseCapa;
	@Autowired
	private ParseDedicatoriaComponent parseDedicatoria;
	@Autowired
	private ParseEpigrafeComponent parseEpigrafe;
	@Autowired
	private ParseFichaCatalograficaComponent parseFichaCatalografica;
	@Autowired
	private ParseFolhaAprovacaoComponent parseFolhaAprovacao;
	@Autowired
	private ParseFolhaDeRostoComponent parseFolhaDeRosto;
	@Autowired
	private ParseResumoComponent parseResumo;
	@Autowired
	private ParseElementosTextuaisComponent parseElementosTextuais;
	@Autowired
	private ParseElementosPosTextuaisComponent parseElementosPosTextuais;
	
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
	public void parseFolhaAprovacao(File file, Documento document) {
		this.parseFolhaAprovacao.parse(file, document);
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
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseElementosTextuais(File file, Capitulo capitulo) {
		this.parseElementosTextuais.parse(file, capitulo);
	}
	
	/**
	 * Esse método realiza o "parsing" entre o documento e um arquivo passados por parâmetro 
	 * 
	 * @param file
	 * @param documento
	 * @return void
	 */
	public void parseElementosPosTextuais(File file, List<Capitulo> capitulos) {
		this.parseElementosPosTextuais.parse(file, capitulos);
	}
	
}
