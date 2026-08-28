import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/MyApp")
public class MyApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void init() throws ServletException {
        System.out.println("INIT - Servlet Created");
    }

    @Override
    protected void service(
            javax.servlet.http.HttpServletRequest request,
            javax.servlet.http.HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("SERVICE - Request Received");

        response.getWriter().println("Servlet Lifecycle Demo");
    }

    @Override
    public void destroy() {
        System.out.println("DESTROY - Servlet Removed");
    }
}