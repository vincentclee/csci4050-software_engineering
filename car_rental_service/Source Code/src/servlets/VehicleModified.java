package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.vehicle_temp;
import objects.TempVehicle;

/**
 * Servlet implementation class VehicleModified
 */
@WebServlet("/VehicleModified")
public class VehicleModified extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Vehicle Modified GET");
		String newMake = request.getParameter("changeMake");
		String newModel = request.getParameter("changeModel");
		String year = request.getParameter("changeYear");
		String newType = request.getParameter("changeType");
		String newColor = request.getParameter("changeColor");
		String hRate = request.getParameter("changeHourRate");
		String dRate = request.getParameter("changeDayRate");
		int newYear;
		Double newHourRate;
		double newDayRate;
		if(isBlank(year)){
			newYear = Integer.parseInt(year);
		}else{
			newYear = -1;
		}
			
		if(isBlank(hRate)){
			newHourRate = Double.parseDouble(hRate);
		}else{
			newHourRate = -1.0;
		}
		
		if(isBlank(dRate)){
			newDayRate = Double.parseDouble(dRate);
		}else{
			newDayRate = -1.0;
		}
		Object temp = (TempVehicle) request.getSession().getAttribute("vehicleRec");
		TempVehicle temp2 = (TempVehicle) temp;
		vehicle_temp updateInfo = new vehicle_temp(temp2);
		
		try {
			updateInfo.updateVehicle(newMake, newModel, newType, newHourRate ,newDayRate, 
					"", newYear, newColor, "", -1, "", "", "", "", "", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		Object temp = (TempVehicle) request.getSession().getAttribute("vehicleRec");
		TempVehicle temp2 = (TempVehicle) temp;
		vehicle_temp updateInfo = new vehicle_temp(temp2);
		System.out.println("Vehicle Modified: Post");
		
		String newReg = request.getParameter("changeReg");
		
		int newMileage = -1;
		String mileage = request.getParameter("changeMileage");
		System.out.println(mileage);
		
		
			if(isBlank(mileage)){
				newMileage = Integer.parseInt(mileage);
			}
		
		String newServDate = request.getParameter("changeServDate");
		String newCondition = request.getParameter("changeCondition");
		
		String newLocName = request.getParameter("changeLocName");
		String newStr1 = request.getParameter("changeLocStr1");
		String newStr2 = request.getParameter("changeLocStr2");
		String newCity = request.getParameter("changeCity");
		String newState = request.getParameter("changeState");
		//Location Modifictions
		
		int page = -1;
		page = Integer.parseInt(request.getParameter("page"));
		System.out.println(page);
		try {
			
			updateInfo.updateVehicle("", "", "", -1 ,-1, newReg, -1, "",newServDate, newMileage, newCondition, newLocName, newStr1, newStr2, newCity,
					newState);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
