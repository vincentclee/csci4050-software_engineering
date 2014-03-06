package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.TempVehicle;

/**
 * Servlet implementation class VehicleUpdateServlet
 */
@WebServlet("/VehicleUpdateServlet")
public class VehicleUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("VehilceUpdateServlet :GET");
		Object temp = (TempVehicle) request.getSession().getAttribute("vehicleRec");
		TempVehicle temp2 = (TempVehicle) temp;
		
		
		request.getRequestDispatcher("/WEB-INF/vehicle/ModifyVecDetails1.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("VehicleUpdateServlet: Post");
		Object temp = (TempVehicle) request.getSession().getAttribute("vehicleRec");
		TempVehicle temp2 = (TempVehicle) temp;
		
		int page = Integer.parseInt(request.getParameter("page"));
		request.getRequestDispatcher("/WEB-INF/vehicle/ModifyVecDetails2.jsp").forward(request, response);
		
	}

}
