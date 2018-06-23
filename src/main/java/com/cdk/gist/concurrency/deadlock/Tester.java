//package com.cdk.gist.concurrency.deadlock;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Tester {
//
//	public static void main(String[] args) {
//		Fox foxy=new Fox();
//		Fox tails=new Fox();
//		Water water=new Water();
//		Food food=new Food();
//		ExecutorService sc=null;
//		try{
//			sc=Executors.newScheduledThreadPool(10);
//			sc.submit(new Runnable() {
//				
//				@Override
//				public void run() {
//					foxy.eatAndDrink(food, water);
//					
//				}
//			});
//			sc.submit(new Runnable() {
//				
//				@Override
//				public void run() {
//					tails.drinkAndEat(food, water);
//					
//				}
//			});
//		}
//		finally{
//			if(sc!=null)
//			sc.shutdown();
//		}
//	}
//}
