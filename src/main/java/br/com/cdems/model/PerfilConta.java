package br.com.cdems.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PerfilConta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 15)
	private String nome;
	
	@Column(nullable = false)
	private LocalDate dtAtivacao;
	
	@Column(nullable = true)
	private LocalDate dtInativacao;

	public PerfilConta() {
	
	}
	
	public PerfilConta(String nome, LocalDate dtAtivacao, LocalDate dtInativacao) {
		super();
		this.nome = nome;
		this.dtAtivacao = dtAtivacao;
		this.dtInativacao = dtInativacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtAtivacao() {
		return dtAtivacao;
	}

	public void setDtAtivacao(LocalDate dtAtivacao) {
		this.dtAtivacao = dtAtivacao;
	}

	public LocalDate getDtInativacao() {
		return dtInativacao;
	}

	public void setDtInativacao(LocalDate dtInativacao) {
		this.dtInativacao = dtInativacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtAtivacao == null) ? 0 : dtAtivacao.hashCode());
		result = prime * result + ((dtInativacao == null) ? 0 : dtInativacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		PerfilConta other = (PerfilConta) obj;
		if (dtAtivacao == null) {
			if (other.dtAtivacao != null)
				return false;
		} else if (!dtAtivacao.equals(other.dtAtivacao))
			return false;
		if (dtInativacao == null) {
			if (other.dtInativacao != null)
				return false;
		} else if (!dtInativacao.equals(other.dtInativacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
