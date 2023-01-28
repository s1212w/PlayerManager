package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.model.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user/home.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/home.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("user-id");
		String userPwd = request.getParameter("user-pwd");
		
		UserService uService = new UserService();
		int result = uService.selectCheckLogin(userId, userPwd);

		
		if(result > 0) {
//			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/loginSuccess.jsp");
//			view.forward(request, response);
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			//response.sendRedirect("/WEB-INF/views/user/home.jsp");

//			request.setAttribute("userId", userId);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/home.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/error.jsp");
			view.forward(request, response);
		}
	
	
	}

}
