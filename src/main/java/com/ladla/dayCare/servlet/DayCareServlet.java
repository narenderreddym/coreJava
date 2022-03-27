package com.ladla.dayCare.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.ladla.dayCare.service.DayCareService;

public class DayCareServlet implements Servlet{

	@Override
	public void destroy() {
	}
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}
	@Override
	public String getServletInfo() {
		return null;
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int rNo = Integer.parseInt(req.getParameter("rollNo"));
		String kidName = req.getParameter("kidName");

		DayCareService service= new DayCareService();
		String response="";
		try {
			response= service.saveKidDetails(rNo, kidName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}
}
