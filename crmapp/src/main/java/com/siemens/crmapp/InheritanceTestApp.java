package com.siemens.crmapp;

import java.time.ZoneId;
import java.util.Random;

import com.github.javafaker.Faker;
import com.siemens.crmapp.models.SilverCustomer;

public class InheritanceTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Faker faker=new Faker();
		SilverCustomer silverCustomer=SilverCustomer.builder()
				.adharCardNo(faker.number().numberBetween(1111111111, 99999999999L))
				.firstName(faker.name().firstName())
				.lastName(faker.name().lastName())
				.dob(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
				.customerId(faker.number().numberBetween(1111111111, 99999999999L))
				.password(faker.internet().password())
				.discount(new Random().nextFloat(0.9f))				
				.build();

		System.out.println(silverCustomer);
		
	}

}
