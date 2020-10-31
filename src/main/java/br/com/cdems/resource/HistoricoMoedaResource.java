package br.com.cdems.resource;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdems.model.HistoricoMoeda;
import br.com.cdems.service.HistoricoMoedaService;

@RestController
@RequestMapping("/moedas")
public class HistoricoMoedaResource {
	
	@Autowired
	private HistoricoMoedaService historicoMoedaService; 
	
	@GetMapping
	public ResponseEntity<List<HistoricoMoeda>> listarHistoricoMoedasPor(@RequestParam(name = "nome", required = false) String nome, 
			@RequestParam(name = "dtMovMoeda", required = false) String dtMovMoeda){
		
		return ResponseEntity.ok().body(historicoMoedaService.listarHistoricoMoedas(nome, LocalDate.parse(dtMovMoeda)));
	}
}
