package com.br.converter.models;

import java.util.List;

import com.br.converter.models.data.Particao;

public class Documento {
	private Long id;
	private String titulo;
	private String subTitulo;
	private String title;
	private int ano;
	private String nivelEscolar;
	private String tipo;
	
	private String nomeCidade;
	private String nomeCurso;
	private String nomeInstituicao;
	private String siglaInstituicao;
	private String tituloAcademico;
	private String preAmbulo;
	private String fichaCatalografica;
	private String dedicatoria;
	private String epigrafe;
	private String resumo;
	private String abstractX;
	private String agradecimentos;
	
	private List<Particao> particoes;
	private List<Citacao> citacoes;
	private List<Palavra> palavras;
	private List<Pessoa> pessoas;
	
	public Documento() {
	
	}
	
	public Documento(Long id, String titulo, String subTitulo, String title, int ano, String nivelEscolar, String tipo,
			String nomeCidade, String nomeCurso, String nomeInstituicao, String siglaInstituicao, String tituloAcademico, 
			String preAmbulo, String fichaCatalografica, String dedicatoria, String epigrafe, String resumo, String abstractX, 
			String agradecimentos, List<Particao> particoes, List<Citacao> citacoes, List<Palavra> palavras, List<Pessoa> pessoas) {
		this.id = id;
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.title = title;
		this.ano = ano;
		this.nivelEscolar = nivelEscolar;
		this.tipo = tipo;
		this.nomeCidade = nomeCidade;
		this.nomeCurso = nomeCurso;
		this.nomeInstituicao = nomeInstituicao;
		this.siglaInstituicao = siglaInstituicao;
		this.tituloAcademico = tituloAcademico;
		this.preAmbulo = preAmbulo;
		this.fichaCatalografica = fichaCatalografica;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.resumo = resumo;
		this.abstractX = abstractX;
		this.agradecimentos = agradecimentos;
		this.particoes = particoes;
		this.citacoes = citacoes;
		this.palavras = palavras;
		this.pessoas = pessoas;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	
	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
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
	
	public String getTituloAcademico() {
		return tituloAcademico;
	}
	
	public void setTituloAcademico(String tituloAcademico) {
		this.tituloAcademico = tituloAcademico;
	}
	
	public String getPreAmbulo() {
		return preAmbulo;
	}
	
	public void setPreAmbulo(String preAmbulo) {
		this.preAmbulo = preAmbulo;
	}
	
	public String getFichaCatalografica() {
		return fichaCatalografica;
	}
	
	public void setFichaCatalografica(String fichaCatalografica) {
		this.fichaCatalografica = fichaCatalografica;
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
	
	public String getResumo() {
		return resumo;
	}
	
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public String getAbstractX() {
		return abstractX;
	}
	
	public void setAbstractX(String abstractX) {
		this.abstractX = abstractX;
	}
	
	public String getAgradecimentos() {
		return agradecimentos;
	}
	
	public void setAgradecimentos(String agradecimentos) {
		this.agradecimentos = agradecimentos;
	}	
	
	public List<Particao> getParticoes() {
		return particoes;
	}
	
	public void setParticoes(List<Particao> particoes) {
		this.particoes = particoes;
	}
	
	public List<Citacao> getCitacoes() {
		return citacoes;
	}
	
	public void setCitacoes(List<Citacao> citacoes) {
		this.citacoes = citacoes;
	}
	
	public List<Palavra> getPalavras() {
		return palavras;
	}
	
	public void setPalavras(List<Palavra> palavras) {
		this.palavras = palavras;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
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
		Documento other = (Documento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
