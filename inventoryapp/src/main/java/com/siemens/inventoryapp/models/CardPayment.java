package com.siemens.inventoryapp.models;

import java.time.LocalDate;

import com.siemens.inventoryapp.exceptions.CVVException;
import com.siemens.inventoryapp.exceptions.CardNoException;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class CardPayment extends Payment {
	
	private long cardNo;
	private int cvv;
	private LocalDate expiryDate;
	
	public CardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardPayment(long paymentId, LocalDate dop, long amount, long cardNo, int cvv, LocalDate expiryDate) throws CVVException {
		super(paymentId, dop, amount);
		if(String.valueOf(cardNo).length()==10)		
			this.cardNo = cardNo;
		 else
			 throw new CardNoException("Card No should be in 10 Digits");
		
		if(String.valueOf(cvv).length()==3)		
			this.cvv = cvv;
		 else
			 throw new CVVException("CVV No should be in 3 Digits");
		this.expiryDate = expiryDate;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		
	 if(String.valueOf(cardNo).length()==10)		
		this.cardNo = cardNo;
	 else
		 throw new CardNoException("Card No should be in 10 Digits");
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) throws CVVException {
		
		if(String.valueOf(cvv).length()==3)		
			this.cvv = cvv;
		 else
			 throw new CVVException("CVV No should be in 3 Digits");
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cvv=" + cvv + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	
	

}
