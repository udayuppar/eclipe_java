package com.uday.questions.things;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,5,8,7,6};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
				
		}
		System.out.println("largest number:"+max);

	}

}
