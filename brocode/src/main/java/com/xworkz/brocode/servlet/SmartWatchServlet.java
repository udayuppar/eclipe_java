package com.xworkz.brocode.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 7, urlPatterns = "/drinking")
public class SmartWatchServlet extends HttpServlet {
	public SmartWatchServlet() {
		System.out.println("Creat:"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in SmartWatchServlet");
	}

}
