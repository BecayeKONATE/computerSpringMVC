package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.UserValidation;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	UserValidation yes = new UserValidation();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String nom = request.getParameter("nom");
		String pw = request.getParameter("pass");
		
		boolean valid = yes.isValid(nom, pw);
		if(valid) {
		request.getSession().setAttribute("name", nom);
		response.sendRedirect("/computer.do");
		}else {
			request.setAttribute("errorMessage", "User name or password not valid");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
		}
	}
}
