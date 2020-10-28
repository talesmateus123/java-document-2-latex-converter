package com.br.models.pos_textual;

public class ElementosPosTextuais {
	private Long id;
	private Apendices apendices;
	private Anexos anexos;

	public ElementosPosTextuais() {
		
	}

	public ElementosPosTextuais(Long id, Apendices apendice, Anexos anexos) {
		this.id = id;
		this.apendices = apendice;
		this.anexos = anexos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Apendices getApendices() {
		return apendices;
	}

	public void setApendices(Apendices apendices) {
		this.apendices = apendices;
	}

	public Anexos getAnexos() {
		return anexos;
	}

	public void setAnexos(Anexos anexos) {
		this.anexos = anexos;
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
		ElementosPosTextuais other = (ElementosPosTextuais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
