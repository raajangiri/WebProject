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

@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		Database db=new Database();
		Person person=db.search(id);
		if(person!=null)
		{
			out.println("ID :"+person.getId()+"<br>");
			out.println("Name :"+person.getFull_name()+"<br>");
			out.println("Address :"+person.getContact()+"<br>");
		}else
		{
			out.println("record not found");
			
		}
		out.println("<a href='index.jsp'>BACK</a>");

		out.close();
	}

}
