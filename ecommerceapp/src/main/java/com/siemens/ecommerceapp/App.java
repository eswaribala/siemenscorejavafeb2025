package com.siemens.ecommerceapp;

import java.time.LocalDate;

import com.siemens.ecommerceapp.models.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Rocking with Java");

		Customer customer=new Customer(1,"Parameswari",
				"Bala",LocalDate.of(1970, 12, 2), 9952032862L,"param@gmail.com");
		System.out.println(customer);
		
	}

}
