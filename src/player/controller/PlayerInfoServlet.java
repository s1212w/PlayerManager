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
 * Servlet implementation class PlayerInfoServlet
 */
@WebServlet("/player/info")
public class PlayerInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int playerNumber = Integer.parseInt(request.getParameter("player-number"));
		PlayerService pService = new PlayerService();
		Player player = pService.selectOneByNumber(playerNumber);
		if(player != null) {
			request.setAttribute("player",player);
			request.getRequestDispatcher("/WEB-INF/views/player/playerInfo2.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
