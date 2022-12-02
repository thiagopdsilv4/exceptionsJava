package model.exceptions;

public class DomainException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//declarando a versao de classe serialisable 
	
	public DomainException(String msg) {
		super(msg);// para permitir instanciar o construtor passando uma mensagem, a mensagem  fica armazenada dentro da excessao 
		
	}
	
}
