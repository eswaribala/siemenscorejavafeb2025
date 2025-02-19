package com.siemens.inventoryapp;
import com.siemens.inventoryapp.threads.*;
public class ConcurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ConncurrentThreadSeqGenerator[] seq=new ConncurrentThreadSeqGenerator[4];
		for(int i=0;i<seq.length;i++) {
			
			seq[i]=new ConncurrentThreadSeqGenerator("Thread-"+i);
			System.out.println(seq[i].getName());
		    seq[i].start();
		    
		    if(i%2==0)
		    	seq[i].setPriority(Thread.MAX_PRIORITY);
		    else
		    	seq[i].setPriority(Thread.MIN_PRIORITY);
		   
		    try {
				seq[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
