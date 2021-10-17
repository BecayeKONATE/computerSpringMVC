package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ComputerService;

@WebServlet(urlPatterns = "/computer.do")
public class ComputerServlet extends HttpServlet {
	ComputerService cs = new ComputerService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("cars", cs.getAllComputer());
		request.getRequestDispatcher("/WEB-INF/views/listComputer.jsp").forward(request, response);
	}
}






