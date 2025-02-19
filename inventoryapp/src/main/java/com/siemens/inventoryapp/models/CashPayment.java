package com.siemens.inventoryapp.models;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CashPayment extends Payment{

	private Denomination denomination;

	
	public CashPayment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CashPayment(long paymentId, LocalDate dop, long amount, Denomination denomination) {
		super(paymentId, dop, amount);
		this.denomination = denomination;
	}
	
	
}
