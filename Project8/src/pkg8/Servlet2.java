package pkg8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie my_cookie []= request.getCookies();
		out.println("Total cookie :"+ my_cookie.length  + "</br>");
		for (int i=0; i<my_cookie.length;i++)
		{
			
			String name=my_cookie[i].getName();
			String value=my_cookie[i].getValue();
			String comment=my_cookie[i].getComment();
			int age=my_cookie[i].getMaxAge();
			String path=my_cookie[i].getPath();
			int version=my_cookie[i].getVersion();
			
			out.println("</br> Cookie_" +(i+1)+"   details</br>");
			out.println("NAME:"+name+"</br>");
			out.println("value:"+value+"</br>");
			out.println("age:"+age+"</br>");
			out.println("path:"+path+"</br>");
			out.println("version:"+version+"</br>");
					
		}
	
}

}
