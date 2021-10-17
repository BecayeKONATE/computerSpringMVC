package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ComputerService;

@WebServlet(urlPatterns = "/addComputer.do")
public class AddServlet extends HttpServlet {

ComputerService cs = new ComputerService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("cars", cs.getAllComputer());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String price = request.getParameter("pr");
		String image = request.getParameter("img");
		
		cs.addComputer(make, model, price, image);
		response.sendRedirect("/car.do");
	}
}
