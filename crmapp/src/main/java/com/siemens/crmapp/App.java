package com.siemens.crmapp;

import java.time.ZoneId;

import com.github.javafaker.Faker;
import com.siemens.crmapp.models.Invoice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generate 100 invoices

		Invoice[] invoices=new Invoice[100];
		Faker faker=new Faker();
		for(int i=0;i<100;i++) {
			
			invoices[i]=new Invoice(faker.date().birthday().toInstant()
					.atZone(ZoneId.systemDefault()).toLocalDate(), 
					faker.number().numberBetween(500, 5000000));
			
		}
		
		for(Invoice invoice: invoices) {
			System.out.println(invoice + ","+"Franchise Code="
		+Invoice.franchiseCode+","+"Country Code="+Invoice.countryCode);
		}
		
		
	}

}
