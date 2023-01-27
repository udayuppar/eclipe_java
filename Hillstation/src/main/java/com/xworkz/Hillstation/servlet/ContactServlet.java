package com.xworkz.Hillstation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/uday")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post in server");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobileNumber=req.getParameter("mobileNumber");
		String comments=req.getParameter("comments");
		
		
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobileNumber);
	System.out.println(comments);
	
	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");
	if(name.length()>3 && email.length()>3 && comments.length()>3 ) {
	writer.print("<span style='color:green'>");
	writer.print("Contact is sent succesfully:"+name);
	writer.print("</span>");
	}else {
		writer.print("<span style='color:red'>");
		writer.print(" In valid Contact :"+name);
		writer.print("</span>");
		
	}
	writer.print("</h1>");
	writer.print("<a href=\"index.html\">Home page</a>");
	writer.print("<br>");
	writer.print("<a href=\"contact.html\">Location page</a>");
	writer.print("</body>");
	writer.print("</html>");
	
	resp.setContentType("text/html");
	}

}
