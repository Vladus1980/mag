package Les04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private UsersVoids usersVoids = UsersVoids.getUsersVoids();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_firtname = request.getParameter("user_firstname");
		String user_lastname = request.getParameter("user_lastname");
		String user_age = request.getParameter("user_age");
		String user_email = request.getParameter("user_email");
		String user_pass = request.getParameter("user_pass");
		String user_level = null;
		
		if ("user".equals(request.getParameter("user_level"))) {
			user_level = User_level.USER.toString();
		} else if ("admin".equals(request.getParameter("user_level"))){
			user_level = User_level.ADMIN.toString();
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}


	
	
	
	

}
