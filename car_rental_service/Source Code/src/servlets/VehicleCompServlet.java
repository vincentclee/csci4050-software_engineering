package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.*;
import modules.*;
import objects.*;

/**
 * Servlet implementation class VehicleCompServlet
 */
@WebServlet("/VehicleCompServlet")
public class VehicleCompServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TempVehicle vehicleRecord;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleCompServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			
			
			//Variables
			//GlobalDB db = new GlobalDB();
//			vehicle_make newMake = new vehicle_make();
			vehicle_model_mod newModel = new vehicle_model_mod();
			vehicle_type_mod newType = new vehicle_type_mod();
			vehicle_location_mod newLoc = new vehicle_location_mod();
			
			//Addition of New Vehicle Components	
			String make; 
			String model; 
			String vecTypeName;
			double hourCost;
			double dayCost;
			int zipCode, locCap;
			
			
			String[] hourlyDay = {request.getParameter("vecNewType2"), request.getParameter("vecNewType3")};
			String[] locVal = {request.getParameter("vLocNewName"), request.getParameter("vLocNewStr1"), request.getParameter("vLocNewStr2"),
					request.getParameter("vLocNewCity"), request.getParameter("vLocNewState"), request.getParameter("vLocNewZip"), 
					request.getParameter("vLocCap")};
			
			//Variables Values
			make = request.getParameter("vecNewMake");
			model = request.getParameter("vecNewModel");
			vecTypeName = request.getParameter("vecNewType1");
			
			
			
			//System.out.println(isBlank(hourlyDay[0])+ " " + isBlank(hourlyDay[1]));
			
			
			
			if(isBlank(make) && isBlank(model)){
//					newMake.add(make);
					newModel.add(make, model);
					System.out.println("Added New Make & Model");
			}else if(isBlank(vecTypeName) && isBlank(hourlyDay[0]) && isBlank(hourlyDay[1])){
					hourCost = convertDouble(hourlyDay[0]);
					dayCost = convertDouble(hourlyDay[1]);	
					newType.add(vecTypeName, hourCost, dayCost);
					System.out.println("Added a New Type");
			}else if(isBlankLoc(locVal)){
					zipCode = convertInt(locVal[5]);
					locCap = convertInt(locVal[6]);
//					newLoc.add(locVal[0], locVal[1], locVal[2], locVal[3], locVal[4], zipCode, locCap);
					System.out.println("Added a New Location");
			}else{
				System.out.println("INPUT ERROR:");
			}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String regTag = request.getParameter("vecReg");
		RequestDispatcher dispatcher;
		
		ModifyVehicles modVec= new ModifyVehicles(regTag);
		TempVehicle vecRec = modVec.getModVehicle();
		
		
		session.setAttribute("vehicleRec", vecRec);
		getServletContext().getRequestDispatcher("/VehicleModServlet").forward(request,response);
		
		
		
	}
	
	public double convertDouble(String value){
		
		double num = Double.parseDouble(value);
		return num;
		
	}
	
	public int convertInt(String value){
		int num = Integer.parseInt(value);
		return num;
	}
	
	public boolean isBlankLoc(String[] val){
		
		if(isBlank(val[0]) && isBlank(val[1]) && isBlank(val[2]) && isBlank(val[3]) && 
				isBlank(val[4]) && isBlank(val[5]) && isBlank(val[6])){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isBlank(String value){
		if(value.trim().length() != 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	

}
