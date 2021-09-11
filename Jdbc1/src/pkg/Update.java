package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg2.Database;
import pkg2.Person;



public class Update extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("txt_id"));
		String full_name=request.getParameter("txt_name");
		String contact=request.getParameter("txt_contact");
		Database db=new Database();
		Person person=new Person(id,full_name,contact);
		boolean res=db.updateRecord(person);
		
		if(res)
		{
			out.println("record update successfully");
			
		}else
		{
			out.println("record not found");
			
		}
		out.println("<a href='index.jsp'>BACK</a>");

		out.close();
	}

}
