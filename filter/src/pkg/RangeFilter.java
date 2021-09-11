package pkg;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RangeFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean result=false;
		try {
			int tmp=Integer.parseInt(request.getParameter("txt_num1"));
			if(tmp<=0 ||tmp>=5) {
				result=false;
			}
			else {
				result=true;
			}
		}
		catch(Exception ex){
			result=false;
		}
		if(result) {
			chain.doFilter(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			response.getWriter().println("Error : number out of range (1-4)");
			rd.include(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
