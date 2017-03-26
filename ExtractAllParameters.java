package com.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author jithu
 * Servlet to Extract all parameters hold by request
 * */
public class ExtractAllParameters extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside the servlet");
		
		//System.out.println(">>>>>"+request.getAttribute("username"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String paramName = parameterNames.nextElement();
			out.write(paramName);
			//out.write("\n");
			String[] paramValues = request.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				out.write("\t" + paramValue);
				out.write("\n");
			}
		}
		out.close();
	}
}


