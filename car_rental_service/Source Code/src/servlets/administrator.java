package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modules.administrator_mod;
import modules.customer_mod;
import modules.membership_mod;
import modules.vehicle_location_mod;
import modules.vehicle_make_mod;
import modules.vehicle_mod;
import modules.vehicle_model_mod;
import modules.vehicle_type_mod;
import objects.Metadata;

/**
 * Servlet implementation class administrator
 */
@WebServlet("/administrator")
public class administrator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public administrator() {
        super();
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
		//make sure it is a admin
		if (((Metadata) session.getAttribute("metadata")).getStaff_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
			return;
		}
		
		request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
		request.getRequestDispatcher("/WEB-INF/administrator/control-panel.jsp").forward(request, response);
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
			response.sendRedirect(request.getContextPath() + "/administrator");
			return;
		}
		//make sure it is a admin
		if (((Metadata) session.getAttribute("metadata")).getStaff_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
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
			request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel.jsp").forward(request, response);
			break;
		case 1:
			request.setAttribute("makes", new vehicle_make_mod().getMakes(true));
			request.setAttribute("vehicles", new vehicle_mod().getAllVehicles());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle.jsp").forward(request, response);
			break;
		case 2:
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location.jsp").forward(request, response);
			break;
		case 3:
			request.setAttribute("administrators", new administrator_mod().getAdministrators());
			request.setAttribute("customers", new customer_mod().getAllCustomers());
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user.jsp").forward(request, response);
			break;
		case 4:
			request.setAttribute("membership", new membership_mod().getFirst());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-pricing.jsp").forward(request, response);
			break;
		case 5:
			//check for errors
			error = new membership_mod().updateFirst(request.getParameterMap());
			if (error.isEmpty())
				error.add("*Price updated");
			
			request.setAttribute("error", error);
			request.setAttribute("membership", new membership_mod().getFirst());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-pricing.jsp").forward(request, response);
			break;
		case 6:
			//check for errors
			error = new vehicle_location_mod().add_location(request.getParameterMap());
			
			request.setAttribute("error", error);
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location.jsp").forward(request, response);
			break;
		case 7:
			request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypes());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type.jsp").forward(request, response);
			break;
		case 8:
			error = new vehicle_type_mod().add_vehicle_type(request.getParameterMap());
			
			request.setAttribute("error", error);
			request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypes());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type.jsp").forward(request, response);
			break;
		case 9:
			request.setAttribute("make", request.getParameter("make"));
			request.setAttribute("models", new vehicle_model_mod().getModels(request.getParameter("make")));
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			request.setAttribute("types", new vehicle_type_mod().getVehicleTypes());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-add.jsp").forward(request, response);
			break;
		case 10:
			error = new ArrayList<String>();
			error.addAll(new vehicle_mod().add_vehicle(request.getParameterMap()));
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("make", request.getParameter("make"));
				request.setAttribute("models", new vehicle_model_mod().getModels(request.getParameter("make")));
				request.setAttribute("locations", new vehicle_location_mod().getLocations());
				request.setAttribute("types", new vehicle_type_mod().getVehicleTypes());
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-add.jsp").forward(request, response);
				break;
			}
			
			request.setAttribute("makes", new vehicle_make_mod().getMakes(true));
			request.setAttribute("vehicles", new vehicle_mod().getAllVehicles());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle.jsp").forward(request, response);
			break;
		case 11:
			request.setAttribute("vehicle_type", new vehicle_type_mod().getVehicleType(request.getParameter("type_id")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type-edit.jsp").forward(request, response);
			break;
		case 12:
			error = new vehicle_type_mod().updateVehicleType(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("vehicle_type", new vehicle_type_mod().getVehicleType(request.getParameter("type_id")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type-edit.jsp").forward(request, response);
				break;
			}
			
			request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypes());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type.jsp").forward(request, response);
			break;
		case 13:
			error = new vehicle_type_mod().removeVehicleType(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("vehicle_type", new vehicle_type_mod().getVehicleType(request.getParameter("type_id")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type-edit.jsp").forward(request, response);
				break;
			}
			
			request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypes());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-type.jsp").forward(request, response);
			break;
		case 14:
			request.setAttribute("location", new vehicle_location_mod().getLocation(request.getParameter("location_id")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location-edit.jsp").forward(request, response);
			break;
		case 15:
			error = new vehicle_location_mod().updateLocation(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("location", new vehicle_location_mod().getLocation(request.getParameter("location_id")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location-edit.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location.jsp").forward(request, response);
			break;
		case 16:
			error = new vehicle_location_mod().removeLocation(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("location", new vehicle_location_mod().getLocation(request.getParameter("location_id")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location-edit.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("locations", new vehicle_location_mod().getLocations());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-location.jsp").forward(request, response);
			break;
		case 17:
			request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-edit.jsp").forward(request, response);
			break;
		case 18:
			error = new administrator_mod().updateAdministrator(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-edit.jsp").forward(request, response);
				break;
			}
			
			request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel.jsp").forward(request, response);
			break;
		case 19:
			error = new administrator_mod().add_administrator(request.getParameterMap());
			request.setAttribute("error", error);
			
			request.setAttribute("administrators", new administrator_mod().getAdministrators());
			request.setAttribute("customers", new customer_mod().getAllCustomers());
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user.jsp").forward(request, response);
			break;
		case 20:
			request.setAttribute("administrator", new administrator_mod().getAdministrator(request.getParameter("staff_id")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user-edit.jsp").forward(request, response);
			break;
		case 21:
			new administrator_mod().disableAdministrator(request.getParameter("staff_id"));
			
			request.setAttribute("administrators", new administrator_mod().getAdministrators());
			request.setAttribute("customers", new customer_mod().getAllCustomers());
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user.jsp").forward(request, response);
			break;
		case 22:
			request.setAttribute("password", new administrator_mod().resetAdministratorPassword(request.getParameter("staff_id")));
			request.setAttribute("administrator", new administrator_mod().getAdministrator(request.getParameter("staff_id")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user-edit.jsp").forward(request, response);
			break;
		case 23:
			request.setAttribute("customer", new customer_mod().getCustomer(request.getParameter("customer_id")));
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user-edit-customer.jsp").forward(request, response);
			break;
		case 24:
			//reset password
			request.setAttribute("password", new customer_mod().resetCustomerPassword(request.getParameter("customer_id")));
			
			request.setAttribute("customer", new customer_mod().getCustomer(request.getParameter("customer_id")));
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user-edit-customer.jsp").forward(request, response);
			break;
		case 25:
			//disable account
			new customer_mod().disableCustomer(request.getParameter("customer_id"));
			
			request.setAttribute("administrators", new administrator_mod().getAdministrators());
			request.setAttribute("customers", new customer_mod().getAllCustomers());
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-user.jsp").forward(request, response);
			break;
		case 26:
			//edit vehicle
			request.setAttribute("vehicle_locations", new vehicle_location_mod().getVehicleLocationsByID());
			request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypesByID());
			request.setAttribute("vehicle", new vehicle_mod().getDetailedVehicle(request.getParameter("vehicle_id")));
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-edit.jsp").forward(request, response);
			break;
		case 27:
			error = new vehicle_mod().updateVehicle(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				//edit vehicle
				request.setAttribute("vehicle_locations", new vehicle_location_mod().getVehicleLocationsByID());
				request.setAttribute("vehicle_types", new vehicle_type_mod().getVehicleTypesByID());
				request.setAttribute("vehicle", new vehicle_mod().getDetailedVehicle(request.getParameter("vehicle_id")));
				
				request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle-edit.jsp").forward(request, response);
				break;
			}
			
			
			request.setAttribute("makes", new vehicle_make_mod().getMakes(true));
			request.setAttribute("vehicles", new vehicle_mod().getAllVehicles());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle.jsp").forward(request, response);
			break;
		case 28:
			//remove vehicle
			new vehicle_mod().removeVehicle(request.getParameter("vehicle_id"));
			
			request.setAttribute("makes", new vehicle_make_mod().getMakes(true));
			request.setAttribute("vehicles", new vehicle_mod().getAllVehicles());
			
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel-vehicle.jsp").forward(request, response);
			break;
		default:
			request.setAttribute("administrator", new administrator_mod().getAdministrator((Metadata)session.getAttribute("metadata")));
			request.getRequestDispatcher("/WEB-INF/administrator/control-panel.jsp").forward(request, response);
		}
	}
}
