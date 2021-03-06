package br.com.cdems.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;

@Embeddable
public class Contato {
	
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipoTel;
	
	@NotEmpty
	@Column(length = 10, nullable = false)
	private String telefone;
	
	@NotEmpty
	@Column(length = 11, nullable = false)
	private String celular;
	
	
	public Contato() {}

	public Contato(TipoTelefone tipoTel, String telefone,
			String celular) {
		super();
		this.tipoTel = tipoTel;
		this.telefone = telefone;
		this.celular = celular;
	}


	public TipoTelefone getTipoTel() {
		return tipoTel;
	}

	public String getTelefone() {
		return telefone;
	}


	public String getCelular() {
		return celular;
	}

	public void setTipoTel(TipoTelefone tipoTel) {
		this.tipoTel = tipoTel;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
		
}
