package com.br.models.pre_textual;

import com.br.models.enums.NivelEscolar;

public class Curso {
	private Long id;
	private String nome;
	private Integer nivelEscolar;
	
	public Curso() {
		
	}
	
	public Curso(Long id, String nome, NivelEscolar nivelEscolar) {
		this.id = id;
		this.nome = nome;
		this.nivelEscolar = nivelEscolar != null ? nivelEscolar.getCod() : null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelEscolar getNivelEscolar() {
		return NivelEscolar.toEnum(nivelEscolar);
	}

	public void setNivelEscolar(NivelEscolar nivelEscolar) {
		this.nivelEscolar = nivelEscolar.getCod();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
