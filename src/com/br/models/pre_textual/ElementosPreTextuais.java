package com.br.models.pre_textual;

public class ElementosPreTextuais {
	private Long id;
	private Resumo abstractX;
	private String agradecimentos;
	private String dedicatoria;
	private String epigrafe;
	private FichaCatalografica fichaCatalografica;
	private String preAmbulo;
	private Resumo resumo;

	public ElementosPreTextuais() {
		
	}

	public ElementosPreTextuais(Long id, Resumo abstractX, String agradecimentos, String dedicatoria, String epigrafe,
			FichaCatalografica fichaCatalografica, String preAmbulo, Resumo resumo) {
		this.id = id;
		this.abstractX = abstractX;
		this.agradecimentos = agradecimentos;
		this.dedicatoria = dedicatoria;
		this.epigrafe = epigrafe;
		this.fichaCatalografica = fichaCatalografica;
		this.preAmbulo = preAmbulo;
		this.resumo = resumo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Resumo getAbstractX() {
		return abstractX;
	}

	public void setAbstractX(Resumo abstractX) {
		this.abstractX = abstractX;
	}

	public String getAgradecimentos() {
		return agradecimentos;
	}

	public void setAgradecimentos(String agradecimentos) {
		this.agradecimentos = agradecimentos;
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

	public FichaCatalografica getFichaCatalografica() {
		return fichaCatalografica;
	}

	public void setFichaCatalografica(FichaCatalografica fichaCatalografica) {
		this.fichaCatalografica = fichaCatalografica;
	}

	public String getPreAmbulo() {
		return preAmbulo;
	}

	public void setPreAmbulo(String preAmbulo) {
		this.preAmbulo = preAmbulo;
	}

	public Resumo getResumo() {
		return resumo;
	}

	public void setResumo(Resumo resumo) {
		this.resumo = resumo;
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
