package com.uday.questions.things;

import java.util.Scanner;

public   class  Practies {
	
	public static void main(String[] args) {
		
	
		/*int [] arr1= {4,5,8,6,7};
		int big=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		System.out.println("largest element:"+big);*/
		
		
		 /*Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int largest = arr[0];
	        for (int i = 1; i < size; i++) {
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	        System.out.println("The largest element in the array is: " + largest);*/
		
		/*Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int x=a;
	    int y=1;
	    int z;
	    
	    System.out.println(x);
	    System.out.println(y);
		for(int i=2;i<10;i++) {
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}*/
		//counting words in string//
		/*String name="uday uppar tarikere";
		int count =1;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
			System.out.println(count+"total words");	
		*/
		
		//string reverse//
		/*String name="xworkz odc traing center";
		String[] arr=name.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				System.out.print (arr[i].charAt(j));
			}
			System.out.print(" ");
			
		}*/
		
		/*vowels 
		String name="xworkz odc";
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'|| name.charAt(i)=='u') {
				count++;
			}
			
			System.out.print(count);
		}*/
		/*searching element
		int [] arr= {1,2,3,8,4};
		int element=9;
		int pos=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				pos=i;
				break;
			}
		}
		if(pos==-1) {
			System.out.println("not found:"+element);
		}
		else {
			System.out.println("found:"+element);
		}*/
		
		/*removing duplicate  element in arrray
		int[] arr= {10,8,10,8,5,6};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1+i;j<arr.length-1;j++) {
				if(arr[i]==arr[j]&& arr[i]!=-1) {
					arr[j]=-1;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				System.out.println(arr[i]);
			}
		}
 		*/
		
		int[] arr= {10,8,-9,11,12};
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	    }
	}







