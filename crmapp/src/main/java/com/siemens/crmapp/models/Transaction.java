package com.siemens.crmapp.models;

import lombok.Data;

@Data
public class Transaction {
	
	private long transactionId;
	private TransactionMode transactionMode;
	private static int counter=0;
	//access specifier private
	private Transaction() {
		
		counter++;
	}
	
	//singleton
	public static Transaction createTransaction() {
		if(counter<1)
		 return new Transaction();
		else
			throw new RuntimeException("More than one object cannot be created");
	}

}
