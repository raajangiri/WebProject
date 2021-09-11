package raajan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process
 */
@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String form1=request.getParameter("txt_name");
//		out.println("Name" +form1);
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String form2=request.getParameter("txt_name");
//		out.println("form 2" +form2);
		doProcess(request,response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String txt_name =request.getParameter("txt_name");
		txt_name=txt_name.toUpperCase();
		request.setAttribute("new_name",txt_name);
		
		out.println("form 2" +txt_name);
		RequestDispatcher rs=request.getRequestDispatcher("display");
		rs.forward(request,response);
		
	}
}
