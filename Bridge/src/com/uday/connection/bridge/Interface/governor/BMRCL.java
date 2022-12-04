package com.uday.connection.bridge.Interface.governor;

import com.uday.connection.bridge.Interface.rulls.MetroRulls;

public class BMRCL {
	private MetroRulls metrorulls;

	public BMRCL() {
		System.out.println("default const running");
	}

	public BMRCL(MetroRulls metrorulls) {
		super();
		this.metrorulls = metrorulls;
	}
	
	public void metro()
	{
		System.out.println("running metro method ");
		if(metrorulls!=null)
		{
			boolean smoking=this.metrorulls.smoking();
			String mask=this.metrorulls.wearAMask();
			if(smoking==false && mask==null)
			{
				System.out.println("pasengers are following the rulles");
			}
			else {
				System.out.println("pasengers are not following the rulles");
			}
		}
	}

}
