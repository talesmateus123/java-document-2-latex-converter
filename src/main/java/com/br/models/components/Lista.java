package com.br.models.components;

public class Lista extends Component {
	private String indicador;
	private String texto;
	
	public Lista() {
		super();
	}
	
	public Lista(String identificador, String indicador, String texto) {
		super(identificador);
		this.indicador = indicador;
		this.texto = texto;
	}
	
	public String getIndicador() {
		return indicador;
	}
	
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
