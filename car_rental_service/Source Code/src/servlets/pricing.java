package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-12-03
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.membership_mod;
import modules.vehicle_type_mod;

/**
 * Servlet implementation class pricing
 */
@WebServlet("/pricing")
public class pricing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pricing() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//send membership plans & vehicle types
		request.setAttribute("memberships", new membership_mod().get());
		request.setAttribute("vehicletypes", new vehicle_type_mod().getVehicleTypes());
		request.getRequestDispatcher("/WEB-INF/rate-price.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//send membership plans & vehicle types
		request.setAttribute("memberships", new membership_mod().get());
		request.setAttribute("vehicletypes", new vehicle_type_mod().getVehicleTypes());
		request.getRequestDispatcher("/WEB-INF/rate-price.jsp").forward(request, response);
	}

}
