package unit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Fifth extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
          response.setContentType("text/html");
          PrintWriter out=response.getWriter();
          out.println("<html>");
          out.println("<head>");
          out.println("<title>First Web Form");
          out.println("</title>");
          out.println("</head>");
          out.println("<body>");
          out.println("<form method='get' action='sixth'>");
          out.println("ID :<input type='text' name='txt_id'></br>");
          out.println("Name :<input type='text' name='txt_name'></br>");
          out.println("Address :<input type='text' name='txt_address'></br>");
          out.println("<input type='submit' name='btn_send' value='send'>");
          out.println("</form>");
          out.println("</body>");
          
          out.println("</html>");
	}

}
