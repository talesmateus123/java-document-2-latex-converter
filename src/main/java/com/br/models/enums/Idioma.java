package com.br.models.enums;

public enum Idioma {
	PORTUGUES(0),
	INGLES(1);
	
	private Integer cod;
	
	private Idioma(int cod) {
		this.cod = cod;
	}

	public Integer getCod() {
		return cod;
	}
	
	/**
	 * Converte o código passado por parâmetro em um Enum do tipo "TipoPessoa"
	 * @param Integer 
	 * @return TipoPessoa
	 */
	public static Idioma toEnum(Integer cod) {
		if (cod == null )
			return null;
		
		for (Idioma type : Idioma.values()) {
			if (cod == type.getCod()) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("Invalid ID: " + cod + ".");
	}
	
}
