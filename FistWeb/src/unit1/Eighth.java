package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Eighth extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double num1=Double.parseDouble(request.getParameter("txt_first"));
		double num2=Double.parseDouble(request.getParameter("txt_second"));
		String command=request.getParameter("btn");
		if (command.equals("add"))
		{
			
			double sum=num1+num2;
			out.println("sum is"  +sum);
		}
		else if (command.equalsIgnoreCase("diff"))
		{
			
			double diff=num1-num2;
			out.println("sum is"  +diff);
		}
		
	
		
		out.close();
		
		
		

	}

}
