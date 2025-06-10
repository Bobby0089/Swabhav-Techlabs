package com.company.test;

import com.company.model.Consumer;
import com.company.model.Produced;
import com.company.model.SharedProducerConsumerResources;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		
		SharedProducerConsumerResources share = new SharedProducerConsumerResources();
		Produced produce = new Produced(share);
		Consumer consume = new Consumer(share);
		
		produce.start();
		consume.start();

	}

}
