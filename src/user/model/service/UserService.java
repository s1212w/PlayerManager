package user.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import user.model.dao.UserDAO;
import user.model.vo.User;

public class UserService {
	
	private UserDAO uDao;
	
	public UserService() {
		uDao = new UserDAO();
	}
	
	public int selectCheckLogin(String userId, String userPwd) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = uDao.selectCheckLogin(conn, userId, userPwd);
		return result;
	}
	

	/**
	 * 아이디로 조회 서비스
	 * @param userId
	 * @return
	 */
	public User printOneById(String userId) {
		User user = null;
		Connection conn = JDBCTemplate.getConnection();
		user = uDao.selectOneById(conn, userId);
		return user;
	}
	

	public int registerUser(User user) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = uDao.insertUser(conn,user);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
				
		return result;
	}

	public int updateUser(User user) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = uDao.updateUser(conn,user);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

}
