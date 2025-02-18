package com.siemens.crmapp;

import java.util.StringTokenizer;

public class IntoWordsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String message="The training, will cover all the core java topics!! Got it";
	 StringTokenizer stringTokenizer=new StringTokenizer(message," ,!!");
	 while(stringTokenizer.hasMoreTokens())
		 System.out.println(stringTokenizer.nextToken());
	 
	 String testMessage="trai'i'ng";
	 for(char ch : testMessage.toCharArray())
		 System.out.print(ch+"\t");
		
	}

}
