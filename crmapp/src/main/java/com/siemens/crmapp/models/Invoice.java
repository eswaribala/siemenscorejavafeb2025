package com.siemens.crmapp.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Invoice {
	//static variable will be initialized only once in lifetime
	
	public static long invoiceNo=0;
	private LocalDate doi;
	private long amount;	
	private long invoiceCode;
	public static String franchiseCode="CH0001";
	public static String countryCode="IN";
	
	public Invoice() {
		
	}


	public Invoice(LocalDate doi, long amount) {
		super();
		this.invoiceCode=++invoiceNo;	
		this.doi = doi;
		this.amount = amount;
	}
	
	

}
