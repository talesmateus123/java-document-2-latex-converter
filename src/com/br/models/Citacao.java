package com.br.models;

import java.util.List;

public class Citacao {
	private Long id;
	private String identificador;
	private String tipoCitacao;
	private Integer pagina;
	
	private List<Autor> autores;
	
	private Integer ano;
	private String link;
	
	private Documento documento;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getTipoCitacao() {
		return tipoCitacao;
	}
	
	public void setTipoCitacao(String tipoCitacao) {
		this.tipoCitacao = tipoCitacao;
	}
	
	public Integer getPagina() {
		return pagina;
	}
	
	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public Documento getDocumento() {
		return documento;
	}
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
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
		Citacao other = (Citacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
