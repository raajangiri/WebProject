package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HitCounter")
public class HitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int totalCount;
	public void init()
	{
		
		totalCount=0;
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		totalCount++;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Counter="+totalCount);
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}
}
