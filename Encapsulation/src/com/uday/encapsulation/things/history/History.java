package com.uday.encapsulation.things.history;

public class History {
	String kingName = "uday";
	private String enemyName = "tippu";
	String queenName = "Asha";
	String writer = "ajay";
	String kingdoumName = "shivmogga";
	boolean theKingIsDead = false;
	String hisCommander = "kiran";
	int noOfWriters = 5;
	int noOfFlags = 1;
	double hisProperty = 5000;
	double noOfSoldiers = 1000;

	public String getEnemyName() {
		return enemyName;

	}

	void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}

	void setKingName(String kingName) {
		this.kingName = kingName;
	}

	void setQueenName(String queenName) {
		this.queenName = queenName;
	}

	void setWriter(String writer) {
		this.writer = writer;
	}

	void setKingdoumName(String kingdoumName) {
		this.kingdoumName = kingdoumName;
	}

	void setTheKingIsDead(boolean theKingIsDead) {
		this.theKingIsDead = theKingIsDead;
	}

	void setHisCommander(String hisCommander) {
		this.hisCommander = hisCommander;
	}

	void setNoOfWriters(int noOfWriters) {
		this.noOfWriters = noOfWriters;
	}

	void setNoOfFlags(int noOfFlags) {
		this.noOfFlags = noOfFlags;
	}

	void setHisProperty(double hisProperty) {
		this.hisProperty = hisProperty;
	}

	void setNoOfSoldiers(double noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

}
