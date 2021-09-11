package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int x=Integer.parseInt(request.getParameter("num1"));
		int y=Integer.parseInt(request.getParameter("num2"));
		Object z= request.getAttribute("num3");
		out.println("First no" +x);
		out.println("Second no" +y);
		out.println("Result" +z);
		out.println("<a href='index.jsp'>BACK</a>");
	}

}
