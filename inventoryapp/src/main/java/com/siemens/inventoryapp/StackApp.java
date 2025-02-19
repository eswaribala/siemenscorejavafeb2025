package com.siemens.inventoryapp;

import java.util.Stack;

import com.github.javafaker.Faker;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<Integer>();
		
		int number=new Faker().number().numberBetween(1, 10);
		
		System.out.println("Decimal Number="+number);
		
		int quotient=0,reminder=0;
		while(number>0) {
			quotient=number/2;
			reminder=number%2;
			stack.push(reminder);
			number=quotient;
			
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop()+"\t");
		
		
		
	}

}
