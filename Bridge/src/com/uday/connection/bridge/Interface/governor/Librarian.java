package com.uday.connection.bridge.Interface.governor;

import com.uday.connection.bridge.Interface.follower.Readers;

public class Librarian {
	private Readers readers;
	
	public Librarian() {
		System.out.println("default cons running");
	}

	public Librarian(Readers readers) {
		super();
		this.readers = readers;
	}
	public void books()
	{
		System.out.println("running books");
		if(readers!=null)
		{
			boolean silence=this.readers.keepSilence();
			boolean mobile=this.readers.swichOfTheMobile();
			if(silence==false && mobile==false)
			{
				System.out.println("Readers are following the rulles");
			}
			else {
				System.out.println("Readers are not following the rulles");
			}
		}
	}

}
