/** 
 * This is the "ConflictOfObjectsException" class. Which will be able to provide object conflict exception handling.
 * 
 * @author Tales Mateus de Oliveira Ferreira <talesmateus1999@hotmail.com>
 */
package com.br.services.exceptions;

public class InterruptedException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InterruptedException(String msg) {
		super(msg);
		
	}
	
	public InterruptedException(String msg, Throwable cause) {
		super(msg, cause);
		
	}
	
	
	
}
