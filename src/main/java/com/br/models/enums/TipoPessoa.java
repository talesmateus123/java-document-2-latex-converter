package com.br.models.enums;

public enum TipoPessoa {
	ORIENTANDO(0),
	ORIENTADOR(1),
	COORIENTADOR(2);
	
	private Integer cod;
	
	private TipoPessoa(int cod) {
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
	public static TipoPessoa toEnum(Integer cod) {
		if (cod == null )
			return null;
		
		for (TipoPessoa type : TipoPessoa.values()) {
			if (cod == type.getCod()) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("Invalid ID: " + cod + ".");
	}
	
}
