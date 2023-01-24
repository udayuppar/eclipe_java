package com.uday.questions.things;

import java.util.Scanner;

public class AddWithOutUsingPlus {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		
		Scanner sc= new Scanner(System.in);
		 a=sc.nextInt();
		  b=sc.nextInt();
		 
		  for(int i=0;i<b;i++)
		  {
			  a++;
		  }
		  System.out.println(a);
	}
	
	//5  //5+1+1+1+1
	//4
	//9

}
