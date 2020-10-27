package br.com.cdems.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@Enumerated(EnumType.STRING)
	private TipoConta tipoConta;
	
	@NotNull
	@Column(nullable = false, unique = true)
	private Integer numeroConta;
	
	@NotNull
	@Column(nullable = false)
	private LocalDate abertura;
	
	@NotNull
	@Column(nullable = true)
	private LocalDate encerramento;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private PerfilConta perfilConta;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Cliente cliente;

	public Conta() {
		
	}

	public Conta(TipoConta tipoConta, Integer numeroConta, LocalDate abertura, LocalDate encerramento,
			PerfilConta perfilConta, Cliente cliente) {
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.abertura = abertura;
		this.encerramento = encerramento;
		this.perfilConta = perfilConta;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public LocalDate getAbertura() {
		return abertura;
	}

	public LocalDate getEncerramento() {
		return encerramento;
	}

	public PerfilConta getPerfilConta() {
		return perfilConta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
	
}
