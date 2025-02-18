package com.siemens.crmapp.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Person {

	protected long adharCardNo;
	protected String firstName;
	protected String lastName;
	protected LocalDate dob;
	
	//abstract method
	public abstract void computeDiscount();

	//concrete method
	@Override
	public String toString() {
		return "Person [adharCardNo=" + adharCardNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + "]";
	}
	
	
}
