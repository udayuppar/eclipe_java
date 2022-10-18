package com.uday.copies.boot;

public class MetroStation {

	public String stationName;
	public String state;
	public int stationId;
	public int numberOfPlatform;
	public int numberOfEscalator;
	public String[] employName;
	public String[] nextStations;
	public String[] trainName;
	public int[] employId;
	public String[] behindStations;

	public MetroStation(String stationName, String state, int stationId, int numberOfPlatform, int numberOfEscalator,
			String[] employName, String[] nextStations, String[] trainName, int[] employId, String[] behindStations) {
		this.stationName = stationName;
		this.state = state;
		this.stationId = stationId;
		this.numberOfPlatform = numberOfPlatform;
		this.numberOfEscalator = numberOfEscalator;
		this.employName = employName;
		this.nextStations = nextStations;
		this.trainName = trainName;
		this.employId = employId;
		this.behindStations = behindStations;
		System.out.println("print the default constructer");
	}

	public void display() {
		System.out.println(this.stationName);
		System.out.println(this.state);
		System.out.println(this.stationId);
		System.out.println(this.numberOfPlatform);
		System.out.println(this.numberOfEscalator);
		System.out.println("***********************************");

		System.out.println("all employs name");
		System.out.println("***********************************");
		for (int i = 0; i < employName.length; i++) {
			String string = employName[i];
			System.out.println(string);

		}
		System.out.println("***********************************");

		System.out.println("next Station names");
		System.out.println("***********************************");
		for (int i = 0; i < nextStations.length; i++) {
			String string = nextStations[i];
			System.out.println(string);

		}
		System.out.println("***********************************");

		System.out.println("train names");
		System.out.println("***********************************");
		for (int i = 0; i < trainName.length; i++) {
			String string = trainName[i];
			System.out.println(string);

		}
		System.out.println("***********************************");

		System.out.println("Employ ID");
		System.out.println("***********************************");
		for (int i = 0; i < employId.length; i++) {
			int string = employId[i];
			System.out.println(string);

		}
		System.out.println("***********************************");

		System.out.println("behind station names");
		System.out.println("***********************************");
		for (int i = 0; i < behindStations.length; i++) {
			String string = behindStations[i];
			System.out.println(string);

		}

	}

}
