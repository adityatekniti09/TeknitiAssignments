package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		if(username.equals("system")&& password.equals("system"))
		{
			
			HttpSession session=request.getSession();
			session.setAttribute(username,username);
			/*response.sendRedirect("welcomehyderabad.jsp");*/
		}
		
		else
		{
			response.sendRedirect("Login.jsp");
		}
		}
	
	}


