package com.br.models.enums;

public enum TituloAcademico {
	BACHAREL(0, "Bacharel"),
	TECNOLOGO(1, "Tecnólogo"),
	MESTRE(2, "Mestre"),
	DOUTOR(3, "Doutor");
	
	private Integer cod;
	private String description;
	
	private TituloAcademico(int cod, String description) {
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
	public static TituloAcademico toEnum(Integer cod) {
		if (cod == null )
			return null;
		
		for (TituloAcademico type : TituloAcademico.values()) {
			if (cod == type.getCod()) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("Invalid ID: " + cod + ".");
	}

}
