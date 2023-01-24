package com.uday.inheritence.things.equality.boot;



import com.uday.inheritence.things.equality.things.*;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setName("Excel");
		paint.setBrand("Asian Paints");
		paint.setColour("Block");
		paint.setPrice(3000);
		paint.setShopName("Shree sai");
		paint.setManufDate("20/10/2022");
		paint.setWeight(2);
		paint.setQuality(true);
		paint.setQuantity(2);
		paint.setOwnerName("akash");
		System.out.println(paint);

		Paint paint2 = new Paint("Royale", "Asian Paints", "Red", 5000, "Sapthagiri", "22/11/2022", 1, false, 10,
				"uday");
		System.out.print(paint2);

		boolean same = paint.equals(paint2);
		System.out.println(same);
		// paint=paint2;
		// System.out.println(paint==paint2);
		System.out.println("************************************************************");

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Royal enfeild");
		vehicle.setBrand("Himalayan");
		vehicle.setPrice(300000);
		vehicle.setOwnerName("uday");
		vehicle.setModel("Classic");
		vehicle.setWeight(25);
		vehicle.setQuality(true);
		vehicle.setNumber("KA-66-695");
		vehicle.setLoanOrCash("Cash");
		vehicle.setLocation("Shivmogga");
		System.out.println(vehicle);

		Vehicle vehicle2 = new Vehicle("Royal enfeild", "Himalayan", 350000, "Arun", "enfeild", 20, false, "KA-66-515",
				"loan", "tarikere");
		System.out.println(vehicle2);

		boolean bike = vehicle.equals(vehicle2);
		System.out.println(bike);
		// vehicle=vehicle2;
		// System.out.println( vehicle==vehicle2);
		System.out.println("***********************************************");

		WaterBottel bottel = new WaterBottel();
		bottel.setName("Bisleri");
		bottel.setBrand("Bisleri");
		bottel.setPrice(20);
		bottel.setOwnerName("Uday");
		bottel.setModel("Bislery");
		bottel.setWeight(500);
		bottel.setQuality(true);
		bottel.setQuantityInLit(true);
		bottel.setHeightInInch(25);
		bottel.setHotOrCold("cold");
		System.out.println(bottel);

		WaterBottel bottel2 = new WaterBottel("Bisleri", "Bisleri", 10, "Shashi", "2.0", 450, true, true, 20, "normal");
		System.out.println(bottel2);

		boolean bottel3 = bottel.equals(bottel2);
		System.out.println(bottel3);
		 bottel=bottel2;
		 System.out.println(bottel==bottel2);

		System.out.println("----------------------------------------------");

		Currancy currancy = new Currancy("local", 20, 'R', 12, false, "india", 90, "paper", 120, "only few");
		System.out.println(currancy);
		
		
		Currancy currancy2 = new Currancy("local", 20, 'R', 12, false, "india", 90, "paper", 120, "only few");
		System.out.println(currancy2);

		boolean ref = currancy.equals(currancy2);
		System.out.println(ref);
		// currancy=currancy2;
		// System.out.println(currancy==currancy2);
		
		System.out.println("********************************************");

		God god = new God();
		god.setEntryFees(65);
		god.setGodCode('g');
		god.setGodPoojaName("arati");
		god.setLocation("tirupati");
		god.setName("venkatesh");
		god.setOriginalName("balaji");
		god.setPowerFull(true);
		god.setPriestName("mahanandiswami");
		god.setTotalDieties(15);
		god.setTotalTemples(100);
		System.out.println(god);
	

		God god2 = new God("manjunath", "manjunath", 10, 'M', "darmasthala", 6, "prabhu", 20, true, "malarpane");
		System.out.println(god2);
		boolean god3 = god.equals(god2);
		System.out.println(god3);
		System.out.println("*********************************************");

		Institution institution = new Institution();
		institution.setCode('I');
		institution.setFees(3654598L);
		institution.setGood(true);
		institution.setLocation("mumbai");
		institution.setName("IIT");
		institution.setPrincipalName("ramesh");
		institution.setTotalBranches(65);
		institution.setTotalRevenue(854566988L);
		institution.setTotalStaffs(250);
		institution.setType("technology based");
		System.out.println(institution);

		Institution institution2 = new Institution("IIM", "management", 85460L, 125, 'i', "bharatkumar", "delhi",
				4521365L, false, 10);
		System.out.println(institution2);
		boolean xworkz = institution.equals(institution2);
		System.out.println(xworkz);
		System.out.println("*********************************************");

		Hospital hospital = new Hospital();
		hospital.setCharges(650);
		hospital.setGood(false);
		hospital.setHospitalCode('H');
		hospital.setLocation("bengaluru");
		hospital.setMdName("madhavan");
		hospital.setName("apollo");
		hospital.setTotalBranches(125);
		hospital.setTotalRevenue(6523641L);
		hospital.setTotalStaffs(600);
		hospital.setType("multi-speciality");
		System.out.println(hospital);

		Hospital hospital2 = new Hospital("people-tree", "eye-hospital", 800, 80, 'm', "ramesh", "hyderabad", 85652365L,
				false, 28);
		System.out.println(hospital2);

		boolean hosp = hospital.equals(hospital2);
		System.out.println(hosp);
		System.out.println("*********************************************");

		Lipstik lips = new Lipstik();
		lips.setBrand("lakme");
		lips.setName("lipstik");
		lips.setPrice(800);
		lips.setColors("red");
		lips.setGender("f");
		lips.setSkinTone("soft");
		lips.setUser("Girls");
		lips.setNo_Of_items(25);
		lips.setDistric("Shivmogga");
		lips.setState("Karnataka");
		lips.setCountry("India");
		System.out.println(lips);

		Lipstik lips2 = new Lipstik("lion", "eye liner", 800, "red", "f", "soft", "Girls", 25, "Shivmogga", "Karnataka",
				"India");
		System.out.println(lips2);

		boolean lips3 = lips.equals(lips2);
		System.out.println(lips3);
		// lips=lips2;
		// System.out.println(lips==lips2);

	}
}
