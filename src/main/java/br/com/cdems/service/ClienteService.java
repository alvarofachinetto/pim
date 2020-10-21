package br.com.cdems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cdems.exception.ObjetoNuloException;
import br.com.cdems.exception.RecursoNaoEncontradoException;
import br.com.cdems.model.Cliente;
import br.com.cdems.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente buscarCliente(String cpfCnpj) {
		
		Cliente cliente = clienteRepository.findByCpfcnpj(cpfCnpj)
				.orElseThrow(() -> new RecursoNaoEncontradoException("CPF ou CNPJ não encontrado!"));
		
		return cliente;
		
	}
	
	@Transactional
	public Cliente salvarCliente(Cliente cliente) {
		
		if(!cliente.equals(null)) {
			return clienteRepository.save(cliente);
		}
		
		throw new ObjetoNuloException("Cliente não preenchido!");
	}
	
	@Transactional
	public Cliente atualizarCliente(Cliente novoCliente) {
		
		var clienteAntigo = buscarCliente(novoCliente.getCpfcnpj());
		
		if(!clienteAntigo.equals(null)) {
			clienteAntigo.setNome(novoCliente.getNome());
			clienteAntigo.setNascimento(novoCliente.getNascimento());
			clienteAntigo.setSenha(novoCliente.getSenha());
			clienteAntigo.setEmail(novoCliente.getEmail());
			clienteAntigo.getContato().setCelular(novoCliente.getContato().getCelular());
			clienteAntigo.getContato().setTelefone(novoCliente.getContato().getTelefone());
			clienteAntigo.getContato().setTipoTel(novoCliente.getContato().getTipoTel());
			clienteAntigo.getEndereco().setLogradouro(novoCliente.getEndereco().getLogradouro());
			clienteAntigo.getEndereco().setNumero(novoCliente.getEndereco().getNumero());
			clienteAntigo.getEndereco().setBairro(novoCliente.getEndereco().getBairro());
			clienteAntigo.getEndereco().setPais(novoCliente.getEndereco().getPais());
			clienteAntigo.getEndereco().setCep(novoCliente.getEndereco().getCep());
		}
		
		return clienteRepository.saveAndFlush(clienteAntigo);
	}
	
	@Transactional
	public void removerCliente(String cpfCnpj) {
		Cliente cliente = buscarCliente(cpfCnpj);
		
		clienteRepository.delete(cliente);
	}
}
