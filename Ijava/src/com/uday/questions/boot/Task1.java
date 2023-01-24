package com.uday.questions.boot;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int start=scanner.nextInt();
		 int end=scanner.nextInt();
		// System.out.println(start);
		 //System.out.println(end);
		
		 for(int i=start; i<=end; i++) {
			 //System.out.println(i);
			 int temp=i;
			 
			 System.out.print(" "+temp);
			 int count=0;
			 for(;temp!=0;temp=temp/10) {
				 count++;
			 }
			 int n=temp;
			 int ref=0;
			 int sum=0;
			 for(;n>0;n=n/10) {
				 ref=n % 10;
				 sum+=(int) Math.pow(ref, count);
				 count--;
			 }
			 
		 }

	}

}
