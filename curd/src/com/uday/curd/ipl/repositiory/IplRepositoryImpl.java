package com.uday.curd.ipl.repositiory;
 
import com.uday.curd.ipl.dto.IplDto;
import com.uday.curd.ipl.exceptions.IplExceptions;

public class IplRepositoryImpl implements IplRepository {
	
	
	private IplDto[] ipls=new IplDto[10];
	private int index=0;	

	@Override
	public boolean create(IplDto ipl) {
		System.out.println("Running Created Ipl:"+ipl);
		if(this.index>=this.ipls.length) {
			throw new IplExceptions();
		}
		this.ipls[this.index]=ipl;
		System.out.println("save"+ipl+"index"+this.index);
		this.index++;
		
		return true;
	}
	
	@Override
	public IplDto findTeamName(String name) {
		System.out.println("running find team name");
		
		for(IplDto check:this.ipls) {
			if(check!=null && check.getTeamName().equals(name)) {
				System.out.println("name Matched:"+name);
				return check;
			}
			else {
				System.out  .println("name do not matched");
				return check;
			}
		}
		return IplRepository.super.findTeamName(name);
	}

}
