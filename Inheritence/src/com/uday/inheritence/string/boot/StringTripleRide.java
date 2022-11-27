package com.uday.inheritence.string.boot;

	

public class StringTripleRide {

	public static void main(String[] args) {
		
		String tripleRide="Triple Riding is a kanada movie released on 25 nov,2022. "
				+ "The movie is directed by mahesh gowda and featured Adithi prabhudev, "
				+ "Rachana inder,sadhu kokila, Ranghayana Raghu as lead charecters";
		//upper case//
		String tripleRideUppar=tripleRide.toUpperCase();
		
		System.out.println("Convert to UpparCase:"+tripleRideUppar);
		System.out.println(System.lineSeparator());
		
		//lower case//
		String lowerCase=tripleRide.toLowerCase();
		System.out.println("Convert to lowerCase:"+lowerCase);
		System.out.println(System.lineSeparator());
		
		//print the duplicate charecter//
		int count;
		char String[]=tripleRide.toCharArray();
		System.out.println("print the duplicate charecter in the String");
		for(int i=0;i<String.length;i++)
		{
			count=1;
			for(int j=i+1;j<String.length;j++)
			{
				 if(String[i] == String[j] && String[i] != ' ') 
				{
					count++;
					String[j]='0';
				}
			}
			 if(count > 1 && String[i] != '0')  
	                System.out.println(String[i]); 
		}
		System.out.println(System.lineSeparator());
		
		//split the string//
		String[] split=tripleRide.split("\\s");
		for(String movie:split) {
			System.out.println(movie);
		}
		System.out.println(System.lineSeparator());
		
		char[] cha=tripleRide.toCharArray();
		int len=cha.length;
		 System.out.println("Char Array length: " + len);  
	        System.out.println("Char Array elements: ");  
	        for (int i = 0; i < len; i++) {  
	            System.out.println(cha[i]); 
	        }
	        
	        System.out.println(System.lineSeparator());
	        
	        //reverse the string//
	        String reversedStr="";
	        for(int i=tripleRide.length()-1;i>=0;i--)
	        {
	        	reversedStr=reversedStr+ tripleRide.charAt(i);
	        }
	        System.out.println("Original String statement:"+tripleRide);
	        System.out.println("Reverse String :"+reversedStr);
	        
	      //logic to find no of 'R' in above sentence
			char ch = 'R';
	        int frequency = 0;

	        for(int i = 0; i < tripleRide.length(); i++) {
	            if(ch == tripleRide.charAt(i)) {
	                ++frequency;
	            }
	        }

	        System.out.println("Frequency of " + ch + " = " + frequency);
	        System.out.println("------------------------");
	        
	        // Find all digits in above string 
	        int count1=0;
		    for(int i=0;i<tripleRide.length();i++)
		    {
		      if(Character.isDigit(tripleRide.charAt(i)))
		      count1++;
		    
		    }
		    System.out.println("the number of digits in the given string is:" + count1);
		    System.out.println("--------------------------------------");
		    
		  //Split by , 
	        String[] splitByComma=tripleRide.split(",");
			
			for (int i=0; i < splitByComma.length; i++)
		    {
		      System.out.println(splitByComma[i]);
		    }
			System.out.println("--------------------------");
			
			 //find palindrome word in above string 
			  System.out.println("----------------------------");
			  String rev="";
			  for ( int i = tripleRide.length() - 1; i >= 0; i-- )
			         rev = rev + tripleRide.charAt(i);
			  
			  if (tripleRide.equals(rev))
			         System.out.println("String:"+tripleRide+" is a palindrome");
			      else
			         System.out.println("String:"+tripleRide+"  not a palindrome");
	        
	        
		
		
		
		
		
	}

}
