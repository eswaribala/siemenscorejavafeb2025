package com.siemens.crmapp;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.siemens.crmapp.models.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //runtime exception
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter Age");
		int age=scanner.nextInt();
		int data=age/0;
		scanner.nextLine();
		System.out.println(args[2]);
		System.out.println("Continuing after capturing error...");
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Successfully handled....");
		}
		
		System.out.println("Continuing with Code");
		
		//compile time exception
		//SilverCustomerGenerator customer=new SilverCustomer();
		
	}

}
