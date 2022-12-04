package com.uday.connection.bridge.Interface.governor;

import com.uday.connection.bridge.Interface.follower.Pateints;

public class HospitalManagment {
	private Pateints pateints;
	
	public HospitalManagment() {
		System.out.println("default const running");
	}

	public HospitalManagment(Pateints pateints) {
		super();
		this.pateints = pateints;
	}
	public void check()
	{
		System.out.println("Running check method");
		if(this.pateints!=null)
		{
			boolean silence=this.pateints.maintainSilence();
			boolean smoking=this.pateints.smoking();
			if(silence==false && smoking==false)
			{
				System.out.println("hospital is follow the rules");
			}
			else {
				System.out.println("hospital is not follow the rules");
			}
			
		}
	}

}
