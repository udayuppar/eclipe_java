package com.uday.questions.boot;

import java.util.Arrays;

public class MergeTwoArrayinSingleArray {

	public static void main(String[] args) {
		
		int first[]= {1,2,3,4,5};
		int second[]= {6,7,8,9,10};
		int length=first.length+second.length;
		int[] mergeArray=new int[length];
		int position=0;
		
		for(int element:first) {
			mergeArray[position]=element;
			position++;
		}
		for(int element:second) {
			mergeArray[position]=element;
			position++;
		}
		System.out.println("merged array:"+Arrays.toString(mergeArray));
	}

}
