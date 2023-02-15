package com.uday.questions.things;

public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		String name="Chekking the method";
		int vCount=0;
		int cCount=0;
		name=name.toLowerCase();
		
		for( int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				vCount++;
			} 
			else
			if(name.charAt(i)>='a'&& name.charAt(i)<='z')
			{
				cCount++;
			}
			System.out.println(vCount +"vowels");
			System.out.println(cCount+"consonents");
		}
	}

}
