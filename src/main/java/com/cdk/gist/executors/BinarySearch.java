//package com.cdk.gist.executors;
//
//import java.util.concurrent.ForkJoinPool;
//
//import java.util.concurrent.ForkJoinTask;
//import java.util.concurrent.RecursiveTask;
//import java.lang.Boolean;
//
//class ForkJoinSearch<Boolean> extends RecursiveTask<Boolean> {
//	int[] arr;
//    int searchableElement;
//    ForkJoinSearch(int[] arr,int search)
//    {
//           this.arr = arr;
//           this.searchableElement=search;
//    }
//	@Override
//	protected Boolean compute() {
//		int mid=( 0 + arr.length)/2;
//        System.out.println(Thread.currentThread().getName() + " says : After splliting the arry length is :: "+ arr.length + " Midpoint is " + mid);
//        if(arr[mid]==searchableElement)
//        {
//               System.out.println(" FOUND !!!!!!!!!");
//               //return new Boolean(true);
//        }
//	}
//
//}
//
//public class BinarySearch {
//
//	public static void main(String[] args) {
//		int arr[]={1,2,3,4,5,6,7,8,9};
//		ForkJoinPool forkJoinPool=new ForkJoinPool(50);
//		ForkJoinSearch<Boolean> search=new ForkJoinSearch(arr, 5);
//		forkJoinPool.invoke(search);
//	}
//}
