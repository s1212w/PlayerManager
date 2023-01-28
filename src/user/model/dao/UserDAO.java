package user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.model.vo.User;

public class UserDAO {

	public int selectCheckLogin(Connection conn, String userId, String userPwd) {
		String query="SELECT COUNT(*) AS U_COUNT FROM USER_TBL WHERE USER_ID=? AND USER_PWD=?";
		int result = 0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt("U_COUNT");
			}
			rset.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		return result;
	}

	
	public User selectOneById(Connection conn, String userId) {
		String query = "SELECT * FROM USER_TBL WHERE USER_ID=?";
		User user = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				user = new User();
				user.setUserId(rset.getString("USER_ID"));
				user.setUserPwd(rset.getString("USER_PWD"));
				user.setUserName(rset.getString("USER_NAME"));
				user.setUserEmail(rset.getString("USER_EMAIL"));	
			}
			rset.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	
	public int insertUser(Connection conn, User user) {
		String query = "INSERT INTO USER_TBL VALUES(?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPwd());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserEmail());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	public int updateUser(Connection conn, User user) {
		String query = "UPDATE USER_TBL SET USER_PWD=?, USER_NAME=?, USER_EMAIL=? WHERE USER_ID=?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserPwd());
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getUserEmail());
			pstmt.setString(4, user.getUserId());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}


}
