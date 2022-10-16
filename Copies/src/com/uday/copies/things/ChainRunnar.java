package com.uday.copies.things;

import com.uday.copies.boot.Chain;

public class ChainRunnar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chain chain = new Chain();
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.lengthInFeet);
		System.out.println(chain.material);
		System.out.println(chain.weight);
		System.out.println(chain.usedFor);
		System.out.println(chain.fresher);
		System.out.println("***********************************");

		Chain chain2 = new Chain("Squar", 500);
		System.out.println(chain2.type);
		System.out.println(chain2.price);
		System.out.println(chain2.lengthInFeet);
		System.out.println(chain2.material);
		System.out.println(chain2.weight);
		System.out.println(chain2.usedFor);
		System.out.println(chain2.fresher);
		System.out.println("***********************************");

		Chain chain3 = new Chain("", 500, 2);
		System.out.println(chain3.type);
		System.out.println(chain3.price);
		System.out.println(chain3.lengthInFeet);
		System.out.println(chain3.material);
		System.out.println(chain3.weight);
		System.out.println(chain3.usedFor);
		System.out.println(chain3.fresher);
		System.out.println("***********************************");

		Chain chain4 = new Chain("", 500, 2, "mildSteel");
		System.out.println(chain4.type);
		System.out.println(chain4.price);
		System.out.println(chain4.lengthInFeet);
		System.out.println(chain4.material);
		System.out.println(chain4.weight);
		System.out.println(chain4.usedFor);
		System.out.println(chain4.fresher);
		System.out.println("***********************************");

		Chain chain5 = new Chain("", 2, 1, "", 3);
		System.out.println(chain5.type);
		System.out.println(chain5.price);
		System.out.println(chain5.lengthInFeet);
		System.out.println(chain5.material);
		System.out.println(chain5.weight);
		System.out.println(chain5.usedFor);
		System.out.println(chain5.fresher);
		System.out.println("***********************************");

		Chain chain6 = new Chain("", 2, 1, "", 2, true);
		System.out.println(chain6.type);
		System.out.println(chain6.price);
		System.out.println(chain6.lengthInFeet);
		System.out.println(chain6.material);
		System.out.println(chain6.weight);
		System.out.println(chain6.usedFor);
		System.out.println(chain6.fresher);
		System.out.println("***********************************");

		Chain chain7 = new Chain("", 2, 1, "", 2, true, false);
		System.out.println(chain7.type);
		System.out.println(chain7.price);
		System.out.println(chain7.lengthInFeet);
		System.out.println(chain7.material);
		System.out.println(chain7.weight);
		System.out.println(chain7.usedFor);
		System.out.println(chain7.fresher);
		System.out.println("***********************************");

	}

}
