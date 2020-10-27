package br.com.cdems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdems.exception.ObjetoNuloException;
import br.com.cdems.model.PerfilConta;
import br.com.cdems.repository.PerfilContaRepository;

@Service
public class PerfilContaService {

	@Autowired
	private PerfilContaRepository perfilContaRepository;
	
	
	public PerfilConta obterPerfilConta(Integer idPerfil) {
		return perfilContaRepository.findById(idPerfil)
											.orElseThrow(() -> new ObjetoNuloException("Objeto não encontrado"));
	}
}
