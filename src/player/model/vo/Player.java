package player.model.vo;

public class Player {
	private String userId;
	private int playerNumber;
	private String playerName;
	private String playerJob;
	private int playerLevel;
	private int playerStr;
	private int playerDex;
	private int playerInt;
	private int playerLuk;
	
	public Player() {}

	public Player(String userId, int playerNumber, String playerName, String playerJob, int playerLevel, int playerStr,
			int playerDex, int playerInt, int playerLuk) {
		super();
		this.userId = userId;
		this.playerNumber = playerNumber;
		this.playerName = playerName;
		this.playerJob = playerJob;
		this.playerLevel = playerLevel;
		this.playerStr = playerStr;
		this.playerDex = playerDex;
		this.playerInt = playerInt;
		this.playerLuk = playerLuk;
	}
	
	

	public Player(int playerNumber, int playerLevel, int playerStr, int playerDex, int playerInt, int playerLuk) {
		super();
		this.playerNumber = playerNumber;
		this.playerLevel = playerLevel;
		this.playerStr = playerStr;
		this.playerDex = playerDex;
		this.playerInt = playerInt;
		this.playerLuk = playerLuk;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerJob() {
		return playerJob;
	}

	public void setPlayerJob(String playerJob) {
		this.playerJob = playerJob;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getPlayerStr() {
		return playerStr;
	}

	public void setPlayerStr(int playerStr) {
		this.playerStr = playerStr;
	}

	public int getPlayerDex() {
		return playerDex;
	}

	public void setPlayerDex(int playerDex) {
		this.playerDex = playerDex;
	}

	public int getPlayerInt() {
		return playerInt;
	}

	public void setPlayerInt(int playerInt) {
		this.playerInt = playerInt;
	}

	public int getPlayerLuk() {
		return playerLuk;
	}

	public void setPlayerLuk(int playerLuk) {
		this.playerLuk = playerLuk;
	}

	@Override
	public String toString() {
		return "Player [userId=" + userId + ", playerNumber=" + playerNumber + ", playerName=" + playerName
				+ ", playerJob=" + playerJob + ", playerLevel=" + playerLevel + ", playerStr=" + playerStr
				+ ", playerDex=" + playerDex + ", playerInt=" + playerInt + ", playerLuk=" + playerLuk + "]";
	}
	
	

}
