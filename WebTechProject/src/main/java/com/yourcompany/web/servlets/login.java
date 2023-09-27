package com.yourcompany.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.ServletException;
////import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet{

		 String email, password;
		 
		 public void service(HttpServletRequest req, HttpServletResponse res) {
				email = req.getParameter("email");
				
				password = req.getParameter("password");
				
			
				
				try {
					
					PrintWriter out = res.getWriter();
					
					if(email != null && password != null ) {
						
						if(email.equalsIgnoreCase("christale@gmail.com") && password.equalsIgnoreCase("christale")) {
							out.println("Your Email is "+email+ "and Your Password is" + password );
							res.sendRedirect("welcome.html");

						}else {
							out.println("Invalid email");
							 res.sendRedirect("forgotPassword.html");
						}
					}
					
					
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
		 } }


