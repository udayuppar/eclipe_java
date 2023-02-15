 package com.uday.questions.things;

public class SecondLargestnumber {
	
	public static int secondLargestNumber(int a[],int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=1+i;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		int a[]= {1,2,5,6,7};
		System.out.println("second largest number:"+ secondLargestNumber(a, 5));
	}

}
