package com.siemens.ecommerceapp;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

import com.github.javafaker.Faker;
import com.siemens.ecommerceapp.models.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Rocking with Java");
		
		//generate 100 customers and show all the customer details
		System.out.println("Enter no of customers");
		Scanner scanner =new Scanner(System.in);
		byte size=0;
		size=scanner.nextByte();
		scanner.nextLine();
		generateCustomers(size);
		scanner.close();
		
	}
	
	
	public static void generateCustomers(byte size) {
		
		//create array
		Customer[] customers=new Customer[size];
		Faker faker=new Faker();
		
		for(int i=0;i<customers.length;i++) {
			
			customers[i]=new Customer(faker.number().numberBetween(1, 1000000),
					faker.name().firstName(),
					faker.name().lastName(),
					faker.date().birthday()
					.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
					faker.number().numberBetween(90000000000L, 9999999999L),
					faker.internet().emailAddress()					
					);
			
		}
		
		
		//read the values from array
		//enhanced for loop
		
		for(Customer customer:customers) {
			System.out.println(customer);
		}
		
		
		
		
	}
	

}
