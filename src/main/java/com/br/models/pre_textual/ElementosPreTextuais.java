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
	
	private boolean enabledAgradecimentos;
	private boolean enabledDedicatoria;
	private boolean enabledEpigrafe;
	private boolean enabledFichaCatalografica;
	private boolean enabledListaSiglas;
	private boolean enabledListaSimbolos;
	private boolean enabledListaTabelas;
	private boolean enabledListaAlgoritmos;
	private boolean enabledListaFiguras;
	private boolean enabledListaQuadros;

	public ElementosPreTextuais() {
		this.abstractX = new Resumo();
		this.fichaCatalograficaPalavrasChave = new ArrayList<String>();
		this.resumo = new Resumo();
		this.enabledAgradecimentos = true;
		this.enabledDedicatoria = true;
		this.enabledEpigrafe = true;
		this.enabledFichaCatalografica = true;
		this.enabledListaSiglas = true;
		this.enabledListaSimbolos = true;
		this.enabledListaTabelas = true;
		this.enabledListaAlgoritmos = true;
		this.enabledListaFiguras = true;
		this.enabledListaQuadros = true;
	}

	public ElementosPreTextuais(Long id, Resumo abstractX, String agradecimentos, String dedicatoria, String epigrafe,
			List<String> fichaCatalograficaPalavrasChave, String preAmbulo, Resumo resumo, String listaSiglas, String listaSimbolos) {
		this.id = id;
		this.abstractX = abstractX != null ? abstractX : new Resumo();
		this.agradecimentos = agradecimentos;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.fichaCatalograficaPalavrasChave = fichaCatalograficaPalavrasChave != null ? fichaCatalograficaPalavrasChave : new ArrayList<String>();
		this.preAmbulo = preAmbulo;
		this.resumo = resumo != null ? resumo : new Resumo();
		this.listaSiglas = listaSiglas;
		this.listaSimbolos = listaSimbolos;
		this.enabledAgradecimentos = true;
		this.enabledDedicatoria = true;
		this.enabledEpigrafe = true;
		this.enabledFichaCatalografica = true;
		this.enabledListaSiglas = true;
		this.enabledListaSimbolos = true;
		this.enabledListaTabelas = true;
		this.enabledListaAlgoritmos = true;
		this.enabledListaFiguras = true;
		this.enabledListaQuadros = true;
	}
	
	public ElementosPreTextuais(Long id, Resumo abstractX, String agradecimentos, String dedicatoria, String epigrafe,
			List<String> fichaCatalograficaPalavrasChave, String preAmbulo, Resumo resumo, String listaSiglas,
			String listaSimbolos, boolean enabledAgradecimentos, boolean enabledDedicatoria, boolean enabledEpigrafe,
			boolean enabledFichaCatalografica, boolean enabledListaSiglas, boolean enabledListaSimbolos,
			boolean enabledListaTabelas, boolean enabledListaAlgoritmos, boolean enabledListaFiguras,
			boolean enabledListaQuadros) {
		this.id = id;
		this.abstractX = abstractX != null ? abstractX : new Resumo();
		this.agradecimentos = agradecimentos;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.fichaCatalograficaPalavrasChave = fichaCatalograficaPalavrasChave != null ? fichaCatalograficaPalavrasChave : new ArrayList<String>();
		this.preAmbulo = preAmbulo;
		this.resumo = resumo != null ? resumo : new Resumo();
		this.listaSiglas = listaSiglas;
		this.listaSimbolos = listaSimbolos;
		this.enabledAgradecimentos = enabledAgradecimentos;
		this.enabledDedicatoria = enabledDedicatoria;
		this.enabledEpigrafe = enabledEpigrafe;
		this.enabledFichaCatalografica = enabledFichaCatalografica;
		this.enabledListaSiglas = enabledListaSiglas;
		this.enabledListaSimbolos = enabledListaSimbolos;
		this.enabledListaTabelas = enabledListaTabelas;
		this.enabledListaAlgoritmos = enabledListaAlgoritmos;
		this.enabledListaFiguras = enabledListaFiguras;
		this.enabledListaQuadros = enabledListaQuadros;
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
