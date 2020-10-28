package com.br.models.enums;

public enum TipoTrabalho {
	TCC(0, "Trabalho de Conclusão de Curso"),
	DISSERTACAO(1, "Dissertação"),
	TESE(2, "Tese"),
	PROJETO_QUALIFICACAO(3, "Projeto de Qualificação");
	
	private Integer cod;
	private String description;
	
	private TipoTrabalho(int cod, String description) {
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
	public static TipoTrabalho toEnum(Integer cod) {
		if (cod == null )
			return null;
		
		for (TipoTrabalho type : TipoTrabalho.values()) {
			if (cod == type.getCod()) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("Invalid ID: " + cod + ".");
	}
	
}
