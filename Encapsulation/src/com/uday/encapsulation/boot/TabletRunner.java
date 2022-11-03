package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.tablets.Tablets;
import com.uday.encapsulation.things.tablets.TabletsModify;

public class TabletRunner {
public static void main(String[] args) {
		

		Tablets tablets = new Tablets();
		System.out.println(tablets.getName());
		System.out.println(tablets.getPrice());
		TabletsModify modify = new TabletsModify();
		modify.useTablets(tablets);

	}

}
