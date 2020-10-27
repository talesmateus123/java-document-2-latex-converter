package com.br.models;

public class ElementosPreTextuais {
	private Long id;
	private String preAmbulo;
	private FichaCatalografica fichaCatalografica;
	private String dedicatoria;
	private String epigrafe;
	private Resumo resumo;
	private Resumo abstractX;

	public ElementosPreTextuais() {
		
	}
	
	public ElementosPreTextuais(Long id, String preAmbulo, FichaCatalografica fichaCatalografica, String dedicatoria,
			String epigrafe, Resumo resumo, Resumo abstractX) {
		this.id = id;
		this.preAmbulo = preAmbulo;
		this.fichaCatalografica = fichaCatalografica;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.resumo = resumo;
		this.abstractX = abstractX;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPreAmbulo() {
		return preAmbulo;
	}

	public void setPreAmbulo(String preAmbulo) {
		this.preAmbulo = preAmbulo;
	}

	public FichaCatalografica getFichaCatalografica() {
		return fichaCatalografica;
	}

	public void setFichaCatalografica(FichaCatalografica fichaCatalografica) {
		this.fichaCatalografica = fichaCatalografica;
	}

	public String getDedicatoria() {
		return dedicatoria;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public String getEpigrafe() {
		return epigrafe;
	}

	public void setEpigrafe(String epigrafe) {
		this.epigrafe = epigrafe;
	}

	public Resumo getResumo() {
		return resumo;
	}

	public void setResumo(Resumo resumo) {
		this.resumo = resumo;
	}

	public Resumo getAbstractX() {
		return abstractX;
	}

	public void setAbstractX(Resumo abstractX) {
		this.abstractX = abstractX;
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
		ElementosPreTextuais other = (ElementosPreTextuais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
