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
import modules.vehicle_location_mod;
import modules.vehicle_make_mod;
import modules.vehicle_mod;

/**
 * Servlet implementation class fleet
 */
@WebServlet("/fleet")
public class fleet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fleet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("makes", new vehicle_make_mod().getMakesOfVehicles());
		request.setAttribute("locations", new vehicle_location_mod().getLocations());
		request.getRequestDispatcher("/WEB-INF/fleet/fleet.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//page selection
		int page = -1;
		try {
			page = Integer.parseInt(request.getParameter("page"));
		} catch(Exception e) {System.err.println("illegal page call");}
		switch(page) {
		case 0:
			request.setAttribute("location", new vehicle_location_mod().getLocation(request.getParameter("location_id")));
			request.setAttribute("vehicles", new vehicle_mod().getVehiclesAtLocation(request.getParameter("location_id")));
			request.getRequestDispatcher("/WEB-INF/fleet/location.jsp").forward(request, response);
			break;
		case 1:
			request.setAttribute("make", request.getParameter("make"));
			request.setAttribute("vehicles", new vehicle_mod().getVehiclesFromMake(request.getParameter("make")));
			
			request.getRequestDispatcher("/WEB-INF/fleet/manufacture.jsp").forward(request, response);
			break;
		default:
			request.setAttribute("makes", new vehicle_make_mod().getMakesOfVehicles());
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			request.getRequestDispatcher("/WEB-INF/fleet/fleet.jsp").forward(request, response);
		}
	}
}
