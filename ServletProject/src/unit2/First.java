package unit2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public First() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id =request.getParameter("txt_id");
		String password =request.getParameter("txt_password");
		
		if (password.equals("admin")&& id.equals("admin"))
		{
		
		RequestDispatcher rd=request.getRequestDispatcher("Success");
		 rd.forward (request, response);
		
		}
		 else{  
		        
		        RequestDispatcher rd=request.getRequestDispatcher("Error");  
		        rd.forward(request, response);  
		                      
		        }  
			
		out.println();
	}

}
