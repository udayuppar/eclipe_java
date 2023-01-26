package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/win")
public class KingServlet extends HttpServlet {
	
	public KingServlet() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		
		String name=req.getParameter("kingName");
		String region=req.getParameter("region");
		String queens=req.getParameter("queens");
		String birth=req.getParameter("birth");
		String death=req.getParameter("death");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(birth);
		System.out.println(death);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("king name"+ name + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("king region  "+ region + "  is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("king queens  "+ queens + "  is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("king birth day date  "+ birth + "  is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("king death day date  "+ death + "  is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
	}

}
