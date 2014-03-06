package objects;

import java.util.Date;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-30
 */

public class Administrator {
	private int user_id;
	private String username;
	
	private int staff_id;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date registered;
	
	public Administrator(int user_id, String username, int staff_id, String firstname, String middlename, String lastname, Date registered) {
		this.user_id = user_id;
		this.username = username;
		this.staff_id = staff_id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.registered = registered;
	}

	public Administrator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the staff_id
	 */
	public int getStaff_id() {
		return staff_id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @return the registered
	 */
	public Date getRegistered() {
		return registered;
	}
	
	
}
