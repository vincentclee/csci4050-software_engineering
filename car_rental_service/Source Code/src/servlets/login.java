package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-10
 */

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import objects.Metadata;
import modules.login_mod;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameterMap().isEmpty()) {
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		}
			
		
		login_mod login_module = new login_mod();		
		
		//check for errors
		List<String> error = login_module.authenticate(request.getParameterMap(), request.getRemoteAddr(), request.getRemoteHost(), request.getRemotePort());
		if (!error.isEmpty()) {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			return;
		}
		
		Metadata data = login_module.getMetadata();
		request.setAttribute("metadata", data);
		
		if (data.getStaff_id() == -1)
			request.getRequestDispatcher("/customer").forward(request, response);
		else if (data.getStaff_id() > 0)
			request.getRequestDispatcher("/administrator").forward(request, response);
		else
			response.sendRedirect(request.getContextPath());
	}
}