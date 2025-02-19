package com.siemens.inventoryapp;

import java.util.Scanner;

import com.siemens.inventoryapp.threads.AnimationThread;
import com.siemens.inventoryapp.threads.DisneyAnimationThread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		DisneyAnimationThread animationThread=new DisneyAnimationThread("Parameswari");
		
		Thread thread=new Thread(animationThread);
		thread.start();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Would like to stop number generation? Press yes");
		String response=scanner.nextLine();
		
		if(response!=null)
			thread.interrupt();
		
		
		
		
	}

}
