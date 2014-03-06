package objects;

import java.util.Date;

public class Rental {
	//location
	private String name;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	
	//vehicle
	private int id;
	private String make;
	private String model;
	private String type;
	private int year;
	private String color;
	
	//price
	private double hour_rate;
	private int hours;
	private double cost;
	
	//time
	private Date start_time;
	private Date end_time;
	private Date returned;
	private String cond;
	
	private int rental_id;
	private boolean cancelled;


	public Rental() {
		
	}
	
	public void setLocation(String name, String street1, String street2, String city, String state, String zip) {
		this.name = name;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public void setLocationName(String name){
		this.name = name;
	}
	
	public void setVehicle(int id, String make, String model, String type, int year, String color) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.type = type;
		this.year = year;
		this.color = color;
	}
	
	public void setPrice(double hour_rate, int hours, double cost) {
		this.hour_rate = hour_rate;
		this.hours = hours;
		this.cost = cost;
	}
	
	public void setPrice1(double hour_rate, double cost) {
		this.hour_rate = hour_rate;
		this.cost = cost;
	}
	
	public void setTime(Date start_time, Date end_time, Date returned, String cond) {
		this.start_time = start_time;
		this.end_time = end_time;
		this.returned = returned;
		this.cond = cond;
	}

	/**
	 * @return the cancelled
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * @param cancelled the cancelled to set
	 */
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	/**
	 * @param rental_id the rental_id to set
	 */
	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
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
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the type
	 */
	public String getType() {
		return type;
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
	 * @return the hour_rate
	 */
	public double getHour_rate() {
		return hour_rate;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @return the start_time
	 */
	public Date getStart_time() {
		return start_time;
	}

	/**
	 * @return the end_time
	 */
	public Date getEnd_time() {
		return end_time;
	}

	/**
	 * @return the returned
	 */
	public Date getReturned() {
		return returned;
	}

	/**
	 * @return the cond
	 */
	public String getCond() {
		return cond;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the rental_id
	 */
	public int getRental_id() {
		return rental_id;
	}
	
	
}
