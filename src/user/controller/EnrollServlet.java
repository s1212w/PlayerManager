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
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/user/enrollView.do")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/views/user/enroll.jsp").forward(request, response);
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
		User user = new User();
		user.setUserId(userId);
		user.setUserPwd(userPwd);
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		UserService uService = new UserService();
		int result = uService.registerUser(user);
		if(result > 0) {
			//가입 성공
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/login.jsp");
			view.forward(request, response);
		} else {
			//가입 실패
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/user/enrollError.jsp");
			view.forward(request, response);
			
		}
		
	}

}
