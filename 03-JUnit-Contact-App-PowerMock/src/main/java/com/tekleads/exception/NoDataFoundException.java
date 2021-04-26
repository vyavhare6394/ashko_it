package com.tekleads.exception;

public class NoDataFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8784039304025781724L;

	public NoDataFoundException() {
	}

	public NoDataFoundException(String msg) {
		super(msg);
	}

}
