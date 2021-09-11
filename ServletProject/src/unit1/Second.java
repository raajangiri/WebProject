package unit1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Second() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("txt_id"));
		out.println("get method ") ;
		out.println("ID :" +id) ;
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("txt_id"));
		out.println("post method ") ;
		out.println("ID :"    +id) ;
		
		out.println("context path:" +request.getContextPath());
//		out.println("parts"+request.getParts());
		
//		out.println("parth"+request.getPathInfo());
//		out.println("URI"+request.getRequestURI());
//		out.println("URl"+request.getRequestURL());
		
		response.setHeader("hi","hfj");
		Cookie cookie =new Cookie("c1","value");
		response.addCookie(cookie);
		
		ArrayList list=(ArrayList)response.getHeaderNames();
		for(int i=0;i<list.size();i++)
		{
			out.println("header names :"+list.get(i));
			
		}
		
		out.println("status code" +response.getStatus());
		
		out.close();
	}

}
