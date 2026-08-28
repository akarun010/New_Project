

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String department = request.getParameter("department");
		String age = request.getParameter("age");
		
		request.setAttribute("name",name);
		request.setAttribute("department",department);
		request.setAttribute("age",age);
		RequestDispatcher rqDispatcher = request.getRequestDispatcher("student.jsp");
		rqDispatcher.forward(request, response);
	}

}
