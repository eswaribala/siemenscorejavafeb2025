package com.siemens.crmapp;

import com.github.javafaker.Faker;
import com.siemens.crmapp.facades.OTPGenerator;

public class AnnoymousApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //anonymous
		OTPGenerator otpGenerator=new OTPGenerator() {

			@Override
			public int getOTP() {
				// TODO Auto-generated method stub
				return new Faker().number().numberBetween(1000,9999);
			}
			
		};
		
		System.out.println(otpGenerator.getOTP());
	}

	
}
