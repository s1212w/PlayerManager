package player.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import player.model.service.PlayerService;
import player.model.vo.Player;

/**
 * Servlet implementation class PlayerAddServlet
 */
@WebServlet("/player/add.do")
public class PlayerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlayerAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/player/playerAdd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String playerName = request.getParameter("player-name");
		String playerJob = request.getParameter("player-job");
		int playerLevel = Integer.parseInt(request.getParameter("player-level"));
		int playerStr = Integer.parseInt(request.getParameter("player-str"));
		int playerDex = Integer.parseInt(request.getParameter("player-dex"));
		int playerInt = Integer.parseInt(request.getParameter("player-int"));
		int playerLuk = Integer.parseInt(request.getParameter("player-luk"));

		Player player = new Player();
		player.setPlayerName(playerName);
		player.setPlayerJob(playerJob);
		player.setPlayerLevel(playerLevel);
		player.setPlayerStr(playerStr);
		player.setPlayerDex(playerDex);
		player.setPlayerInt(playerInt);
		player.setPlayerLuk(playerLuk);

		HttpSession session = request.getSession();
		if (session != null && (session.getAttribute("userId")) != null) {
			String userId = (String)session.getAttribute("userId");
			player.setUserId(userId);
			PlayerService pService = new PlayerService();
			int result = pService.addPlayer(player);
			if(result > 0) {
				response.sendRedirect("/player/list");
			} else {
				request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}

	}

}
