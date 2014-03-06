package objects;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-28
 */

public class Location {
	private int location_id;
	private String name;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private int capacity;
	private int vehicles;

	public Location(int location_id, String name, String street1, String street2, String city,
			String state, String zip, int capacity, int vehicles) {
		this.location_id = location_id;
		this.name = name;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.capacity = capacity;
		this.vehicles = vehicles;
	}

	public Location() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the location_id
	 */
	public int getLocation_id() {
		return location_id;
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
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * @return the vehicles
	 */
	public int getVehicles() {
		return vehicles;
	}
}
