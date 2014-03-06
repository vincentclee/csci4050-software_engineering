package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.*;

/**
 * Servlet implementation class VehicleModServlet
 */
@WebServlet("/VehicleModServlet")
public class VehicleModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleModServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("VehilceModServlet");
		Object temp = (TempVehicle) request.getAttribute("vehicleRec");
		TempVehicle temp2 = (TempVehicle) temp;
		
		
		request.getRequestDispatcher("/WEB-INF/vehicle/ModifyVehicle1.jsp").forward(request, response);
		
		
		
	}

}
