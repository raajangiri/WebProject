package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg2.Database;
import pkg2.Person;

public class Process2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("txt_id"));
		String full_name = request.getParameter("txt_name");
		String contact = request.getParameter("txt_contact");
		//out.println("connectiong database......" + new Date().toString());
		Database db = new Database();
		Person p = new Person(id, full_name, contact);
		if (db.insertRecord(p)) {
			out.println("connection sucessful record inserted ");
		} else
			out.println("connection fail record was unable to insert ");
		
		out.println("<a href='NewEntry.jsp' >Back</a>");

		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
