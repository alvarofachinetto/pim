package br.com.cdems.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdems.model.Cliente;
import br.com.cdems.model.Conta;
import br.com.cdems.model.PerfilConta;
import br.com.cdems.model.TipoConta;
import br.com.cdems.repository.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	private PerfilContaService perfilContaService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Transactional
	public Conta criarConta(String cpfnpj) {
		Conta conta = null;
		Integer numeroConta = (int) (100000 + (Math.random() * 999999)); 
		
		PerfilConta perfilConta = perfilContaService.obterPerfilConta(1);
		Cliente cliente = clienteService.buscarCliente(cpfnpj);
		
		if(cliente.getCpfcnpj().length() > 11)
			conta = new Conta(TipoConta.PJ, numeroConta, LocalDate.now(), null,  perfilConta, cliente);
		else
			conta = new Conta(TipoConta.PF, numeroConta, LocalDate.now(), null, perfilConta, cliente);
		
		return contaRepository.save(conta);
	}
	
	
	
	
}
