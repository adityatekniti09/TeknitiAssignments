package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
public class PrintUserName extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		String username = request.getParameter("username");
		System.out.println("Hello");
		try {
			out=response.getWriter();
			response.setContentType("text/html");
			out.print("<html><header></header><body>"
					+ "Welcome Page to the user <H1>"
					+username+ "</body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(out!=null){
				out.close();
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		String username = request.getParameter("username");
		System.out.println("Hello Post");
		try {
			out=response.getWriter();
			response.setContentType("text/html");
			out.print("<html><header></header><body>"
					+ "Welcome Page to the user <H1>"
					+username+ "</body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(out!=null){
				out.close();
			}
		}
		
	/* void process(HttpServletRequest req, HttpServletResponse res,String s){
			
		}*/

	}
}


