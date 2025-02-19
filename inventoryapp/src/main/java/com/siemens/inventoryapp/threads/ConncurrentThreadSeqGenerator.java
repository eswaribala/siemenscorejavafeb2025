package com.siemens.inventoryapp.threads;

public class ConncurrentThreadSeqGenerator extends Thread {

	public ConncurrentThreadSeqGenerator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println("SeqNo="+ i);
		}
	}

}
