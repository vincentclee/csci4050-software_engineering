package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.registration_mod;
import modules.membership_mod;

/**
 * Servlet implementation class register
 */

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/registration/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if (request.getParameterMap().isEmpty()) {
			response.sendRedirect(request.getContextPath() + "/register");
			return;
		}
		
		//start temporary data store
		if (session.getAttribute("registration_mod") == null) {
			session.setAttribute("registration_mod", new registration_mod());
			System.out.println("<registration_mod> started");
		}
		
		//registration step
		int step = -1;
		List<String> error;
		try {
			step = Integer.parseInt(request.getParameter("step"));
		} catch(Exception e) {
			System.err.println("illegal registration step");
		}
		switch(step) {
			case 0:
				//check for errors
				error = ((registration_mod)session.getAttribute("registration_mod")).step(request.getParameterMap());
				if (!error.isEmpty()) {
					request.setAttribute("error", error);
					request.getRequestDispatcher("/WEB-INF/registration/register.jsp").forward(request, response);
					break;
				}
				
				//go to next
		        request.getRequestDispatcher("/WEB-INF/registration/register1.jsp").forward(request, response);
				break;
			case 1:
				//check for errors
				error = ((registration_mod)session.getAttribute("registration_mod")).step1(request.getParameterMap());
				if (!error.isEmpty()) {
					request.setAttribute("error", error);
					request.getRequestDispatcher("/WEB-INF/registration/register1.jsp").forward(request, response);
					break;
				}
				
				//send membership plans
				request.setAttribute("memberships", new membership_mod().get());
				
				//go to next
				request.getRequestDispatcher("/WEB-INF/registration/register2.jsp").forward(request, response);
				break;
			case 2:
				//check for errors
				error = ((registration_mod)session.getAttribute("registration_mod")).step2(request.getParameterMap());
				if (!error.isEmpty()) {
					request.setAttribute("error", error);
					
					//send membership plans
					request.setAttribute("memberships", new membership_mod().get());
					
					request.getRequestDispatcher("/WEB-INF/registration/register2.jsp").forward(request, response);
					break;
				}
				
				//go to next
				request.getRequestDispatcher("/WEB-INF/registration/register3.jsp").forward(request, response);
				break;
			case 3:
				//check for errors
				error = ((registration_mod)session.getAttribute("registration_mod")).step3(request.getParameterMap());
				if (!error.isEmpty()) {
					request.setAttribute("error", error);
					request.getRequestDispatcher("/WEB-INF/registration/register3.jsp").forward(request, response);
					break;
				}
				
				//go to next
				request.getRequestDispatcher("/WEB-INF/registration/register4.jsp").forward(request, response);
				break;
			case 4:
				//check for errors
				error = ((registration_mod)session.getAttribute("registration_mod")).step4(request.getParameterMap());
				if (!error.isEmpty()) {
					request.setAttribute("error", error);
					request.getRequestDispatcher("/WEB-INF/registration/register4.jsp").forward(request, response);
					break;
				}
				
				//go to next
				request.getRequestDispatcher("/WEB-INF/registration/register5.jsp").forward(request, response);
				break;
			default:
				response.sendRedirect(request.getContextPath());
		}
	}
}