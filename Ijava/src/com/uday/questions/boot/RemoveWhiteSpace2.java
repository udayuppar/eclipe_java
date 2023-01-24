package com.uday.questions.boot;

import java.util.Scanner;

public class RemoveWhiteSpace2 {

	public static void main(String[] args) {
		String str="Hands on learning happens here";
		String s[]=str.split(" ");
		Scanner sp=new Scanner(System.in);
		String rev=sp.next();
		String name=" ";
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(rev)) {
				char ch[]=rev.toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					name=name+ch[j];
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(rev)) {
				s[i]=name;
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+"");
		}

	}

}
