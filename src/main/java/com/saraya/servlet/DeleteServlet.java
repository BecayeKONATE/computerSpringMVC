package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ComputerService;

@WebServlet(urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
	ComputerService cs = new ComputerService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		cs.deleteComputer(id);
		response.sendRedirect("/car.do");
	}

}
