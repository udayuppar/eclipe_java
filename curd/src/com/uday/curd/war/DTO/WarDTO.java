package com.uday.curd.war.DTO;

import java.time.LocalDateTime;

public class WarDTO  extends AbstractAuditDto{
	
	private String name;
	private  LocalDateTime startDate;
	private  LocalDateTime endDate;
	private  String startedBy;
	private  String startedWith;
	private String winBy;
	private int noOfDeaths;
	
	public WarDTO() {
			System.out.println("Running war DTO default const");
	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", winBy=" + winBy + ", noOfDeaths=" + noOfDeaths + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWinBy() {
		return winBy;
	}

	public void setWinBy(String winBy) {
		this.winBy = winBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}
	
	
	
	
	

}
