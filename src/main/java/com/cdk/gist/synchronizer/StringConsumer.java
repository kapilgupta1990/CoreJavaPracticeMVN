package com.cdk.gist.synchronizer;

import java.util.concurrent.Exchanger;

public class StringConsumer implements Runnable {
	Exchanger<String> exchanger;
    String str;

	public StringConsumer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
	}

	@Override
	public void run() {
		 for(int i=0;i<3;i++){
	            try {
	                str = exchanger.exchange(new String());
	                System.out.println("Received String : " + str);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	}

}
