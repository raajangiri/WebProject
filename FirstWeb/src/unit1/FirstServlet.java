package unit1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("test/html"); 
		PrintWriter out=response.getWriter();
		out.println("hello wold of java servlet");
		out.close();

	}

}
