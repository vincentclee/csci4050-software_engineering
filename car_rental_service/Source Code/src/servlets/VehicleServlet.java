package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.*;
import objects.*;
/**
 * Servlet implementation class VehicleServlet
 */
@WebServlet("/VehicleServlet")
public class VehicleServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String city = request.getParameter("city");	
		String state = request.getParameter("state");
		System.out.println(city + "" + state);
		
		//Listing Vehicles
		System.out.println("LISTING VEHICLE: SERVELET");
		PrintWriter out = response.getWriter();
		ListVehicles vehicles = new ListVehicles(city, state);
		ArrayList<Vehicle> listVec = vehicles.getVehicles();
		
		//RequestDispatcher dispatcher;
		
		request.setAttribute("listVec", listVec);
		//getServletContext().getRequestDispatcher("/WEB-INF/vehicle/ListVehicleResults.jsp").forward(request, response);
		request.getRequestDispatcher("/WEB-INF/vehicle/AddVehicle.jsp").forward(request, response);
		
		
		
		
		
		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Creates a Vehicle Record into String
		
		//Vehicle Component Values
		String make = request.getParameter("vecMake");
		String model = request.getParameter("vecModel");
		String vecType = request.getParameter("vecType");
		String vecLoc = request.getParameter("vecLoc");
		
		
//		Vehicle newCar = new Vehicle(make, model, vecType, vecLoc, 
//		    		     request.getParameter("vecReg"), request.getParameter("vecYear"),
//						 request.getParameter("vecColor"), request.getParameter("vecDate"),
//						 request.getParameter("vecMileage"), request.getParameter("vecCon"));
//		AddVehicles add = new AddVehicles(newCar);
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

//	    if(add.getRecStatus()){
//	    	out.println("<html>");
//	    	out.println("<head>");
//	    	out.println("<title>Vehicel Add: Success Message</title>");
//	    	out.println("</head>");
//	    	out.println("<body bgcolor=\"white\">");
//	    	out.println("The New Vehicle has Been SuccessFully added to the Database");
//	    	out.println("</body>");
//	    	out.println("</html>");
//	    }else{
//	    	out.println("<html>");
//	    	out.println("<head>");
//	    	out.println("<title>Vehicle Add: Failure Message</title>");
//	    	out.println("</head>");
//	    	out.println("<p>Your Attempt to add a New Vehicle has Failed Please Give the Apporiate Information</p>"
//	    			+  "<p>Check Your Entries for possible errors</p>");
//	    	out.println("<body bgcolor=\"white\">");
//	    	out.println("</body>");
//	    	out.println("</html>");
//	    }
	}
	
	
	//Create Vehicle String
	
	
	

}
