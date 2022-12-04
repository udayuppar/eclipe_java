package com.uday.connection.bridge.Interface.governor;

import com.uday.connection.bridge.Interface.rulls.BankRules;

public class RBI  {
	private BankRules bank;
	
	public RBI() {
		System.out.println("default const running");
	}

	public RBI(BankRules bank) {
		super();
		this.bank = bank;
	}
	
	public void check()
	{
		System.out.println("running check balence");
		if(this.bank!=null)
		{
			 double balence=this.bank.balence();
			 boolean  maintain=this.bank.maintaineMimBalence();
			 if(balence==0 && maintain==true)
			 {
				 System.out.println("bank is follow the rules");
			 }
			 else {
				 System.out.println("Bank is not follow the rules");
			 }
		}
	}
	
}
