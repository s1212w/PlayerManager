package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.User;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/user/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("user-id");
		String userPwd = request.getParameter("user-pwd");
		String userName = request.getParameter("user-name");
		String userEmail = request.getParameter("user-email");
		User user = new User(userId, userPwd, userName, userEmail);
		UserService uService = new UserService();
		int result = uService.updateUser(user);
		if(result > 0) {
			//성공하면 메인페이지
			request.setAttribute("userId", userId);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/home.jsp");
			view.forward(request, response);
		} else {
			//실패하면 에러페이지
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/error.jsp");
			view.forward(request, response);
		}
		
	}

}
