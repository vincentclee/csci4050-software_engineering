package objects;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-28
 */

public class VehicleType {
	private int type_id;
	private String name;
	private double hour_rate;
	private double day_rate;
	private int vehicles;
	
	public VehicleType(int type_id, String name, double hour_rate, double day_rate, int vehicles) {
		this.type_id = type_id;
		this.name = name;
		this.hour_rate = hour_rate;
		this.day_rate = day_rate;
		this.vehicles = vehicles;
	}

	public VehicleType() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the type_id
	 */
	public int getType_id() {
		return type_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the hour_rate
	 */
	public double getHour_rate() {
		return hour_rate;
	}

	/**
	 * @return the day_rate
	 */
	public double getDay_rate() {
		return day_rate;
	}

	/**
	 * @return the vehicles
	 */
	public int getVehicles() {
		return vehicles;
	}	
}
