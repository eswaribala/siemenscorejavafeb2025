package com.siemens.inventoryapp.threads;

import com.github.javafaker.Faker;

public class DisneyAnimationThread extends AnimationThread implements Runnable{

	
	public DisneyAnimationThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			/*
			 * for(char ch : this.userName.toCharArray()) { System.out.print(ch+"\t"); try {
			 * Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block System.out.println(e.getMessage()); } }
			 */
		     Faker faker=new Faker(); 
			while(true) {
				System.out.println("Random Number"+faker.number().numberBetween(1, 10000000L));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					break;
				}
			}
	}

}
