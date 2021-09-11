package pkg10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;  


public class Filter extends HttpServlet {
	

  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest request, ServletResponse response,  
    FilterChain chain) throws IOException, ServletException {  
          
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String id =request.getParameter("txt_id");
	String password=request.getParameter("txt_pw");
	
	if (id!=("admin") && password!=("admin")) {
		
		out.println("invalid");
		RequestDispatcher rs=request.getRequestDispatcher("index.html");
		rs.include(request,response);
		
	

	} 
   // out.print("filter is invoked before");  
          
    //chain.doFilter(req, resp);//sends request to next resource  
          
  //  out.print("filter is invoked after");  
    }  
    public void destroy() {}  
}  


