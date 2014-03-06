package objects;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class TempVehicle{

	private int zip, capacity, year, mileage, vecID, locID;
	private String regTag, serviceDate, condition, color,make, model, vehicleType;
	private double hourlyRate, dailyRate;
	private String locName, str1, str2, city, state;
	

	PreparedStatement getVehicleRec;

	
	
	public TempVehicle(int vecID){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
			
			getVehicleRec = conn.prepareStatement("SELECT registration, year, color, serviceDate, mileage, "
					                          + "`condition`,  make, model, location_id, vehicle_type.*, vehicle_location.*"
					                          + " FROM vehicle "
											  + " JOIN vehicle_make"
											  + "  ON vehicle.make_id = vehicle_make.id"
											  + " JOIN vehicle_model"
											  + "  ON vehicle.model_id = vehicle_model.id"
											  + " JOIN vehicle_type"
											  + "  ON vehicle.vehicle_type = vehicle_type.id"
											  + " JOIN vehicle_location"
											  + "  ON vehicle.location_id = vehicle_location.id"
											  + " WHERE vehicle.id = ?;");
			getVehicleRec.setInt(1, vecID);
			ResultSet rs = getVehicleRec.executeQuery();
			
			
				while(rs.next()){
					
					String reg = rs.getString("registration");
					int year = rs.getInt("year");
					String servDate = rs.getString("serviceDate");
					String color = rs.getString("color");
					int mileage = rs.getInt("mileage");
					String condition = rs.getString("condition");
					String make = rs.getString("make");
					String model = rs.getString("model");
					String type = rs.getString("name");
					double hourRate = rs.getDouble("hour_rate");
					double dayRate = rs.getDouble("day_rate");
					int locID = rs.getInt("location_id");
					String lName = rs.getString("vehicle_location.name");
					String lStr1 = rs.getString("street1");
					String lStr2 = rs.getString("street2");
					String lCity = rs.getString("city");
					String lState = rs.getString("state");
					int lZip = rs.getInt("zip");
					int lCap = rs.getInt("capacity");
					
					
					getVehicleRec(reg, year, servDate, color, mileage, condition, make, model, type, hourRate,
							    dayRate, locID, vecID, lName, lStr1, lStr2, lCity, lState, lZip,
							    lCap);
							
				}
			
			
			
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Scenarios
	//Inserting Data that Exists
	//Inserting Data that Doesn't exist;
	
	
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @return the locName
	 */
	public String getLocName() {
		return locName;
	}

	/**
	 * @return the str1
	 */
	public String getStr1() {
		return str1;
	}

	/**
	 * @return the str2
	 */
	public String getStr2() {
		return str2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the getVehicleRec
	 */
	public PreparedStatement getGetVehicleRec() {
		return getVehicleRec;
	}

	public void getVehicleRec (String vReg, int vYear,String vServDate, String vColor, int vMileage,
			String vCondition, String vMake, String vModel,String vType, 
			double vHourRate, double vDayRate, int vLocID, int vVecID, String vLocName, String vStr1, String vStr2,
			String vCity, String vState, int vZipCode, int vCap){
				this.make = vMake;
				this.model = vModel;
				this.vehicleType = vType;
				this.locID = vLocID;
				this.regTag = vReg;
				this.year = vYear;
				this.color = vColor;
				this.serviceDate = vServDate;
				this.mileage = vMileage;
				this.condition = vCondition;
				this.hourlyRate = vHourRate;
				this.dailyRate = vDayRate;
				this.vecID = vVecID;
				this.locName = vLocName;
				this.str1 = vStr1;
				this.str2 = vStr2;
				this.city = vCity;
				this.state = vState;
				this.zip = vZipCode;
				this.capacity = vCap;
				
					
	}
	
	
	/**
	 * @return the vecID
	 */
	public int getVecID() {
		return vecID;
	}

	/**
	 * @return the year
	 */

	public int getYear() {
		return year;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @return the regTag
	 */
	public String getRegTag() {
		return regTag;
	}

	/**
	 * @return the serviceDate
	 */
	public String getServiceDate() {
		return serviceDate;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @return the dailyRate
	 */
	public double getDailyRate() {
		return dailyRate;
	}

	/**
	 * @return the locID
	 */
	public int getLocID() {
		return locID;
	}

	
	
	

}
