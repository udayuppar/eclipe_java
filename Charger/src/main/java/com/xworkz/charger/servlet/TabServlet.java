package com.xworkz.charger.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/source")
public class TabServlet extends HttpServlet {

	public TabServlet() {
		System.out.println("Create:" + getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig confi) throws ServletException {
		System.out.println("Running init in server");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in server");
		String data="Gobi manchuri,pani puri,samosa";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		String data="Lemon juice,orang juice,Apple juice";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doput in server");
		String data="pinapal, sapota,apple";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelete in server ");
		String data="MI,oppo,vivo";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	
	 @Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doHead in server");
		String data="HP,dell,Apple";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	 
	 @Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOption in server");
		String data="maal,pg,room,food";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	 
	 @Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace in Server");
		String data="bengalur,mysure,shivmogga";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	

}
