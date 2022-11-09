package com.uday.inheritence.boot;

import com.uday.inheritence.child.Moon;

public class SateliteRunner {

	public static void main(String[] args) {
		Moon moon =new Moon("EOS-01", 2021, 384400);
		moon.display();

	}

}
