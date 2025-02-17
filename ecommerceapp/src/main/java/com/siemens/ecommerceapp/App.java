package com.siemens.ecommerceapp;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

import com.github.javafaker.Faker;
import com.siemens.ecommerceapp.models.Address;
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
		Customer[] customers=generateCustomers(size);
		for(Customer customer:customers)
			System.out.println(customer);
		scanner.close();
		
		String[][] addressArray=new String[customers.length][6];
		
		for(int i=0;i<addressArray.length;i++) {
			
			
			addressArray[i][0]=customers[i].getAddress().getDoorNo();
			addressArray[i][1]=customers[i].getAddress().getStreetName();
			addressArray[i][2]=customers[i].getAddress().getCity();
			addressArray[i][3]=customers[i].getAddress().getState();
			addressArray[i][4]=customers[i].getAddress().getCountryName();
			addressArray[i][5]=customers[i].getAddress().getZipCode();
			
		}
		
		//print two dim
		for(int i=0;i<addressArray.length;i++) {
			
			System.out.println("CustomerId="+customers[i].getCustomerId()+"having address");
			for(int j=0;j<addressArray[i].length;j++)
				System.out.print(addressArray[i][j]+"\t");		
			System.out.println("\n");
		}
		
		
		
	}
	
	
	public static Customer[] generateCustomers(byte size) {
		
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
					faker.internet().emailAddress(),
					new Address(faker.address().buildingNumber(),
							faker.address().streetName(),
							faker.address().city(),
							faker.address().state(),
							faker.address().country(),
							faker.address().zipCode()
							)
					);			
		}		
		
		return customers;
		
	}
	

}
