package com.siemens.ecommerceapp.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private long customerId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private long mobileNo;
	private String emailId;
	//has relationship
	private Address address;
	
	

}
