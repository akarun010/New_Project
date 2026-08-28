

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("username");
		String password = request.getParameter("password");
		
		if(name != null && password != null && name.equals("admin") && password.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("dashboard.jsp");
		} else {
			 request.setAttribute("error", "Invalid username or password");
			 request.getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
