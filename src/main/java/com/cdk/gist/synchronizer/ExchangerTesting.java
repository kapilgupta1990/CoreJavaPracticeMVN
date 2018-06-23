package com.cdk.gist.synchronizer;

import java.util.concurrent.Exchanger;

public class ExchangerTesting {

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();
        
        StringProducer stringProducer = new StringProducer(exchanger);
        StringConsumer stringConsumer = new StringConsumer(exchanger);
        
        new Thread(stringProducer).start();
        new Thread(stringConsumer).start();
	}
}
