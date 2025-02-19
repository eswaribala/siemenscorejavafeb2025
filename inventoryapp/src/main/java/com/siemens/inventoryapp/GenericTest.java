package com.siemens.inventoryapp;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Generic with super
		
		ArrayList<? super Number> numberList=list;
		numberList.add(5);
		
		ArrayList<Integer> list1=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Generic with extends
		
		ArrayList<? extends Number> numberList1=list1;
		numberList1.add(5);
		
		
	}

}
