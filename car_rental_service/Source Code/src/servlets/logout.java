package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-15
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logout() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (!session.isNew()) {
		    session.invalidate();
		    session = request.getSession();
		}
		
//		System.out.println(request.getRequestedSessionId());
		System.out.println("logged out");
		
		response.sendRedirect(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session = request.getSession();

		if (!session.isNew()) {
		    session.invalidate();
		    session = request.getSession();
		}
		
//		System.out.println(">" + request.getRequestedSessionId() + " logged out");
//		System.out.println(request.getRequestedSessionId());
		System.out.println("logged out");
		
		response.sendRedirect(request.getContextPath());
	}

}
