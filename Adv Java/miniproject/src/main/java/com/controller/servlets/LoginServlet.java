package com.controller.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Admin;
import service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		System.out.print("inside servlet :" + request.getServletPath());
		System.out.print("inside servlet :" + request.getPathTranslated());
		Admin admin = new Admin(email, pwd);

		boolean isAdmin = LoginService.login(admin);
		if (isAdmin) {
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("mail", email);
			httpsession.setAttribute("password", pwd);
			response.sendRedirect("profile.jsp");
		} else
			response.sendRedirect("login1.jsp?message=Either user name or password is wrong");
	}
}
