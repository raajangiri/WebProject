package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Seventh extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> CALCULATOR</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method='get' action='eighth'>");
		
		out.println("Fitst No :<input type='text' name='txt_first'></br>");
		out.println("Second No:<input type='text' name='txt_second'></br>");
		
		out.println("<input type='submit' name='btn' value='add'></br>");
		out.println("<input type='submit' name='btn' value='diff'></br>");
		
		out.println("</form>");
		out.println("/body");
		
		out.println("</html>");

	}

}
