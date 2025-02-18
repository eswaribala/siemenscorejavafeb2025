package com.siemens.crmapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class SilverCustomer extends Customer{
	
	private float discount;

	@Override
	public String toString() {
		return "SilverCustomer [discount=" + discount + ", customerId=" + customerId + ", password=" + password
				+ ", adharCardNo=" + adharCardNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + "]";
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	

	
}
