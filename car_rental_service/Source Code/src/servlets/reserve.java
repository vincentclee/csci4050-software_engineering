package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modules.customer_mod;
import modules.reservation_mod;
import modules.vehicle_location_mod;
import modules.vehicle_mod;
import objects.Metadata;
import objects.Rental;

/**
 * Servlet implementation class reserve
 */
@WebServlet("/reserve")
public class reserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//go to login if no session exists
		if (request.getAttribute("metadata") == null && session.getAttribute("metadata") == null) {
			request.getRequestDispatcher("/login").forward(request, response);
			return;
		} //set metadata
		else if (request.getAttribute("metadata") != null)
			session.setAttribute("metadata", request.getAttribute("metadata"));
		//make sure it is a customer
		if (((Metadata) session.getAttribute("metadata")).getCustomer_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
			return;
		}
		
		
		
		//check valid membership
		if (!new customer_mod((Metadata) session.getAttribute("metadata")).checkMembership()) {
			request.getRequestDispatcher("/WEB-INF/reserve/renew-first.jsp").forward(request, response);
			return;
		}
		
		request.setAttribute("metadata", session.getAttribute("metadata"));
		request.setAttribute("locations", new vehicle_location_mod().getVehicleLocationsWithAvailableCars());
		request.getRequestDispatcher("/WEB-INF/reserve/reserve1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//go to login if no session exists
		if (request.getAttribute("metadata") == null && session.getAttribute("metadata") == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		} //set metadata 
		else if (request.getAttribute("metadata") != null) {
			session.setAttribute("metadata", request.getAttribute("metadata"));
			response.sendRedirect(request.getContextPath() + "/reserve");
			return;
		}
		//make sure it is a customer
		if (((Metadata) session.getAttribute("metadata")).getCustomer_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
			return;
		}
		
		//get metadata
		request.setAttribute("metadata", session.getAttribute("metadata"));
		
		
		//check valid membership
		if (!new customer_mod((Metadata) session.getAttribute("metadata")).checkMembership()) {
			request.getRequestDispatcher("/WEB-INF/reserve/renew-first.jsp").forward(request, response);
			return;
		}
		
		//page selection
		int page = -1;
		List<String> error;
		try {
			page = Integer.parseInt(request.getParameter("page"));
		} catch(Exception e) {
			System.err.println("illegal page call");
		}
		switch(page) {
		case 0:
			request.setAttribute("vehicles", new vehicle_mod().getVehiclesAtLocationAvailable(request.getParameter("location")));
			request.setAttribute("location_name", new vehicle_location_mod().getVehicleLocationName(request.getParameter("location")));
			
			request.getRequestDispatcher("/WEB-INF/reserve/reserve2.jsp").forward(request, response);
			break;
		case 1:
			request.setAttribute("location_name", request.getParameter("location"));
			request.setAttribute("vehicle", new vehicle_mod().getVehicle(request.getParameter("vehicle_id")));
			
			request.getRequestDispatcher("/WEB-INF/reserve/reserve3.jsp").forward(request, response);
			break;
		case 2:
			error = new reservation_mod().reserveVehicle(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("location_name", request.getParameter("location_name"));
				request.setAttribute("vehicle", new vehicle_mod().getVehicle(request.getParameter("vehicle_id")));
				
				
				request.getRequestDispatcher("/WEB-INF/reserve/reserve3.jsp").forward(request, response);
				break;
			}
			
			session.setAttribute("Rental", new reservation_mod().reserveConfirmation(request.getParameterMap()));
			request.setAttribute("rental", session.getAttribute("Rental"));
			
			request.getRequestDispatcher("/WEB-INF/reserve/reserve4.jsp").forward(request, response);
			break;
		case 3:
			new reservation_mod().reserveNow((Rental)session.getAttribute("Rental"), (Metadata)session.getAttribute("metadata"));
			
			request.getRequestDispatcher("/WEB-INF/reserve/reserve5.jsp").forward(request, response);
			break;
		default:
			request.setAttribute("locations", new vehicle_location_mod().getVehicleLocationsWithAvailableCars());
			request.getRequestDispatcher("/WEB-INF/reserve/reserve1.jsp").forward(request, response);
		}
	}
}
