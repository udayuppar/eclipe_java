package com.xworkz.brocode.servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/Sooda")
public class TitanServlet extends HttpServlet {
	public TitanServlet() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Craeting do get in Titan");
	}

}
