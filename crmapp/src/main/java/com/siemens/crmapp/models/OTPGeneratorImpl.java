package com.siemens.crmapp.models;

import com.github.javafaker.Faker;
import com.siemens.crmapp.facades.OTPGenerator;

public class OTPGeneratorImpl implements OTPGenerator{

	@Override
	public int getOTP() {
		// TODO Auto-generated method stub
		return new Faker().number().numberBetween(1000,9999);
	}

}
