package br.com.cdems;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cdems.model.Cliente;
import br.com.cdems.model.Contato;
import br.com.cdems.model.Endereco;
import br.com.cdems.model.PerfilConta;
import br.com.cdems.model.TipoTelefone;
import br.com.cdems.repository.PerfilContaRepository;
import br.com.cdems.service.ClienteService;
import br.com.cdems.service.ContaService;

@SpringBootApplication
public class CdemsApplication implements CommandLineRunner{

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ContaService contaService;
	
	@Autowired
	private PerfilContaRepository perfilContaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CdemsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Contato contato = new Contato(TipoTelefone.RESIDENCIAL, "1123265475", "11965547542");
//
//		Endereco endereco = new Endereco("Rua do Vergueiro", 11201, "Paraiso", "SP", "Brasil", "00214214");
//		
//		Cliente cliente = new Cliente("Alvaro", LocalDate.of(2000, 1, 24), "alvaro.fachinetto@gmail.com", "12345678924", "1422452", endereco, contato);
////		
//  		Cliente novo = clienteService.salvarCliente(cliente);
//		
//		
		perfilContaRepository.save(new PerfilConta("Private", LocalDate.now(), null));
//		
//		contaService.criarConta(novo.getCpfcnpj());
	}

}
