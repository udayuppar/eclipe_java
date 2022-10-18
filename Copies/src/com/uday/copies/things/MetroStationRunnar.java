package com.uday.copies.things;

import com.uday.copies.boot.MetroStation;

public class MetroStationRunnar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "Uday", "Akash", "Ajay", "Sanju", "vittal" };
		String[] temp = { "SandalSoapFactary", "Mahalakshmi", "Rajajinagar", "MahaKaviKuvempuRoad" };
		String[] name = { "Ganga", "Thunha", "Sharavathi", "Kaveri", "yamuna" };
		int[] value = { 23, 21, 24, 26, 27 };
		String[] cost = { "GoraGuntePalya", "Peenya", "PeanyaEndustry", "Jalahalli", "Dasarahalli" };

		MetroStation metro = new MetroStation("Yashwanthpur", "karnataka", 5, 2, 4, items, temp, name, value, cost);
		System.out.println(metro.stationName);
		System.out.println(metro.state);
		System.out.println(metro.stationId);
		System.out.println(metro.numberOfPlatform);
		System.out.println(metro.numberOfEscalator);
		System.out.println(metro.employName);
		System.out.println(metro.nextStations);
		System.out.println(metro.trainName);
		System.out.println(metro.employId);
		System.out.println(metro.behindStations);
		metro.display();

	}

}
