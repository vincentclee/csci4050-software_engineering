package objects;

public class Vehicle1 {
	
	//Vehicle Attributes and Values
	private int year, mileage;
	private String regTag, serviceDate, condition, color,make, model, vehicleType, location;
	private double hourlyRate, dailyRate;
	private int vecId, locID;
	
	
	public Vehicle1(){
		
	}


	//Listing Vehicle
	public Vehicle1(String vMake, String vModel, String vType, double vHourlyRate, double vDayRate){
			this.make = vMake;
			this.model = vModel;
			this.vehicleType = vType;
			this.hourlyRate = vHourlyRate;
			this.dailyRate = vDayRate;
	}



	//Adding Vehicle
	public Vehicle1(String vMake, String vModel, String vVehicleType, String vLocation
			, String vRegTag, String vYear, String vColor, String vDate, String vMileage, String vCondition) {
		// TODO Auto-generated constructor stub
		this.make = vMake;
		this.model = vModel;
		this.vehicleType = vVehicleType;
		this.location = vLocation;
		this.regTag = vRegTag;
		this.year = Integer.parseInt(vYear);
		this.color = vColor;
		this.serviceDate = vDate;
		this.mileage = Integer.parseInt(vMileage);
		this.condition = vCondition;
		
		
	}//ENDOFLISTCONSTRUCTOR


	/**
	 * @return the locID
	 */
	public int getLocID() {
		return locID;
	}



	//Modifying Vehicles
	public Vehicle1(int vechicleID){
		this.vecId = vechicleID;
	}
	
	/**
	 * @return the vecId
	 */
	public int getVecId() {
		return vecId;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
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

		
}//ENDOFCLASS


