package objects;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

import java.util.Date;

public class Customer {
	//user
	private int user_id;
	private String username;
	
	//customer
	private int customer_id;
	private String email, phonenumber, license_firstname, license_middlename, license_lastname, license_state, license_no;
	private Date registered, license_birthdate, license_expiration, membership_exp;
	private boolean status;
	private double balance;
	
	//customer_address
	private int address_id;
	private String address_name, address_street1, address_street2, address_city, address_state, address_zip;
	
	//customer_creditcard
	private int creditcard_id;
	private String no, code,firstname, lastname, street1, street2, city, state, zip;
	private Date expires;
	
	//membership
	private int membership_id, months;
	private String membership_name, description;
	private Double price;

	public void set_user(int user_id, String username) {
		this.user_id = user_id;
		this.username = username;
	}

	public void set_customer(int customer_id, String email, Date registered, boolean status, String phonenumber, String license_firstname,
			String license_middlename, String license_lastname, Date license_birthdate, Date license_expiration, String license_state, 
			String license_no, Date membership_exp, double balance) {
		this.customer_id = customer_id;
		this.email = email;
		this.registered = registered;
		this.status = status;
		this.phonenumber = phonenumber;
		this.license_firstname = license_firstname;
		this.license_middlename = license_middlename;
		this.license_lastname = license_lastname;
		this.license_birthdate = license_birthdate;
		this.license_expiration = license_expiration;
		this.license_state = license_state;
		this.license_no = license_no;
		this.membership_exp = membership_exp;
		this.balance = balance;
	}

	public void set_customer_address(int address_id, String address_name, String address_street1, String address_street2,
			String address_city, String address_state, String address_zip) {
		this.address_id = address_id;
		this.address_name = address_name;
		this.address_street1 = address_street1;
		this.address_street2 = address_street2;
		this.address_city = address_city;
		this.address_state = address_state;
		this.address_zip = address_zip;
	}

	public void set_customer_creditcard(int creditcard_id, String no, String code, Date expires, String firstname, String lastname, 
			String street1, String street2, String city, String state, String zip) {
		this.creditcard_id = creditcard_id;
		this.no = no;
		this.code = code;
		this.expires = expires;
		this.firstname = firstname;
		this.lastname = lastname;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public void set_membership(int membership_id, String membership_name, String description, Double price, int months) {
		this.membership_id = membership_id;
		this.membership_name = membership_name;
		this.description = description;
		this.price = price;
		this.months = months;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
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
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the registered
	 */
	public Date getRegistered() {
		return registered;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @return the license_firstname
	 */
	public String getLicense_firstname() {
		return license_firstname;
	}

	/**
	 * @return the license_middlename
	 */
	public String getLicense_middlename() {
		return license_middlename;
	}

	/**
	 * @return the license_lastname
	 */
	public String getLicense_lastname() {
		return license_lastname;
	}

	/**
	 * @return the license_birthdate
	 */
	public Date getLicense_birthdate() {
		return license_birthdate;
	}

	/**
	 * @return the license_expiration
	 */
	public Date getLicense_expiration() {
		return license_expiration;
	}

	/**
	 * @return the license_state
	 */
	public String getLicense_state() {
		return license_state;
	}

	/**
	 * @return the license_no
	 */
	public String getLicense_no() {
		return license_no;
	}
	
	/**
	 * @return the license_noMasked
	 */
	public String getLicense_noMasked() {
		try {
			String temp = "";
			
			for (int i = 0; i < license_no.length()-4; i++)
				temp += "*";
			
			temp += license_no.substring(license_no.length()-4, license_no.length());
			
			return temp;
		} catch(Exception e) {
			return license_no;
		}
	}

	/**
	 * @return the membership_exp
	 */
	public Date getMembership_exp() {
		return membership_exp;
	}

	/**
	 * @return the address_id
	 */
	public int getAddress_id() {
		return address_id;
	}

	/**
	 * @return the address_name
	 */
	public String getAddress_name() {
		return address_name;
	}

	/**
	 * @return the address_street1
	 */
	public String getAddress_street1() {
		return address_street1;
	}

	/**
	 * @return the address_street2
	 */
	public String getAddress_street2() {
		return address_street2;
	}

	/**
	 * @return the address_city
	 */
	public String getAddress_city() {
		return address_city;
	}

	/**
	 * @return the address_state
	 */
	public String getAddress_state() {
		return address_state;
	}

	/**
	 * @return the address_zip
	 */
	public String getAddress_zip() {
		return address_zip;
	}

	/**
	 * @return the creditcard_id
	 */
	public int getCreditcard_id() {
		return creditcard_id;
	}

	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	
	/**
	 * @return the no masked
	 */
	public String getNoMasked() {
		try {
			String temp = "";
			
			for (int i = 0; i < no.length()-4; i++)
				temp += "*";
			
			temp += no.substring(no.length()-4, no.length());
			
			return temp;
		} catch(Exception e) {
			return no;
		}
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the expires
	 */
	public Date getExpires() {
		return expires;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
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
	 * @return the membership_id
	 */
	public int getMembership_id() {
		return membership_id;
	}

	/**
	 * @return the membership_name
	 */
	public String getMembership_name() {
		return membership_name;
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
	public Double getPrice() {
		return price;
	}

	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}
}
