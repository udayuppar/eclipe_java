package com.uday.questions.boot;

public class Like extends Exa {
	void data() {
		System.out.println("chind class");
	}
	
	public static void main(String[] args) {
		Exa ref=(Exa)new Like();
		ref. print();
	}

}


