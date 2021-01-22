package products;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomePage
 */
@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet {
	//private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// Setting up the content type of web page
        resp.setContentType("text/html");
        // Writing the message on the web page
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome to my onlineStore</h1>");
        
	}

	

}
