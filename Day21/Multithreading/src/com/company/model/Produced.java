package com.company.model;

public class Produced extends Thread {
	
	SharedProducerConsumerResources shared = new SharedProducerConsumerResources();

	  public Produced(SharedProducerConsumerResources shared) {
	    super();
	    this.shared = shared;
	  }
	  
	  public void run()
	  {
	    for(int i=1;i<=5;i++) 
	    {
	      shared.produce(i);
	      
	      try{
	        Thread.sleep(1000);
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Exception occured: " + e.getMessage());
	      }
	    }
	  }

}
