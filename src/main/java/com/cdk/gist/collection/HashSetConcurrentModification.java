package com.cdk.gist.collection;

import java.util.HashSet;
class InsertIntoHashSet extends Thread{
	HashSet<Integer> hashSet;
	int i;
	public InsertIntoHashSet(HashSet<Integer> hashSet, int i) {
		this.hashSet=hashSet;
		this.i=i;
	}
	@Override
	public void run() {
		for(int j=i;j<=i+300;j++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hashSet.add(new Integer(j));
		}
	}
}
public class HashSetConcurrentModification {

	
	public static void main(String[] args) throws InterruptedException {

		HashSet<Integer> hashSet=new HashSet<>();
		Thread t1=new InsertIntoHashSet(hashSet,0);
		Thread t2=new InsertIntoHashSet(hashSet,300);
		t1.start();t2.start();
		t1.join();
		t2.join();
		System.out.println(hashSet);
	
	}
}
