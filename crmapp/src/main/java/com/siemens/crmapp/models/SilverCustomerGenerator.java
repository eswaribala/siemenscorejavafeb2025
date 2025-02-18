package com.siemens.crmapp.models;

import com.github.javafaker.Faker;
import com.siemens.crmapp.facades.OTPGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class SilverCustomerGenerator extends SilverCustomer implements OTPGenerator {

	@Override
	public int getOTP() {
		// TODO Auto-generated method stub
		return new Faker().number().numberBetween(1000, 9999);
	}

	@Override
	public String toString() {
		return "SilverCustomerGenerator [customerId=" + customerId + ", password=" + password + ", adharCardNo="
				+ adharCardNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

	
	
}
