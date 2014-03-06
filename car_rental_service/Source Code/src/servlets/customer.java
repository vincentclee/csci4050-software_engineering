package servlets;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import objects.Metadata;
import modules.customer_mod;
import modules.membership_mod;
import modules.reservation_mod;

/**
 * Servlet implementation class customer
 */
@WebServlet("/customer")
public class customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customer() {
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
		//make sure it is a customer
		if (((Metadata) session.getAttribute("metadata")).getCustomer_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
			return;
		}
		
		
		//for refresh page
		customer_mod customer_module = new customer_mod((Metadata)session.getAttribute("metadata"));
		request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
		request.setAttribute("customer", customer_module.get_customer());
		request.getRequestDispatcher("/WEB-INF/customer/my-stuff.jsp").forward(request, response);
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
			response.sendRedirect(request.getContextPath() + "/customer");
			return;
		}
		//make sure it is a customer
		if (((Metadata) session.getAttribute("metadata")).getCustomer_id() == -1) {
			request.getRequestDispatcher("/logout").forward(request, response);
			return;
		}
		
		
		//get customer data
		customer_mod customer_module = new customer_mod((Metadata)session.getAttribute("metadata"));
		request.setAttribute("customer", customer_module.get_customer());
		
		
		
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
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 1:
			request.getRequestDispatcher("/WEB-INF/customer/account-setting.jsp").forward(request, response);
			break;
		case 2:
			request.getRequestDispatcher("/WEB-INF/customer/account-address.jsp").forward(request, response);
			break;
		case 3:
			request.getRequestDispatcher("/WEB-INF/customer/account-creditcard.jsp").forward(request, response);
			break;
		case 4:
			request.getRequestDispatcher("/WEB-INF/customer/account-license.jsp").forward(request, response);
			break;
		case 5:
			//check for errors
			error = customer_module.account_setting(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-setting.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("customer", customer_module.get_customer());
			
			//go to next
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 6:
			//check for errors
			error = customer_module.account_address(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-address.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("customer", customer_module.get_customer());
			
			//go to next
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 7:
			//check for errors
			error = customer_module.account_creditcard(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-creditcard.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("customer", customer_module.get_customer());
			
			//go to next
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 8:
			//check for errors
			error = customer_module.account_license(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-license.jsp").forward(request, response);
				break;
			}
			
			//get updated
			request.setAttribute("customer", customer_module.get_customer());
			
			//go to next
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 9:
			request.getRequestDispatcher("/WEB-INF/customer/account-terminate.jsp").forward(request, response);
			break;
		case 10:
			request.getRequestDispatcher("/WEB-INF/customer/account-deactivate.jsp").forward(request, response);
			break;
		case 11:
			//check for errors
			error = customer_module.account_deactivate(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-deactivate.jsp").forward(request, response);
				break;
			}
			
			//go to logout
			request.getRequestDispatcher("logout").forward(request, response);
			break;
		case 12:
			//check for errors
			error = customer_module.membership_terminate(request.getParameterMap());
			if (!error.isEmpty()) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/WEB-INF/customer/account-terminate.jsp").forward(request, response);
				break;
			}
			
			//go back
			request.getRequestDispatcher("/WEB-INF/customer/account-information.jsp").forward(request, response);
			break;
		case 13:
			//send membership plans
			request.setAttribute("memberships", new membership_mod().get());
			
			//go to next
			request.getRequestDispatcher("/WEB-INF/customer/membership.jsp").forward(request, response);
			break;
		case 14:
			new membership_mod().upgrade((Metadata)session.getAttribute("metadata"));
			
			//get updated
			request.setAttribute("customer", customer_module.get_customer());
			
			request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
			request.getRequestDispatcher("/WEB-INF/customer/my-stuff.jsp").forward(request, response);
			break;
		case 15:
			double overage = new reservation_mod().returnVehicle(request.getParameter("rental_id"));
			if (overage > 0) {
				request.setAttribute("overage", overage);
				request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
				request.getRequestDispatcher("/WEB-INF/customer/late-return.jsp").forward(request, response);
				break;
			}
			
			request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
			request.getRequestDispatcher("/WEB-INF/customer/my-stuff.jsp").forward(request, response);
			break;
		case 16:
			new reservation_mod().cancelReservation(request.getParameter("rental_id"));
			
			request.setAttribute("customer", customer_module.get_customer());
			request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
			request.getRequestDispatcher("/WEB-INF/customer/my-stuff.jsp").forward(request, response);
			break;
		default:
			request.setAttribute("rentals", new reservation_mod().getRentalByCustomer((Metadata)session.getAttribute("metadata")));
			request.getRequestDispatcher("/WEB-INF/customer/my-stuff.jsp").forward(request, response);
		}
	}
}