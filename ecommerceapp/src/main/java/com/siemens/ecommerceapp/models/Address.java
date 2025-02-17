package com.siemens.ecommerceapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class Address {
	
	private String doorNo;
	private String streetName;
	private String city;
	private String state;
	private String countryName;
	private long pinCode; 
	

}
