package com.xworkz.brocode.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 2 ,urlPatterns = "/Mikcher")
public class FastRackServlet extends HttpServlet {
	 public FastRackServlet() {
	System.out.println("create:"+getClass().getSimpleName());
	}
	 
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Create do get in FastRack");
	}

}
