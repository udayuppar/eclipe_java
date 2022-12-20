package com.xworkz.collections.boot;

import java.util.LinkedList;
import java.util.List;

public class Currencies {

	public static void main(String[] args) {

		String Currencies1 = "Rupee";
		String Currencies2 = "Afghani";
		String Currencies3 = "Australian dollar";
		String Currencies4 = "Taka";
		String Currencies5 = "Euro";
		String Currencies6 = "Ngultrum";
		String Currencies7 = "Real";
		String Currencies8 = "Brunei dollar";
		String Currencies9 = "CFA Franc";
		String Currencies10 = "Burundi franc";
		String Currencies11 = "Riel";
		String Currencies12 = "CFA Franc";
		String Currencies13 = "Canadian dollar";
		String Currencies14 = "CFA Franc";
		String Currencies15 = "Chilean Peso";
		String Currencies16 = "Chinese Yuan";
		String Currencies17 = "Colombian Peso";
		String Currencies18 = "Franc";
		String Currencies19 = "United States dollar";
		String Currencies20 = "Colón";
		String Currencies21 = "Croatian";
		String Currencies22 = "Euro";
		String Currencies23 = "Koruna";
		String Currencies24 = "kwacha";
		String Currencies25 = "Dong";
		String Currencies26 = "Bolivar";

		List<String> list = new LinkedList();
		list.add(Currencies1);
		list.add(Currencies2);
		list.add(Currencies3);
		list.add(Currencies4);
		list.add(Currencies5);
		list.add(Currencies6);
		list.add(Currencies7);
		list.add(Currencies8);
		list.add(Currencies9);
		list.add(Currencies10);
		list.add(Currencies11);
		list.add(Currencies12);
		list.add(Currencies13);
		list.add(Currencies14);
		list.add(Currencies15);
		list.add(Currencies16);
		list.add(Currencies17);
		list.add(Currencies18);
		list.add(Currencies19);
		list.add(Currencies20);
		list.add(Currencies21);
		list.add(Currencies22);
		list.add(Currencies23);
		list.add(Currencies24);
		list.add(Currencies25);
		list.add(Currencies26);

		System.out.println(list.size());

		list.clear();
		System.out.println("After clear.....");
		System.out.println(list.size());

	}

}
