package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class DbSearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String searchName = request.getParameter("searchName"); // ra
		UserDao userDao = new UserDao();

		ArrayList<UserBean> users = userDao.searchUserByName(searchName);
		request.setAttribute("users", users);
		
		request.getRequestDispatcher("SearchList.jsp").forward(request, response);
	}
       
}
