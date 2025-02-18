package com.siemens.crmapp;

import java.util.Random;

import com.siemens.crmapp.models.Transaction;
import com.siemens.crmapp.models.TransactionMode;

public class TransactionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction transaction1=Transaction.createTransaction();
		transaction1.setTransactionId(new Random().nextLong());
		transaction1.setTransactionMode(TransactionMode.CARD);
	
		Transaction transaction2=Transaction.createTransaction();
		transaction2.setTransactionId(new Random().nextLong());
		transaction2.setTransactionMode(TransactionMode.NETBANKING);
	}

}
