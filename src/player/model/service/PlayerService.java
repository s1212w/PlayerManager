package player.model.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import player.model.dao.PlayerDAO;
import player.model.vo.Player;

public class PlayerService {
	private PlayerDAO pDao;
	
	public PlayerService() {
		pDao = new PlayerDAO();
	}

	public int addPlayer(Player player) {
		Connection conn = JDBCTemplate.getConnection();
		int result = pDao.insertPlayer(conn,player);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public List<Player> selectAllPlayer() {
		Connection conn = JDBCTemplate.getConnection();
		List<Player> pList = pDao.selectAllPlayer(conn);
		return pList;
	}

	public Player selectOneByNumber(int playerNumber) {
		Connection conn = JDBCTemplate.getConnection();
		Player player = pDao.selectOneByNumber(conn,playerNumber);
		return player;
	}

	public int deletePlayer(int playerNumber) {
		Connection conn = JDBCTemplate.getConnection();
		int result = pDao.deletePlayer(conn, playerNumber);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public int updatePlayer(Player player) {
		Connection conn = JDBCTemplate.getConnection();
		int result = pDao.updatePlayer(conn,player);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}


}
