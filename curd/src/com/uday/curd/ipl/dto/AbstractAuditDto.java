package com.uday.curd.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public  abstract class AbstractAuditDto  implements Serializable{
	
	private String createdBy;
	private String updatedBy;
	private LocalDateTime criatedDate;
	private LocalDateTime updatedDate;
	
	public AbstractAuditDto() {
		System.out.println("running default const");
	}
	
	

	@Override
	public String toString() {
		return "AbstractAuditDto [criatedBy=" + createdBy + ", updatedBy=" + updatedBy + ", criatedDate=" + criatedDate
				+ ", updatedDate=" + updatedDate + ", toString()=" + super.toString() + "]";
	}



	public String getCriatedBy() {
		return createdBy;
	}

	public void setCriatedBy(String criatedBy) {
		this.createdBy = criatedBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCriatedDate() {
		return criatedDate;
	}

	public void setCriatedDate(LocalDateTime criatedDate) {
		this.criatedDate = criatedDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	

}
