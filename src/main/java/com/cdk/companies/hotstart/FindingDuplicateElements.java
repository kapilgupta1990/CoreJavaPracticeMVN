package com.cdk.companies.hotstart;

public class FindingDuplicateElements {

	public static void main(String[] args) {
		
		int arr[] =new int[30];
		for(int i=0;i<arr.length;i++){
			arr[i]=i+10;
		}
		arr[10]=17;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		int b[]=new int [30]; 
		System.out.println();
		for(int i=0;i<arr.length;i++){
			b[arr[i]-10]=b[arr[i]-10]+1;
			
		}
		System.out.println();
		for(int i=0;i<b.length;i++){
			if(b[i]==2)
				System.out.println(i+10);
			
		}
	
	}
	
}
