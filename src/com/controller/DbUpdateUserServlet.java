package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class DbUpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		int userId = Integer.parseInt(request.getParameter("userId"));

		UserBean user = new UserBean();
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setUserId(userId);

		UserDao userDao = new UserDao();
		userDao.updateUser(user);
		
		response.sendRedirect("DbListUsersServlet");
	}

}
