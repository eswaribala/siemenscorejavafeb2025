package com.siemens.inventoryapp.exceptions;

public class CVVException extends Exception {
	private String message;

	public CVVException(String message) {
		super(message);
		this.message = message;
	}
	

}
