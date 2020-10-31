package br.com.cdems.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cdems.model.HistoricoMoeda;

@Repository
public interface HistoricoMoedaRepository extends CrudRepository<HistoricoMoeda, Integer>{

	List<HistoricoMoeda> findByNomeAndDtMovMoeda(String nome, LocalDate dtMovMoeda);
	
}
