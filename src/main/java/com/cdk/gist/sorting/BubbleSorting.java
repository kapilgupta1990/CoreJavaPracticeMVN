package com.cdk.gist.sorting;

abstract class Sort {
	public abstract int[] getSortedArray(int[] arr);
}

class BubbleSort extends Sort {

	@Override
	public int[] getSortedArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				// swap
				if(arr[j]>arr[j+1]){
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		return arr;
	}

}
class InsertionSort extends Sort{

	@Override
	public int[] getSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class SelectionSort extends Sort{

	@Override
	public int[] getSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class HeapSorting extends Sort{

	@Override
	public int[] getSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	private static void heapSort(int arr[],int i){
		
	}
	
}

public class BubbleSorting {

	public static void main(String[] args) {

		int firstarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int secondArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int thirdArray[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int forthArray[] = { 10, 9, 8, 7, 6, 1, 2, 3, 4, 5 };
		
		Sort bubbleSort=new BubbleSort();
		bubbleSort.getSortedArray(firstarr);
		bubbleSort.getSortedArray(secondArray);
		bubbleSort.getSortedArray(thirdArray);
		bubbleSort.getSortedArray(forthArray);

	}
}
