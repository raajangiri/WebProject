package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg2.Database;
import pkg2.Person;

public class DisplayAll extends HttpServlet {

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
		// Get PrintWriter
		PrintWriter out = response.getWriter();

		// Create Database Object
		Database db = new Database();

		// Get list of Person
		List<Person> persons = db.getAll();

		// Set the content type
		response.setContentType("text/html");

		// Display details
		out.println("<h3>All Persons</h3>");
		// Create table
		out.println("<table cellpadding = '10' border = '1' style = 'border-collapse: collapse;'>");
		out.println("<tr><td>ID</td><td>Name</td><td>Contact</td></tr>");
		// Check if the list is empty
		if (!persons.isEmpty()) {
			// If not display the details
			for (Person p : persons) {
				out.println("<tr><td>" + p.getId() + "</td><td>" + p.getFull_name() + "</td><td>" + p.getContact()
						+ "</td></tr>");
			}
		} else {
			// If empty display this message
			out.println("There are no records in database.");
		}
		out.println("</table>");

		// Go back to homePage
		out.println("<a href = 'index.jsp'>Back to home page</a>");

		// Close PrintWriter
		out.close();
	}

}
