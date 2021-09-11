package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sixth extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String id=request.getParameter("txt_id");
		String name=request.getParameter("txt_name");
		String address=request.getParameter("txt_address");
		
		out.println("<h1>Personal Details</h1>");
		out.println("<p>ID : "+id+"</p>"); 
		out.println("<p>Name : "+name+"</p>");
		out.println("<p>Address : "+address+"</p>");
		out.println("<a href = 'fifth'>BACK</a>");
		out.close();
		

	}

}
