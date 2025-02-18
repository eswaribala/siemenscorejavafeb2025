package com.siemens.crmapp;



import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;

import com.github.javafaker.Faker;
import com.siemens.crmapp.models.Account;
import com.siemens.crmapp.models.Account.Subscription;
import com.siemens.crmapp.models.AccountType;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		account.setAccountNo(new Random().nextLong(100000));
		account.setAccountType(AccountType.Basic);
		account.setDop(LocalDate.now(ZoneId.of("Europe/Zurich")));
		
		Subscription subscription=account.new Subscription();
		subscription.setExpiryDate(LocalDate.now().plusMonths(6));
		subscription.setSubscriptionAmount(new Faker().number().numberBetween(2000, 8000));

		System.out.println(subscription); 
		
	}

}
