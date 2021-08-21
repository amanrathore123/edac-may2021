package com.controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Admin;
import service.RegisterService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminName = request.getParameter("name");
		String adminMobile = request.getParameter("mobile");
		String adminEmail = request.getParameter("email");
		String adminPwd = request.getParameter("password");

		Admin admin = new Admin(adminName, adminMobile, adminEmail, adminPwd);
    
		boolean isNewAdmin = RegisterService.register(admin);
		if (isNewAdmin) {
			System.out.println("inside else block");
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("mail", adminEmail);
			httpsession.setAttribute("password", adminPwd);
			response.sendRedirect("profile.jsp");
			
		} else {
			response.sendRedirect("login1.jsp?message= Already registered");
			
		}

	}

}
