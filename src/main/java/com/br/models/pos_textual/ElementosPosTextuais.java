package com.br.models.pos_textual;

import java.util.ArrayList;
import java.util.List;

import com.br.models.Capitulo;

public class ElementosPosTextuais {
	private Long id;
	private List<Capitulo> apendices;
	private List<Capitulo> anexos;

	public ElementosPosTextuais() {
		this.apendices = new ArrayList<Capitulo>();
		this.anexos = new ArrayList<Capitulo>();
	}

	public ElementosPosTextuais(Long id, List<Capitulo> apendices, List<Capitulo> anexos) {
		this.id = id;
		this.apendices = apendices != null ? apendices : new ArrayList<Capitulo>();
		this.anexos = anexos != null ? anexos : new ArrayList<Capitulo>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Capitulo> getApendices() {
		return apendices;
	}

	public void setApendices(List<Capitulo> apendices) {
		this.apendices = apendices;
	}

	public List<Capitulo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Capitulo> anexos) {
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
