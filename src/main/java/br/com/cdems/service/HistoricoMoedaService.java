package br.com.cdems.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdems.model.HistoricoMoeda;
import br.com.cdems.repository.HistoricoMoedaRepository;

@Service
public class HistoricoMoedaService {

	@Autowired
	private HistoricoMoedaRepository historicoMoedaRepository;
	
	public List<HistoricoMoeda> listarHistoricoMoedas(String nome, LocalDate dtMovMoeda){
		
		if(nome == null && dtMovMoeda == null) {
			return historicoMoedaRepository.findByNomeAndDtMovMoeda("Bitcoin", LocalDate.now());
		}else if(nome == null) {
			return historicoMoedaRepository.findByNomeAndDtMovMoeda("Bitcoin", dtMovMoeda);
		}else if(dtMovMoeda == null){
			return historicoMoedaRepository.findByNomeAndDtMovMoeda(nome, LocalDate.now());
		}
		
		return historicoMoedaRepository.findByNomeAndDtMovMoeda(nome, dtMovMoeda);
	}
	
}
