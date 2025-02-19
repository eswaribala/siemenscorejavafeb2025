package com.siemens.inventoryapp;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Number> list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Generic with super
		
		ArrayList<? super Integer> numberList=list;
		numberList.add(5);
		
		ArrayList<Integer> list1=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Generic with extends
		/*
		 * The wildcard ? extends Number means numberList1 can hold any type 
		 * that is a subclass of Number (like Integer, Double, etc.).
		 * However, it becomes a read-only list in terms of element 
		 * addition or modification.
		 * You cannot add elements to numberList1 because the compiler 
		 * doesn't know the exact subtype of Number in use.This is a fundamental 
		 * restriction of "upper-bounded wildcards" (? extends T) in Java.
		 */
		ArrayList<? extends Number> numberList1=list1;
		//numberList1.add(5);
		
		
	}

}
