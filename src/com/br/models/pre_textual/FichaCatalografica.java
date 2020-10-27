package com.br.models.pre_textual;

import java.util.List;

public class FichaCatalografica {
	private Long id;
	private List<String> palavrasChave;
	
	public FichaCatalografica() {
		
	}
	
	public FichaCatalografica(Long id, List<String> palavrasChave) {
		this.id = id;
		this.palavrasChave = palavrasChave;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<String> getPalavrasChave() {
		return palavrasChave;
	}
	
	public void setPalavrasChave(List<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
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
		FichaCatalografica other = (FichaCatalografica) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
