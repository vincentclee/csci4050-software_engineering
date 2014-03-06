package objects;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

public class Metadata {
	private int user_id;
	private int customer_id;
	private int staff_id;
	private String username;
	
	public Metadata(int user_id, int customer_id, int staff_id, String username) {
		this.user_id = user_id;
		this.customer_id = customer_id;
		this.staff_id = staff_id;
		this.username = username;
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @return the staff_id
	 */
	public int getStaff_id() {
		return staff_id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
}
