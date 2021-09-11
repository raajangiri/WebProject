package pkg8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cookie1
 */
@WebServlet("/Cookie1")
public class Servlet1 extends HttpServlet {
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
		Cookie cookie1=new Cookie("raajan","admin");
		Cookie cookie2=new Cookie("Password","admin");
        
		cookie1.setComment("Test comment1");
		cookie2.setComment("Test comment2");
		
		cookie1.setMaxAge(60*60*24);
		cookie2.setMaxAge(60*60*24);
		
		cookie1.setSecure(false);
		cookie2.setSecure(false);
		
		cookie1.setVersion(0);
		cookie2.setVersion(0);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		out.println("<a href='servlet2'> Click </a>");

}

}
