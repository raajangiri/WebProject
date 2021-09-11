package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class Filter1 implements Filter {


	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String num= request.getParameter("txt_num1");
		//int & double
		boolean result=false;
		try {
			Integer.parseInt(num);
			result=true;
		}
		catch(Exception x) {
			result=false;
		}
		if(result) {
			chain.doFilter(request,response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			response.getWriter().println("Error");
			rd.include(request, response);
			
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	public void destroy() {
		
	}


}
