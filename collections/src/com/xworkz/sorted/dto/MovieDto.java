package com.xworkz.sorted.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MovieDto implements Serializable,Comparable<MovieDto> {
	
	private String name;
	private double budget;
	private LocalDate date;
	private double profit;
	private String language;
	
	public MovieDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieDto(String name, double budget, LocalDate date, double profit,String language) {
		super();
		this.name = name;
		this.budget = budget;
		this.date = date;
		this.profit = profit;
		this.language = language;
	}

	@Override
	public String toString() {
		return "MovieDto [name=" + name + ", budget=" + budget + ", date=" + date + ", profit=" + profit + ", language=" + language + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof MovieDto) {
				MovieDto casted=(MovieDto) obj;
				if(casted.name.equals(this.name) && casted.budget==(this.budget)) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int compareTo(MovieDto o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);// for String compare
		//return Double.compare(this.profit, o.profit);//double compare 
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
