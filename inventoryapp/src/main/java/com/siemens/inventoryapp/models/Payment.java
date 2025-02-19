package com.siemens.inventoryapp.models;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Payment {
	protected long paymentId;
	protected LocalDate dop;
	protected long amount;
	public Payment(long paymentId, LocalDate dop, long amount) {
		//java.lang.Object
		super();
		this.paymentId = paymentId;
		this.dop = dop;
		this.amount = amount;
	}
	public Payment() {
		//java.lang.Object
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
