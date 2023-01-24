package com.uday.association.things.person;

public class Location {
	public int no;
	public String street;
	public State state=new State("karnataka","India",88615364l,200);
	public City city=new City("Shivmogga", 65423147l, false, "shivamogga");
	public Country country=new Country("India","delhi",984561357l,"Modi");
	
	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}
	public void check()
	{
		System.out.println(no);
		System.out.println(street );
		System.out.println("******************************");
		if(state!=null&&city!=null&&country!=null)
		{
			state.kill();
			city.shoot();
			country.charge();
		}
		
		System.out.println(no);
		System.out.println(street);
	}

}
