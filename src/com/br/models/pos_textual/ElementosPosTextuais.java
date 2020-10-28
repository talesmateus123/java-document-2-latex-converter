package com.br.models.pos_textual;

import java.util.List;

import com.br.models.Capitulo;

public class ElementosPosTextuais {
	private Long id;
	private List<Capitulo> capitulos;

	public ElementosPosTextuais() {
		
	}

	public ElementosPosTextuais(Long id, List<Capitulo> capitulos) {
		this.id = id;
		this.capitulos = capitulos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
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
