package br.com.cdems.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 65, nullable = false)
	private String nome;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(nullable = false)
	private LocalDate nascimento;
	
	@Column(length = 15, nullable = false, unique = true)
	private String cpfcnpj;
	
	@Column(length = 30, nullable = false)
	private String email;
	
	@Column(length = 10, nullable = false)
	private String senha;

	@Embedded
	private Endereco endereco;

	@Embedded
	private Contato contato;
	
	
	public Cliente() {
	}

	public Cliente(String nome, LocalDate nascimento, String email, String cpfcnpj, String senha, Endereco endereco, Contato contato) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpfcnpj = cpfcnpj;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Integer getId() {
		return id;
	}


	
	
}
