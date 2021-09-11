package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Third extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         String id=request.getParameter("id");
         out.println("<h1>hello  world of third servlet</h1>");
         
         out.println("<p>id "+id+"</p>");
         
         out.close();
	}

}
