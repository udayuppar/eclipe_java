package com.uday.connection.bridge.Interface.runner;

import com.uday.connection.bridge.Interface.follower.Readers;
import com.uday.connection.bridge.Interface.governor.Librarian;

public class LibrarianRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Readers readers=new Readers();
		Librarian librarian=new Librarian(readers);
		librarian.books();
		

	}

}
