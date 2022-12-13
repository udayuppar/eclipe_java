package com.uday.curd.ipl.repositiory;

import com.uday.curd.ipl.dto.IplDto;

public interface IplRepository {

	boolean create(IplDto ipl);

	default int total() {
		return 0;
	}

	default IplDto findTeamName(String name) {
		return null;
	}

}
