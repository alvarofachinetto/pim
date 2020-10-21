package br.com.cdems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class ObjetoNuloException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjetoNuloException(String mensagem) {
		super(mensagem);
	}
	
}
