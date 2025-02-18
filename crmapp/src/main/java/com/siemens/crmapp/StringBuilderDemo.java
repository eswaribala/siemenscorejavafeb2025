package com.siemens.crmapp;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder stringBuilder=new StringBuilder("Siemen");
		stringBuilder.append("t");
		stringBuilder.insert(6, 's');
		System.out.println(stringBuilder);
		stringBuilder.replace(0, 8, "TCS");
		System.out.println(stringBuilder);
		
		StringBuffer palindrome=new StringBuffer("Madam");
		System.out.println(palindrome.reverse());
		System.out.println(palindrome.equals(palindrome.reverse()));
	}

}
