package com.siemens.inventoryapp;

import java.time.LocalDate;
import java.time.ZoneId;

import com.github.javafaker.Faker;
import com.siemens.inventoryapp.exceptions.CVVException;
import com.siemens.inventoryapp.exceptions.CardNoException;
import com.siemens.inventoryapp.models.CardPayment;
import com.siemens.inventoryapp.models.CashPayment;
import com.siemens.inventoryapp.models.Denomination;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker faker=new Faker();
		CashPayment cashPayment=new CashPayment(faker.number().numberBetween(1000L, 100000L),
				faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				faker.number().numberBetween(1000L, 100000L),
				new Denomination(50,5)
				);
		System.out.println(cashPayment);
		
		CardPayment cardPayment;
		try {
			cardPayment = new CardPayment(faker.number().numberBetween(1000L, 100000L),
					faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
					faker.number().numberBetween(1000L, 100000L),
					1234567890L,
					faker.number().numberBetween(10, 99),
					LocalDate.now().plusYears(5)				
					);
			System.out.println(cardPayment);
		}
		catch (CardNoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CVVException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		

	}

}
