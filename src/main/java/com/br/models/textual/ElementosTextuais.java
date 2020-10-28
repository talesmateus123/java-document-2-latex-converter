package com.br.models.textual;

import java.util.ArrayList;
import java.util.List;

import com.br.models.Capitulo;

public class ElementosTextuais {
	private Long id;
	private List<Capitulo> capitulos;

	public ElementosTextuais() {
		this.capitulos = new ArrayList<Capitulo>();
	}

	public ElementosTextuais(Long id, List<Capitulo> capitulos) {
		this.id = id;
		this.capitulos = capitulos != null ? capitulos : new ArrayList<Capitulo>();
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
		ElementosTextuais other = (ElementosTextuais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
