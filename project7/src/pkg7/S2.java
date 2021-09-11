package pkg7;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/S2")
public class S2 extends HttpServlet {
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
		Date date;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		String id = (String) session.getAttribute("id");
		String password = (String) session.getAttribute("password");
		String uniqueID = session.getId();
		long creationTime = session.getCreationTime();
		date = new Date(creationTime);
		String createdOn = formatter.format(date);
		long lastAccessedTime = session.getLastAccessedTime();
		date = new Date(lastAccessedTime);
		String lastAccessed = formatter.format(date);
		long maxInactiveInterval = session.getMaxInactiveInterval();
		
		out.println("<h1>Session Details</h1>");
		out.println("<p>ID: " + id + "</p>");
		out.println("<p>Password: " + password + "</p>");
		out.println("<p>UniqueID: " + uniqueID + "</p>");
		out.println("<p>Creation Time: " + createdOn + "</p>");
		out.println("<p>Last Accessed: " + lastAccessed + "</p>");
		out.println("<p>Max Inactive Interval: " + maxInactiveInterval + "</p>");
		
	}

}

