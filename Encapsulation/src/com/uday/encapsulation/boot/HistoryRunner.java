package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.history.History;
import com.uday.encapsulation.things.history.HistoryModifier;

public class HistoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		History history = new History();
		System.out.println(history.getEnemyName());
		
		HistoryModifier modi=new HistoryModifier();
		modi.useHistory(history);

	}

}
