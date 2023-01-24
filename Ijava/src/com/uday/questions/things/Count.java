//Count the number of digits in the given number.			
package com.uday.questions.things;

public class Count {

    static int countDigit(long n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
 
    
    public static void main(String[] args)
    {
        long n = 345289467;
        System.out.print("Number of digits : " + countDigit(n));
    }
}


