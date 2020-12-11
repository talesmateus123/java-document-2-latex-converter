package com.br.dto;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.br.models.enums.NivelEscolar;
import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;

public class DocumentoNewDTO {
	
	// Atributos do documento
	@NotEmpty
	private String titulo;
	private String subTitulo;
	@NotEmpty
	private String title;
	
	// Autor
	@NotEmpty
	private String nomeAutor;

	@NotEmpty
	private String nomeCidade;
	@NotNull
	private Year ano;
	private LocalDate dataAprovacao;
	@NotNull
	private Integer tipoTrabalho;
	private Integer tituloAcademico;
	private String areaConcentracao;
	private String linhaPesquisa;

	@NotEmpty
	@Size(min = 1)
	private String nomeInstituicao;
	@NotEmpty
	private String siglaInstituicao;
	@NotEmpty
	private String campusInstituicao;
	private String departamentoInstituicao;

	// Curso
	@NotEmpty
	private String nomeCurso;
	@NotNull
	private Integer nivelEscolarCurso;

	// Orientador
	private String nomeOrientador;
	
	// Coorientador
	private String nomeCoorientador;

	// Elementos pré textuais
	
	// Abstract
	private String textoAbstractX;
	private List<String> palavrasChaveAbstractX = new ArrayList<String>();
	
	private String agradecimentos;
	private String dedicatoria;
	private String epigrafe;
	private List<String> fichaCatalograficaPalavrasChave = new ArrayList<String>();
	private String preAmbulo;
	
	// Resumo
	private String textoResumo;
	private List<String> palavrasChaveResumo = new ArrayList<String>();
	
	// Lista em HTML com índices
	private String listaSiglas;
	// Lista em HTML com índices
	private String listaSimbolos;
	
	// Opções para os elementos pre textuais
	private boolean enabledAgradecimentos = true;
	private boolean enabledDedicatoria = true;
	private boolean enabledEpigrafe = true;
	private boolean enabledFichaCatalografica = true;
	private boolean enabledListaSiglas = true;
	private boolean enabledListaSimbolos = true;
	private boolean enabledListaTabelas = true;
	private boolean enabledListaAlgoritmos = true;
	private boolean enabledListaFiguras = true;
	private boolean enabledListaQuadros = true;

	// Elementos textuais
	private List<CapituloNewDTO> capitulos = new ArrayList<CapituloNewDTO>();

	// Elementos pós textuais
	private List<CapituloNewDTO> apendices = new ArrayList<CapituloNewDTO>();
	private List<CapituloNewDTO> anexos = new ArrayList<CapituloNewDTO>();
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Year getAno() {
		return ano;
	}

	public void setAno(Year ano) {
		this.ano = ano;
	}

	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}

	public TipoTrabalho getTipoTrabalho() {
		return TipoTrabalho.toEnum(tipoTrabalho);
	}

	public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho.getCod();
	}

	public TituloAcademico getTituloAcademico() {
		return TituloAcademico.toEnum(tituloAcademico);
	}

	public void setTituloAcademico(TituloAcademico tituloAcademico) {
		this.tituloAcademico = tituloAcademico.getCod();
	}

	public String getAreaConcentracao() {
		return areaConcentracao;
	}

	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}

	public String getLinhaPesquisa() {
		return linhaPesquisa;
	}

	public void setLinhaPesquisa(String linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getSiglaInstituicao() {
		return siglaInstituicao;
	}

	public void setSiglaInstituicao(String siglaInstituicao) {
		this.siglaInstituicao = siglaInstituicao;
	}

	public String getCampusInstituicao() {
		return campusInstituicao;
	}

	public void setCampusInstituicao(String campusInstituicao) {
		this.campusInstituicao = campusInstituicao;
	}

	public String getDepartamentoInstituicao() {
		return departamentoInstituicao;
	}

	public void setDepartamentoInstituicao(String departamentoInstituicao) {
		this.departamentoInstituicao = departamentoInstituicao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public NivelEscolar getNivelEscolarCurso() {
		return NivelEscolar.toEnum(nivelEscolarCurso);
	}

	public void setNivelEscolarCurso(NivelEscolar nivelEscolarCurso) {
		this.nivelEscolarCurso = nivelEscolarCurso.getCod();
	}

	public String getNomeOrientador() {
		return nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

	public String getNomeCoorientador() {
		return nomeCoorientador;
	}

	public void setNomeCoorientador(String nomeCoorientador_1) {
		this.nomeCoorientador = nomeCoorientador_1;
	}

	public String getTextoAbstractX() {
		return textoAbstractX;
	}

	public void setTextoAbstractX(String textoAbstractX) {
		this.textoAbstractX = textoAbstractX;
	}

	public List<String> getPalavrasChaveAbstractX() {
		return palavrasChaveAbstractX;
	}

	public void setPalavrasChaveAbstractX(List<String> palavrasChaveAbstractX) {
		this.palavrasChaveAbstractX = palavrasChaveAbstractX != null ? palavrasChaveAbstractX : new ArrayList<String>();
	}

	public String getAgradecimentos() {
		return agradecimentos;
	}

	public void setAgradecimentos(String agradecimentos) {
		this.agradecimentos = agradecimentos;
	}

	public String getDedicatoria() {
		return dedicatoria;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public String getEpigrafe() {
		return epigrafe;
	}

	public void setEpigrafe(String epigrafe) {
		this.epigrafe = epigrafe;
	}

	public List<String> getFichaCatalograficaPalavrasChave() {
		return fichaCatalograficaPalavrasChave;
	}

	public void setFichaCatalograficaPalavrasChave(List<String> fichaCatalograficaPalavrasChave) {
		this.fichaCatalograficaPalavrasChave = fichaCatalograficaPalavrasChave != null ? fichaCatalograficaPalavrasChave : new ArrayList<String>();
	}

	public String getPreAmbulo() {
		return preAmbulo;
	}

	public void setPreAmbulo(String preAmbulo) {
		this.preAmbulo = preAmbulo;
	}

	public String getTextoResumo() {
		return textoResumo;
	}

	public void setTextoResumo(String textoResumo) {
		this.textoResumo = textoResumo;
	}

	public List<String> getPalavrasChaveResumo() {
		return palavrasChaveResumo;
	}

	public void setPalavrasChaveResumo(List<String> palavrasChaveResumo) {
		this.palavrasChaveResumo = palavrasChaveResumo != null ? palavrasChaveResumo : new ArrayList<String>();
	}

	public String getListaSiglas() {
		return listaSiglas;
	}

	public void setListaSiglas(String listaSiglas) {
		this.listaSiglas = listaSiglas;
	}

	public String getListaSimbolos() {
		return listaSimbolos;
	}

	public void setListaSimbolos(String listaSimbolos) {
		this.listaSimbolos = listaSimbolos;
	}

	public boolean isEnabledAgradecimentos() {
		return enabledAgradecimentos;
	}

	public void setEnabledAgradecimentos(boolean enabledAgradecimentos) {
		this.enabledAgradecimentos = enabledAgradecimentos;
	}

	public boolean isEnabledDedicatoria() {
		return enabledDedicatoria;
	}

	public void setEnabledDedicatoria(boolean enabledDedicatoria) {
		this.enabledDedicatoria = enabledDedicatoria;
	}

	public boolean isEnabledEpigrafe() {
		return enabledEpigrafe;
	}

	public void setEnabledEpigrafe(boolean enabledEpigrafe) {
		this.enabledEpigrafe = enabledEpigrafe;
	}

	public boolean isEnabledFichaCatalografica() {
		return enabledFichaCatalografica;
	}

	public void setEnabledFichaCatalografica(boolean enabledFichaCatalografica) {
		this.enabledFichaCatalografica = enabledFichaCatalografica;
	}

	public boolean isEnabledListaSiglas() {
		return enabledListaSiglas;
	}

	public void setEnabledListaSiglas(boolean enabledListaSiglas) {
		this.enabledListaSiglas = enabledListaSiglas;
	}

	public boolean isEnabledListaSimbolos() {
		return enabledListaSimbolos;
	}

	public void setEnabledListaSimbolos(boolean enabledListaSimbolos) {
		this.enabledListaSimbolos = enabledListaSimbolos;
	}

	public boolean isEnabledListaTabelas() {
		return enabledListaTabelas;
	}

	public void setEnabledListaTabelas(boolean enabledListaTabelas) {
		this.enabledListaTabelas = enabledListaTabelas;
	}

	public boolean isEnabledListaAlgoritmos() {
		return enabledListaAlgoritmos;
	}

	public void setEnabledListaAlgoritmos(boolean enabledListaAlgoritmos) {
		this.enabledListaAlgoritmos = enabledListaAlgoritmos;
	}

	public boolean isEnabledListaFiguras() {
		return enabledListaFiguras;
	}

	public void setEnabledListaFiguras(boolean enabledListaFiguras) {
		this.enabledListaFiguras = enabledListaFiguras;
	}

	public boolean isEnabledListaQuadros() {
		return enabledListaQuadros;
	}

	public void setEnabledListaQuadros(boolean enabledListaQuadros) {
		this.enabledListaQuadros = enabledListaQuadros;
	}

	public List<CapituloNewDTO> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<CapituloNewDTO> capitulos) {
		this.capitulos = capitulos != null ? capitulos : new ArrayList<CapituloNewDTO>();
	}

	public List<CapituloNewDTO> getApendices() {
		return apendices;
	}

	public void setApendices(List<CapituloNewDTO> apendices) {
		this.apendices = apendices != null ? apendices : new ArrayList<CapituloNewDTO>();
	}

	public List<CapituloNewDTO> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<CapituloNewDTO> anexos) {
		this.anexos = anexos != null ? anexos : new ArrayList<CapituloNewDTO>();
	}

}