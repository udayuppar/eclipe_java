package com.uday.encapsulation.things.history;

public class HistoryModifier {
	public void useHistory(History history) {
		System.out.println("accessing enemy name:" + history.getEnemyName());
		history.setEnemyName("pavan");
		System.out.println("Modifing enemy name:" + history.getEnemyName());
		System.out.println("king name:" + history.kingName);
		System.out.println("queen Name:" + history.queenName);
		System.out.println("writer name:" + history.writer);
		System.out.println("kingdoum Name:" + history.kingdoumName);
		System.out.println("theKingIsDead:" + history.theKingIsDead);
		System.out.println("his Commander:" + history.hisCommander);
		System.out.println("no Of Writers:" + history.noOfWriters);
		System.out.println("no Of Flags:" + history.noOfFlags);
		System.out.println("hisProperty :" + history.hisProperty);
		System.out.println("no Of Soldiers:" + history.noOfSoldiers);
	}

}
