package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Fourth extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         
         out.println("<h1>hello  world of  fourth servlet</h1>");
         int  num1 =Integer.parseInt(request.getParameter("num1"));
         int  num2 =Integer.parseInt(request.getParameter("num2"));
         int res=num1+num2;
       
         out.println("<p>first no  "+num1+"</p>");
         out.println("<p>second no  "+num2+"</p>");
         out.println("<a href 'index.html'>Home Page</a>");
         out.println("<p>result   "+res+"</p>");
         out.close();
	}

}
