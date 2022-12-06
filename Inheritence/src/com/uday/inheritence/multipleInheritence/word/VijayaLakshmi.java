package com.uday.inheritence.multipleInheritence.word;

import com.uday.inheritence.multipleInheritence.rulls.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

	public double paidTax() {
		System.out.println("running paid tax");
		return 0;
	}

	public double gst() {
		System.out.println("running gst");
		return 0;
	}

	public double vat() {
		System.out.println("running vat");
		return 0;
	}

}
