package com.br.models.components;

public abstract class Component {
	private String identificador;

	public Component() {
		
	}

	public Component(String identificador) {
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
}
