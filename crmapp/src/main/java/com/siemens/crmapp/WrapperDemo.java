package com.siemens.crmapp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter DOB (YYY-MM-DD)");
		
		String dob=scanner.nextLine();
		
		System.out.println(dob);
		
		StringTokenizer tokenizer=new StringTokenizer(dob,"-");
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(Integer.parseInt(tokenizer.nextToken())+1);
			
		}
		
		//unboxing
		Integer integer=90;
		receive(integer);
		
		
		
		
	}
	
	
	public static void receive(long l) {
		System.out.println("long...");
	}
	public static void receive(int i) {
		System.out.println("int...");
	}
}
