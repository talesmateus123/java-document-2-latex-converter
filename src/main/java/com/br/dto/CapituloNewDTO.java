package com.br.dto;

import javax.validation.constraints.NotEmpty;

public class CapituloNewDTO {
	
	@NotEmpty
	private String titulo;
	private String body;
	private boolean unlisted = false;

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
	
}
