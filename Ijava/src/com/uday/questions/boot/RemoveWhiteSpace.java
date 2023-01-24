package com.uday.questions.boot;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String space="Royal chalengers Bengalur";
		int count=0;
		String s="", reverse = "";
		
		for(char ch:space.toCharArray()) {
			if(ch==' ') {
				count=count+1;
				
			}
			else {
				s=s+ch;
			}
			if(count>0 && count<=1) {
				reverse=ch+reverse;
			}
		}
		System.out.println("White space:"+count);
		System.out.println("String without white Space:"+s);
		System.out.println("reverse:"+reverse);
	}
	

}
