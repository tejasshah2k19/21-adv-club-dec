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

	public ArrayList<UserBean> searchUserByName(String searchName) {

		Connection con = null;
		PreparedStatement stmt = null;
		ArrayList<UserBean> users = new ArrayList<>();
		try {
			con = DbConnection.openConnection();
			stmt = con.prepareStatement("select * from users where firstName like ?");
			stmt.setString(1, searchName + "%");
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

	public void deleteUser(int userId) {

		try {
			Connection con = DbConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, userId);

			int records = pstmt.executeUpdate();//
			System.out.println(records + " record(s) delete.....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserBean getUserDetailById(int userId) {
		Connection con = null;
		PreparedStatement stmt = null;
		UserBean user = null;
		try {
			con = DbConnection.openConnection();
			stmt = con.prepareStatement("select * from users where userId = ? ");
			stmt.setInt(1, userId);

			ResultSet rs = stmt.executeQuery();// db

			// rs.next(); // boolean -> true | false
			if (rs.next()) {

				user = new UserBean();
				user.setUserId(rs.getInt("userId"));
				user.setEmail(rs.getString("email"));
				user.setFirstName(rs.getString("firstName"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	public void updateUser(UserBean user) {

		try {
			Connection con = DbConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("update  users set firstName = ? , email = ?  where userId = ?");
			pstmt.setInt(3, user.getUserId());
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			
			

			int records = pstmt.executeUpdate();//
			System.out.println(records + " record(s) updated....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
