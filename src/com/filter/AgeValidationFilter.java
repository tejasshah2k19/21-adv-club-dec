package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//
public class AgeValidationFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	// service
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		boolean isError = false;
		System.out.println("AgeValidationFilter::doFilter()");

		// goback with error

		String byear = request.getParameter("byear");
		if (byear == null || byear.trim().length() == 0) {
			isError = true;
			request.setAttribute("error", "Please Enter Birth Year");
		} else {

			try {
				int birthYear = Integer.parseInt(byear);
				if (birthYear > 2022) {
					isError = true;
					request.setAttribute("error", "Please Enter Correct Birth Year");
				}
			} catch (Exception e) {
				isError = true;
				request.setAttribute("error", "Please Enter Valid Birth Year");
			}

		}

		if (isError == true) {
			// bo back
			RequestDispatcher rd = request.getRequestDispatcher("AgeCalculator.jsp");
			rd.forward(request, response);
		} else {

			// go ahead
			chain.doFilter(request, response);// go ahead - servlet | filter 
		}
	}

	public void destroy() {

	}

}
