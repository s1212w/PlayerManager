package player.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import player.model.service.PlayerService;
import player.model.vo.Player;

/**
 * Servlet implementation class PlayerModifyServlet
 */
@WebServlet("/player/modify")
public class PlayerModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String playerId = request.getParameter("player-number") != null? request.getParameter("player-number"): "0";
		int playerNumber = Integer.parseInt(playerId);
		PlayerService pService = new PlayerService();;
		Player player = pService.selectOneByNumber(playerNumber);
		request.setAttribute("player", player);
		request.getRequestDispatcher("/WEB-INF/views/player/playerModify.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strNumber = request.getParameter("player-number") != null ? request.getParameter("player-number") : "0";
		int playerNumber = Integer.parseInt(strNumber);
		int playerLevel = Integer.parseInt(request.getParameter("player-level"));
		int playerStr = Integer.parseInt(request.getParameter("player-str"));
		int playerDex = Integer.parseInt(request.getParameter("player-dex"));
		int playerInt = Integer.parseInt(request.getParameter("player-int"));
		int playerLuk = Integer.parseInt(request.getParameter("player-luk"));
		Player player = new Player(playerNumber, playerLevel, playerStr, playerDex, playerInt, playerLuk);
		PlayerService pService = new PlayerService();
		int result = pService.updatePlayer(player);
		if(result > 0) {
			response.sendRedirect("/player/info?player-number="+playerNumber);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
	} 

}
