package br.com.cdems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cdems.model.PerfilConta;

@Repository
public interface PerfilContaRepository extends CrudRepository<PerfilConta, Integer>{

}
