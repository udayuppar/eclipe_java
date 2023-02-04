package com.uday.questions.things;

import java.util.Scanner;

import sun.security.util.Length;

public class PrimeNumber 
{
   public static void main(String[] args) 
	{
		/*int n=48;
		boolean isPrime=true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			if(isPrime==true) {
				System.out.println("Prime number:"+n);
			}else {
				System.out.println("not a prime number:"+n);
			}
		}*/
	  /* Scanner sc= new Scanner(System.in);
			   int a=sc.nextInt();
           int no=a;
          int count=0;
	    for(int i=1;i<=no;i++)
	    {
	    	if(no%i==0) 
	    	{
              count++;
	    	}
	    }
	    	if(count==2)
	    	{
	         System.out.println(no+" it is a prime number");
	    	}
	    	else
	    	{
	    		System.out.println(no+" it is not a prime numner");
	        }*/
	       /*int a=10;
	       int b=20;
	        int c=a;
	             a=b;
	             b=c;
	             System.out.println(a);
	             System.out.println(b);*/
	       String s="Darshan";
	       for(int i=s.length()-1;i>=0;i--)
	       {
	    	   System.out.print(s.charAt(i));
	       }
}
}