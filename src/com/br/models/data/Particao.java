package com.br.models.data;

import java.util.List;

import com.br.models.Documento;

public class Particao{
	private Long id;
	private String tipoParticao;
	private String titulo;
	private String conteudo;
	
	private Documento documento;
	
	private List<Dado> dados;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoParticao() {
		return tipoParticao;
	}

	public void setTipoParticao(String tipoParticao) {
		this.tipoParticao = tipoParticao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public List<Dado> getDados() {
		return dados;
	}

	public void setDados(List<Dado> dados) {
		this.dados = dados;
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
		Particao other = (Particao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
