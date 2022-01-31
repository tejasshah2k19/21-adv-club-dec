package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public ArrayList<UserBean> getAllUsers() {

		Connection con = null;
		PreparedStatement stmt = null;
		ArrayList<UserBean> users = new ArrayList<>();
		try {
			con = DbConnection.openConnection();
			stmt = con.prepareStatement("select * from users");

			ResultSet rs = stmt.executeQuery();// db

			// rs.next(); // boolean -> true | false
			while (rs.next()) {

				UserBean userBean = new UserBean();

				userBean.setUserId(rs.getInt("userId"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setFirstName(rs.getString("firstName"));

				users.add(userBean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public void insertUser(UserBean userBean) {
		// connection open
		// query

		Connection con = null; // connection
		PreparedStatement pstmt = null;
		// Statement

		// PreparedStatement --> preCompile

		// CallableStatement -- store procedure , function , views --> PL/SQL
		try {
			con = DbConnection.openConnection();
			pstmt = con.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");//
			pstmt.setString(1, userBean.getFirstName());
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getPassword());

			int record = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
