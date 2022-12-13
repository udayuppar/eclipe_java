package com.uday.curd.ipl.repositiory;

import java.time.LocalDateTime;

import com.uday.curd.ipl.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	boolean create(WarDTO[] wars);

	int total();
	
	WarDTO findByStartedBy(String startedBy);
	
	WarDTO findByStartedByAndStartedWith(String startedBy,String startedWith);
	
	WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date);
	
	WarDTO findByStartDateLessarThanOrEqualTo(LocalDateTime date);
	
	WarDTO findByStartDateAndEndDate(LocalDateTime start,LocalDateTime end);

}
