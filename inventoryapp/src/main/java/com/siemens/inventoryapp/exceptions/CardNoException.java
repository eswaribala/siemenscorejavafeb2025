package com.siemens.inventoryapp.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CardNoException extends RuntimeException{
	
	private String message;

	public CardNoException(String message) {
		super();
		this.message = message;
	}
	

}
