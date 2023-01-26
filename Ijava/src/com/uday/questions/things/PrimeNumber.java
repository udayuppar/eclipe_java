package com.uday.questions.things;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=48;
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
		}

	}

}
