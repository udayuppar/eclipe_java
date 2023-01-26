package com.xworkz.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/movie")
public class MovieServlet extends HttpServlet {
	
	public MovieServlet() {
		System.out.println("Creat:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		
		String name=req.getParameter("movieName");
		String heroName=req.getParameter("heroName");
		String heroinName=req.getParameter("heroinName");
		String directorName=req.getParameter("directorName");
		String producerName=req.getParameter("producerName");
		String language=req.getParameter("language");
		String releasingDate=req.getParameter("releasingDate");
		String comedianName=req.getParameter("comedianName");
		String songs=req.getParameter("songs");
		String villenName=req.getParameter("villenName");
		String figth=req.getParameter("figth");
		String budget=req.getParameter("budget");
		String collection=req.getParameter("collection");
		String thearters=req.getParameter("thearters");
		String location=req.getParameter("location");
		String juniorActors=req.getParameter("juniorActors");
		String hit=req.getParameter("hit");
		String dancers=req.getParameter("dancers");
		String guestRoll=req.getParameter("guestRoll");
		String noOfPost=req.getParameter("noOfPost");
		
		System.out.println(name);
		System.out.println(heroName);
		System.out.println(heroinName);
		System.out.println(directorName);
		System.out.println(producerName);
		System.out.println(language);
		System.out.println(releasingDate);
		System.out.println(comedianName);
		System.out.println(songs);
		System.out.println(villenName);
		System.out.println(figth);
		System.out.println(budget);
		System.out.println(collection);
		System.out.println(thearters);
		System.out.println(location);
		System.out.println(juniorActors);
		System.out.println(hit);
		System.out.println(dancers);
		System.out.println(guestRoll);
		System.out.println(noOfPost);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Movie name"+ name + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Movie heroName"+ heroName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("heroin name"+ heroinName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:yellow'>");
		writer.print("directorName"+ directorName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("producer Name"+ producerName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("language"+ language + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("releasingDate"+ releasingDate + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("comedian Name"+ comedianName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("songs"+ songs + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("villen Name"+ villenName + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:yellow'>");
		writer.print("figth"+ figth + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("budget"+ budget + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("collection"+ collection + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("thearters"+ thearters + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("location"+ location + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("juniorActors"+ juniorActors + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:yellow'>");
		writer.print("hit"+ hit + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("dancers name"+ dancers + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("guestRoll name"+ guestRoll + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:block'>");
		writer.print("noOfPost"+ noOfPost + "is sent succesfully");
		writer.print("</span>");
		writer.print("</h1>");
		
	}

}
