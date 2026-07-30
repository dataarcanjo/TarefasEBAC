package br.com.dataarcanjo.exceptions;

public class DAOException extends RuntimeException {

	/**
	 * @author dataarcanjo
	 */
	private static final long serialVersionUID = -5720333992902010364L;
	
	public DAOException(String msg, Exception e) {
		super(msg, e);
	}

}
