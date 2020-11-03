package com.br.models.pre_textual;

import java.util.ArrayList;
import java.util.List;

public class ElementosPreTextuais {
	private Long id;
	private Resumo abstractX;
	private String agradecimentos;
	private String dedicatoria;
	private String epigrafe;
	private List<String> fichaCatalograficaPalavrasChave;
	private String preAmbulo;
	private Resumo resumo;
	// Lista em HTML com índices
	private String listaSiglas;
	// Lista em HTML com índices
	private String listaSimbolos;
	
	/*
	% Ficha Catalográfica
	!\include{elementos/pre-textuais/ficha-catalografica}!

	% Folha de Aprovação
	!\include{elementos/pre-textuais/folha-aprovacao}!

	% Dedicatória
	!\include{elementos/pre-textuais/dedicatoria}!

	% Agradecimentos
	!\include{elementos/pre-textuais/agradecimentos}!

	% Epígrafe
	!\include{elementos/pre-textuais/epigrafe}!

	%obrigatorio
	% Resumo em Português
	\include{elementos/pre-textuais/resumo}
	%obrigatorio
	% Resumo em Inglês
	\include{elementos/pre-textuais/abstract}

	% Lista de Figuras
	!\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-figuras}!

	% Lista de Quadros
	!\include{elementos/pre-textuais/listas/listas-ilustracoes/lista-quadros}!

	% Lista de Tabelas
	!\include{elementos/pre-textuais/listas/lista-tabelas}!

	% Lista de Abreviaturas e Siglas
	!\include{elementos/pre-textuais/listas/lista-siglas}!

	% Lista de Símbolos
	!\include{elementos/pre-textuais/listas/lista-simbolos}!

	% Lista de Algoritmos
	!\include{elementos/pre-textuais/listas/listas-diversas/lista-algoritmos}!

	% Sumário
	\include{elementos/pre-textuais/sumario}
	 */

	public ElementosPreTextuais() {
		this.fichaCatalograficaPalavrasChave = new ArrayList<String>();
	}

	public ElementosPreTextuais(Long id, Resumo abstractX, String agradecimentos, String dedicatoria, String epigrafe,
			List<String> fichaCatalograficaPalavrasChave, String preAmbulo, Resumo resumo, String listaSiglas, String listaSimbolos) {
		this.id = id;
		this.abstractX = abstractX;
		this.agradecimentos = agradecimentos;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.fichaCatalograficaPalavrasChave = fichaCatalograficaPalavrasChave != null ? fichaCatalograficaPalavrasChave : new ArrayList<String>();
		this.preAmbulo = preAmbulo;
		this.resumo = resumo;
		this.listaSiglas = listaSiglas;
		this.listaSimbolos = listaSimbolos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Resumo getAbstractX() {
		return abstractX;
	}

	public void setAbstractX(Resumo abstractX) {
		this.abstractX = abstractX;
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
		this.fichaCatalograficaPalavrasChave = fichaCatalograficaPalavrasChave;
	}

	public String getPreAmbulo() {
		return preAmbulo;
	}

	public void setPreAmbulo(String preAmbulo) {
		this.preAmbulo = preAmbulo;
	}

	public Resumo getResumo() {
		return resumo;
	}

	public void setResumo(Resumo resumo) {
		this.resumo = resumo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementosPreTextuais other = (ElementosPreTextuais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
