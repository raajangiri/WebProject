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

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
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
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("txt_id"));
		Database db = new Database();
		Person person = db.search(id);
		if (person != null) {
			out.println("<form action='update' method ='post'>");
			out.println("id:<input type='hidden' name='txt_id' value='" + person.getId() + "'><br>");
			out.println("name:<input type='text' name='txt_name' value='" + person.getFull_name() + "'><br>");
			out.println("contact:<input type='text' name='txt_contact' value='" + person.getContact() + "'><br>");

			out.println("<input type='submit' value='UPDATE'>");
			out.println("</form>");
		} else {
			
			out.println("record not found from edit ");

		}
		out.println("<a href='index.jsp'>BACK</a>");

		out.close();
	}

}
