package com.br.models.pre_textual;

import com.br.models.Documento;
import com.br.models.enums.TipoPessoa;

public class Pessoa {
	private Long id;
	private String nome;
	private String sobrenome;
	private Integer tipoPessoa;
	
	private Documento documento;
	
	public Pessoa() {
		
	}

	public Pessoa(Long id, String nome, String sobrenome, TipoPessoa tipoPessoa, Documento documento) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoPessoa = tipoPessoa != null ? tipoPessoa.getCod() : null;
		this.documento = documento;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public TipoPessoa getTipoPessoa() {
		return TipoPessoa.toEnum(tipoPessoa);
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa.getCod();
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public String getNomeCompleto() {
		if (this.nome != null && this.sobrenome != null)
			return this.nome + " " + this.sobrenome;
		else if (this.nome != null)
			return this.nome;
		return "";
	}
	
	public String getCitacao() {
		return this.sobrenome.toUpperCase() + ", " + this.nome;
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
