package objects;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-12
 */

public class Membership {
	private int id, months;
	private String name, description;
	private double price;
	
	public Membership(int id, String name, String description, double price, int months) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.months = months;
	}

	public Membership() {
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}
}
