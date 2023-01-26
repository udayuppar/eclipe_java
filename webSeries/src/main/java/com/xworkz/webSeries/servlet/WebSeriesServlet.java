package com.xworkz.webSeries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1 ,urlPatterns = "/money")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		
		String name=req.getParameter("webSeriesName");
		String language=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String OTT=req.getParameter("OTT");
		String budget=req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(OTT);
		System.out.println(budget);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("web series name"+ name + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("web series language"+ language + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("web series episodes"+ episodes + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("web series ott"+ OTT + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("web series budget"+ budget + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}

}
