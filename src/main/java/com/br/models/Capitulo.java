package com.br.models;

public class Capitulo {
	private Long id;
	private String titulo;
	private String body;
	private boolean unlisted;
	
	public Capitulo() {
		this.unlisted = false;
	}
	
	public Capitulo(Long id, String titulo, String body) {
		this.id = id;
		this.titulo = titulo;
		this.body = body;
		this.unlisted = false;
	}

	public Capitulo(Long id, String titulo, String body, boolean unlisted) {
		this.id = id;
		this.titulo = titulo;
		this.body = body;
		this.unlisted = unlisted;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isUnlisted() {
		return unlisted;
	}

	public void setUnlisted(boolean unlisted) {
		this.unlisted = unlisted;
	}
	
	public String getLabel() {
		return this.titulo.toLowerCase().replace(" ", "_");
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
		Capitulo other = (Capitulo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
