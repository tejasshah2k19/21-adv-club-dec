package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NameValidationFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("NameValidationFilter::doFilter()");

		String name = request.getParameter("name");

		boolean isError = false;
		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Name");
		}

		if (isError) {
			RequestDispatcher rd = request.getRequestDispatcher("AgeCalculator.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);//servlet 
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
