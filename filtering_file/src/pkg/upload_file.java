package pkg;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class upload_file extends HttpServlet {
	String uploadpath = "E:\\MyFiles";

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		boolean result = false;
		try {

			MultipartRequest m = new MultipartRequest(request, uploadpath);
			out.print("successfully uploaded");

		} catch (Exception ex) {
			result = false;
		}
		if (result == true) {
			out.println("file upload successfully");

		} else {
			out.println("error to upolad the file");
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);

		File file = new File(uploadpath);
		File all_files[] = file.listFiles();
		out.println(all_files.length);
		out.println("<table>");
		out.println("<tr> <td>SN</td> <td> file name</td> <td>type</td><td>SIZE(KB)</td><td>DATE/TIME</td> </tr>");

		for (int i = 0; i < all_files.length; i++) {

			int sn = i + 1;
			String file_name = all_files[i].getName();
			// String file_type=(all_files[i].isFile()?"<File>":"<DIR>");
			String file_type = "DIR";

			if (all_files[i].isFile() == true) {
				file_type = "file";
			}
			
			

			double file_size = all_files[i].length();
			long date_time = all_files[i].lastModified();
			//Date date_modifier = Myutils.TimeStampToDate(date_time);
			Myutils s=new Myutils();
			Date date_modifier = s.TimeStampToDate(date_time);
			
			

			out.println("<tr><td>" + (i + 1) + "</td><td> <a href='" + all_files[i] + "'>" + file_name + " </td> <td> "
					+ file_type + "</td> <td>" + file_size + "</td> <td>  " + date_modifier + "</td></tr>");
		}

		out.close();

	}

}
