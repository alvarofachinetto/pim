package br.com.cdems.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoricoMoeda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idMoeda;
	
	private String nome;
	
	private LocalDate dtMovMoeda;
	
	private BigDecimal puMoeda;

	public Integer getIdMoeda() {
		return idMoeda;
	}

	public void setIdMoeda(Integer idMoeda) {
		this.idMoeda = idMoeda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtMovMoeda() {
		return dtMovMoeda;
	}

	public void setDtMovMoeda(LocalDate dtMovMoeda) {
		this.dtMovMoeda = dtMovMoeda;
	}

	public BigDecimal getPuMoeda() {
		return puMoeda;
	}

	public void setPuMoeda(BigDecimal puMoeda) {
		this.puMoeda = puMoeda;
	}
	
}
