package com.xworkz.map.dto;

public class CompanyCEODto {

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;
	private DaughterDto daughterdto;

	public CompanyCEODto() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODto(String name, String company, int age, String country, String qualification, boolean married,
			DaughterDto daughterdto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughterdto = daughterdto;
	}

	@Override
	public String toString() {
		return "CompanyCEODto [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daughterdto=" + daughterdto + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashcode ............");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method.....:" + obj);
		if (obj != null) {
			if (obj instanceof CompanyCEODto) {
				CompanyCEODto dto = (CompanyCEODto) obj;
				if (dto.name.equals(this.name) && dto.company.equals(this.company)
						&& dto.daughterdto.equals(this.daughterdto)) {
					System.out.println("Name , company are matched..:" + name + company);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDto getDaughterdto() {
		return daughterdto;
	}

	public void setDaughterdto(DaughterDto daughterdto) {
		this.daughterdto = daughterdto;
	}

}
