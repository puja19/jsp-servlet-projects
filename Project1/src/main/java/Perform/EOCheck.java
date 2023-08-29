package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EOCheck
 */
@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EOCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = null;
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			out = response.getWriter();
			int n = Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if (n % 2 == 0) {
				out.println(n + " is an even number");
			} else {
				out.println(n + " is an odd number");
			}
		} catch (Exception e) {
			out.println("Error: " + e.getMessage());
		}

		finally {
			out.println("<br><br>");
			out.println("To go to main page <a href=index.html> click HERE</a>");
			out.println("</center>");
		}

	}

}
