package com.br.dto;

public class CapituloNewDTO {
	
	private String titulo;
	private String body;
	private boolean unlisted;
	
	public CapituloNewDTO() {
		this.unlisted = false;
	}
	
	public CapituloNewDTO(String titulo, String body) {
		this.titulo = titulo;
		this.body = body;
		this.unlisted = false;
	}

	public CapituloNewDTO(String titulo, String body, boolean unlisted) {
		this.titulo = titulo;
		this.body = body;
		this.unlisted = unlisted;
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
	
}
