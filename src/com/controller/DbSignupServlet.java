package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/DbSignupServlet")
public class DbSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");

		UserBean userBean = new UserBean();
		userBean.setEmail(email);
		userBean.setPassword(password);
		userBean.setFirstName(firstName);

		UserDao userDao = new UserDao();
		userDao.insertUser(userBean);

		// home

	}
}
