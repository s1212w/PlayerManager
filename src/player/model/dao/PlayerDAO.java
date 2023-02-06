package player.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import player.model.vo.Player;

public class PlayerDAO {

	public int insertPlayer(Connection conn, Player player) {
		String query = "INSERT INTO PLAYER_TBL VALUES(?, SEQ_PLAYERNUM.NEXTVAL,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, player.getUserId());
			pstmt.setString(2, player.getPlayerName());
			pstmt.setString(3, player.getPlayerJob());
			pstmt.setInt(4, player.getPlayerLevel());
			pstmt.setInt(5, player.getPlayerStr());
			pstmt.setInt(6, player.getPlayerDex());
			pstmt.setInt(7, player.getPlayerInt());
			pstmt.setInt(8, player.getPlayerLuk());
			result = pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<Player> selectAllPlayer(Connection conn) {
		String query = "SELECT * FROM PLAYER_TBL";
		List<Player> pList = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			pList = new ArrayList<Player>();
			while(rset.next()) {
				Player player = new Player();
				player.setUserId(rset.getString("USER_ID"));
				player.setPlayerNumber(rset.getInt("PLAYER_NUMBER"));
				player.setPlayerName(rset.getString("PLAYER_NAME"));
				player.setPlayerJob(rset.getString("PLAYER_JOB"));
				player.setPlayerLevel(rset.getInt("PLAYER_LEVEL"));
				player.setPlayerStr(rset.getInt("PLAYER_STR"));
				player.setPlayerDex(rset.getInt("PLAYER_DEX"));
				player.setPlayerInt(rset.getInt("PLAYER_INT"));
				player.setPlayerLuk(rset.getInt("PLAYER_LUK"));
				pList.add(player);
			}
			rset.close();
			stmt.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pList;
	}

	public Player selectOneByNumber(Connection conn, int playerNumber) {
		String query = "SELECT * FROM PLAYER_TBL WHERE PLAYER_NUMBER=?";
		Player player = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, playerNumber);
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				player = new Player();
				player.setUserId(rset.getString("USER_ID"));
				player.setPlayerNumber(rset.getInt("PLAYER_NUMBER"));
				player.setPlayerName(rset.getString("PLAYER_NAME"));
				player.setPlayerJob(rset.getString("PLAYER_JOB"));
				player.setPlayerLevel(rset.getInt("PLAYER_LEVEL"));
				player.setPlayerStr(rset.getInt("PLAYER_STR"));
				player.setPlayerDex(rset.getInt("PLAYER_DEX"));
				player.setPlayerInt(rset.getInt("PLAYER_INT"));
				player.setPlayerLuk(rset.getInt("PLAYER_LUK"));
			}
			rset.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return player;
	}

	public int deletePlayer(Connection conn, int playerNumber) {
		String query = "DELETE FROM PLAYER_TBL WHERE PLAYER_NUMBER = ?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, playerNumber);
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int updatePlayer(Connection conn, Player player) {
		String query = "UPDATE PLAYER_TBL SET PLAYER_LEVEL=?, PLAYER_STR=?, PLAYER_DEX=?, PLAYER_INT=?, PLAYER_LUK=? WHERE PLAYER_NUMBER=?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, player.getPlayerLevel());
			pstmt.setInt(2, player.getPlayerStr());
			pstmt.setInt(3, player.getPlayerDex());
			pstmt.setInt(4, player.getPlayerInt());
			pstmt.setInt(5, player.getPlayerLuk());
			pstmt.setInt(6, player.getPlayerNumber());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
