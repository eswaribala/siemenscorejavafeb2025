package com.siemens.crmapp.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private long accountNo;
	private AccountType accountType;
	private LocalDate dop;
	
	@Data
	
	//non static 
	public class Subscription{
		public static long subscriptionId=0;
		private long subscriptionAmount;
		private LocalDate expiryDate;
		public Subscription() {
			subscriptionId++;
			
			
		}
		
		public String show() {
			return "Account [AccountNo="+accountNo+" Date of Opening="+dop.toString()+"] Subscription [subscriptionAmount=" + subscriptionAmount + ", expiryDate=" + expiryDate + "]";
		}
		
	
	}

}
