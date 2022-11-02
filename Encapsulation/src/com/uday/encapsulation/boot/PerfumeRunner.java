package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.Perfume;
import com.uday.encapsulation.things.PerfumeModifier;

public class PerfumeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfume perfume = new Perfume();
		System.out.println(perfume.getbrand());

		PerfumeModifier modify = new PerfumeModifier();
		modify.usePerfume(perfume);

	}

}
