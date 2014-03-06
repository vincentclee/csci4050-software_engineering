package objects;

import java.util.Date;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

public class Vehicle {
	private int id;
	private int make_id;
	private String make;
	private int model_id;
	private String model;
	private int type_id;
	private String type;
	private int location_id;
	private String location;
	private String registration;
	private int year;
	private String color;
	private Date service;
	private int mileage;
	private String cond;
	
	private Double hour_rate;
	private Double day_rate;
	
	public Vehicle(int id, int make_id, String make, int model_id,
			String model, int type_id, String type, int location_id,
			String location, String registration, int year, String color,
			Date service, int mileage, String cond) {
		this.id = id;
		this.make_id = make_id;
		this.make = make;
		this.model_id = model_id;
		this.model = model;
		this.type_id = type_id;
		this.type = type;
		this.location_id = location_id;
		this.location = location;
		this.registration = registration;
		this.year = year;
		this.color = color;
		this.service = service;
		this.mileage = mileage;
		this.cond = cond;

	}

	public Vehicle(int id, String make, String model, String type, int year,
			String color, Double hour_rate, Double day_rate) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.type = type;
		this.year = year;
		this.color = color;
		this.hour_rate = hour_rate;
		this.day_rate = day_rate;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the make_id
	 */
	public int getMake_id() {
		return make_id;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model_id
	 */
	public int getModel_id() {
		return model_id;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the type_id
	 */
	public int getType_id() {
		return type_id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the location_id
	 */
	public int getLocation_id() {
		return location_id;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the registration
	 */
	public String getRegistration() {
		return registration;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the service
	 */
	public Date getService() {
		return service;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @return the cond
	 */
	public String getCond() {
		return cond;
	}

	/**
	 * @return the hour_rate
	 */
	public Double getHour_rate() {
		return hour_rate;
	}

	/**
	 * @return the day_rate
	 */
	public Double getDay_rate() {
		return day_rate;
	}


}
