package com.br.models.enums;

public enum NivelEscolar {
	TECNICO(0, "Nível Técnico"),
	SUPERIOR(1, "Nível Superior"),
	POS_GRADUCAO(2, "Nível de Pós-graduação"),
	MESTRADO(3, "Nível de Mestrado"),
	DOUTORADO(4, "Nível de Doutorado");
	
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
