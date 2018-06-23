package com.cdk.gist.synchronizer;

import java.util.concurrent.Exchanger;

public class StringProducer implements Runnable {
	Exchanger<String> exchanger;
	String str;

	public StringProducer(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
		str = new String();
	}

	@Override
	public void run() {
		char ch = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				str += ch++;
			}

			try {
				str = exchanger.exchange(str);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
