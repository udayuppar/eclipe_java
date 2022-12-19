package com.uday.curd.bekery.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public  abstract class AbstactAduitDto implements Serializable {
	private String createdBy;
	private String updatedBy;
	private LocalDateTime criatedDate;
	private LocalDateTime updatedDate;
	
	public AbstactAduitDto() {
		System.out.println("Running Default Const");
	}

	public AbstactAduitDto(String createdBy, String updatedBy, LocalDateTime criatedDate, LocalDateTime updatedDate) {
		super();
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.criatedDate = criatedDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", criatedDate=" + criatedDate
				+ ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
