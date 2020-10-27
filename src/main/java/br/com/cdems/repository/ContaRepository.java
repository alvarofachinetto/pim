package br.com.cdems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cdems.model.Conta;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Integer>{

}
