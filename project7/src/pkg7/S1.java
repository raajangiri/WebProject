package pkg7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("hello from s1");
		String name=request.getParameter("txt_name");
		String password=request.getParameter("txt_pw");
		if (name.equals("admin") && password.equals("admin")) 
		{
			out.println("hello from s1");
		HttpSession session=request.getSession();
		session.setAttribute("id",name);
		session.setAttribute("password",password);
		out.println("<a href='httpSession2'>value</a>");
		out.close();
		
		}
		else
		{
			
			out.println("hello from s1");
			RequestDispatcher rd= request.getRequestDispatcher("Forn1.html");
			rd.include(request,response);
		}
		
	}

}

