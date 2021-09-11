package pkg6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S001")
public class Context extends HttpServlet {
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
		out.println("hello from context");
		// Reading Global Value
		ServletContext scx = getServletContext();
		String site_name = scx.getInitParameter("site_name");
		out.println("Site name : " + site_name);

		// Reading Local Value
		ServletConfig scf = getServletConfig();
		String email = scf.getInitParameter("servlet_email");
		out.println("Site email : " + email);

		out.println("<a href='index.html'>BACK</a>");

	}

}
