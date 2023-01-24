package com.uday.questions.boot;

import java.util.HashSet;
import java.util.Scanner;

public class New {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        if (n == m) {
	            System.out.println("Length of two lists must be different");
	            sc.close();
	            return;
	        }

	        HashSet<Integer> set1 = new HashSet<Integer>();
	        for (int i = 0; i < n; i++) {
	            set1.add(sc.nextInt());
	        }

	        HashSet<Integer> set2 = new HashSet<Integer>();
	        for (int i = 0; i < m; i++) {
	            set2.add(sc.nextInt());
	        }
	        sc.close();

	        set1.removeAll(set2);
	        System.out.println(set1.size());
	    }
	}