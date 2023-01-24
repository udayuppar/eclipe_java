package com.uday.abstraction.boot;

import com.uday.abstraction.child.SBIATM;

public class AtmRunner {

	public static void main(String[] args) {
		SBIATM sbi= new SBIATM();
		sbi.display();
		sbi.withdraw();

	}

}
