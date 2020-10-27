package com.br.models.enums;

public enum NivelEscolar {
	MEDIO(0, "Médio"),
	TECNICO(1, "Técnico"),
	SUPERIOR(2, "Superior"),
	POS_GRADUCAO(3, "Pós-graduação"),
	MESTRADO(4, "Mestrado"),
	DOUTORADO(5, "Doutorado");
	
	private Integer cod;
	private String description;
	
	private NivelEscolar(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * Converte o código passado por parâmetro em um Enum do tipo "NivelEscolar"
	 * @param cod Integer 
	 * @return ArchitectureType
	 */
	public static NivelEscolar toEnum(Integer cod) {
		if (cod == null )
			return null;
		
		for (NivelEscolar type : NivelEscolar.values()) {
			if (cod == type.getCod()) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("Invalid ID: " + cod + ".");
	}	

}
