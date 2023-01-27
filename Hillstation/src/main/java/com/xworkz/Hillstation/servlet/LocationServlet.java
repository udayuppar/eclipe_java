package com.xworkz.Hillstation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/Shivmogga")
public class LocationServlet extends HttpServlet {
	
	public LocationServlet() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost in server");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String startingPoint=req.getParameter("startingPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startingPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3 && email.length()>3 && startingPoint.length()>3 && destination.length()>3) {
		writer.print("<span style='color:green'>");
		writer.print("Location is sent succesfully:"+name);
		writer.print("</span>");
		}else {
			writer.print("<span style='color:red'>");
			writer.print(" In valid Location :"+name);
			writer.print("</span>");
			
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">Location page</a>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}

}
