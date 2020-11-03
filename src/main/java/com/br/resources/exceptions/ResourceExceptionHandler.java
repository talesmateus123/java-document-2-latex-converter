/** 
 * This is the "ResourceExceptionHandler" class. Which will be able to provide all system exception handling.
 * 
 * @author Tales Mateus de Oliveira Ferreira <talesmateus1999@hotmail.com>
 */
package com.br.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.br.services.exceptions.IllegalArgException;
import com.br.services.exceptions.IOException;
import com.br.services.exceptions.InterruptedException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> ValidationException(MethodArgumentNotValidException e, HttpServletRequest request){
		// The Http status
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		// The validation error
		ValidationError err = new ValidationError(System.currentTimeMillis(), status.value(), "Validation Error", e.getMessage(), request.getRequestURI());	
		for(FieldError fieldError : e.getBindingResult().getFieldErrors())
			err.addError(fieldError.getField(), fieldError.getDefaultMessage());
		
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(IllegalArgException.class)
	public ResponseEntity<StandardError> illegalArgumentException(IllegalArgException e, HttpServletRequest request){
		// The Http status
		HttpStatus status = HttpStatus.BAD_REQUEST;
		// The standard error
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Erro na requisição", e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(IOException.class)
	public ResponseEntity<StandardError> IOException(IOException e, HttpServletRequest request) {
		// The Http status
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		// The standard error
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Erro ao manipular o arquivo", e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(InterruptedException.class)
	public ResponseEntity<StandardError> InterruptedException(InterruptedException e, HttpServletRequest request) {
		// The Http status
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		// The standard error
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Erro interno ao realizar a conversão do arquivo", e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
	
	
}
