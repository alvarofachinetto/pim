package br.com.cdems.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdems.model.Cliente;
import br.com.cdems.service.ClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{cpfCnpj}")
	public ResponseEntity<Cliente> buscarCliente(@PathVariable String cpfCnpj){
		Cliente cliente = clienteService.buscarCliente(cpfCnpj);
		
		if(cliente != null)
			return ResponseEntity.ok().body(cliente);
		
		return ResponseEntity.badRequest().build();
	}
	
	@PostMapping
	public ResponseEntity<Cliente> salvarCliente(@Valid @RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvarCliente(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cliente> atualizarCliente(@Valid @RequestBody Cliente cliente){
		return ResponseEntity.ok().body(clienteService.salvarCliente(cliente));
	}
	
	@DeleteMapping("/{cpfCnpj}")
	public ResponseEntity<Void> deletarCliente(@PathVariable String cpfCnpj){
		clienteService.removerCliente(cpfCnpj);
		return ResponseEntity.noContent().build();
	}
}
