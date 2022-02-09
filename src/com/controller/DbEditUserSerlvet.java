package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

import jdk.nashorn.internal.runtime.RewriteException;

public class DbEditUserSerlvet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		UserDao userDao = new UserDao();
		UserBean user = userDao.getUserDetailById(userId);

		request.setAttribute("user",user);
		
		request.getRequestDispatcher("DbEditUser.jsp").forward(request, response);
	}

}
