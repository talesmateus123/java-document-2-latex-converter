package com.br.models;

import java.time.LocalDate;

import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;

public class Documento {
	private Long id;
	private String titulo;
	private String subTitulo;
	private String title;
	private Pessoa autor;
	private String nomeCidade;
	private LocalDate data;
	private Integer tipoTrabalho;
	private Integer tituloAcademico;
	private String areaConcentracao;
	private String linhaPesquisa;
	private Instituicao instituicao;
	private Curso curso;
	private Pessoa orientador;
	private Pessoa coorientador;
	private boolean aprovado;
	
	private ElementosPreTextuais elementosPreTextuais;
	private ElementosTextuais elementosTextuais;
	private ElementosPosTextuais elementosPosTextuais;
	
	public Documento() {
	
	}
	
	public Documento(Long id, String titulo, String subTitulo, String title, Pessoa autor, String nomeCidade,
			LocalDate data, TipoTrabalho tipoTrabalho, TituloAcademico tituloAcademico, String areaConcentracao, String linhaPesquisa,
			Instituicao instituicao, Curso curso, Pessoa orientador, Pessoa coorientador, boolean aprovado,
			ElementosPreTextuais elementosPreTextuais, ElementosTextuais elementosTextuais, ElementosPosTextuais elementosPosTextuais) {
		this.id = id;
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.title = title;
		this.autor = autor;
		this.nomeCidade = nomeCidade;
		this.data = data;
		this.tipoTrabalho = tipoTrabalho != null ? tipoTrabalho.getCod() : null;
		this.tituloAcademico = tituloAcademico != null ? tituloAcademico.getCod() : null;
		this.areaConcentracao = areaConcentracao;
		this.linhaPesquisa = linhaPesquisa;
		this.instituicao = instituicao;
		this.curso = curso;
		this.orientador = orientador;
		this.coorientador = coorientador;
		this.aprovado = aprovado;
		this.elementosPreTextuais = elementosPreTextuais;
		this.elementosTextuais = elementosTextuais;
		this.elementosPosTextuais = elementosPosTextuais;
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

	public Pessoa getAutor() {
		return autor;
	}

	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public LocalDate getAno() {
		return data;
	}

	public void setAno(LocalDate data) {
		this.data = data;
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

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Pessoa getOrientador() {
		return orientador;
	}

	public void setOrientador(Pessoa orientador) {
		this.orientador = orientador;
	}

	public Pessoa getCoorientador() {
		return coorientador;
	}

	public void setCoorientador(Pessoa coorientador) {
		this.coorientador = coorientador;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public ElementosPreTextuais getElementosPreTextuais() {
		return elementosPreTextuais;
	}

	public void setElementosPreTextuais(ElementosPreTextuais elementosPreTextuais) {
		this.elementosPreTextuais = elementosPreTextuais;
	}

	public ElementosTextuais getElementosTextuais() {
		return elementosTextuais;
	}

	public void setElementosTextuais(ElementosTextuais elementosTextuais) {
		this.elementosTextuais = elementosTextuais;
	}

	public ElementosPosTextuais getElementosPosTextuais() {
		return elementosPosTextuais;
	}

	public void setElementosPosTextuais(ElementosPosTextuais elementosPosTextuais) {
		this.elementosPosTextuais = elementosPosTextuais;
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
