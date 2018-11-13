package com.cdk.gist.concurrency.lock;

class Amount{
	
	double price1;
	double price2;
	public double getPrice1() {
		return price1;
	}
	public void setPrice1(double price1) {
		this.price1 = price1;
	}
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	
	
}
class PriceWriter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class ReadWriteLockExample {
	
	

}
