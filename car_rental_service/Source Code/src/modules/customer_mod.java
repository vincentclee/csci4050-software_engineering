package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-16
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import objects.Customer;
import objects.Metadata;
import dao.GlobalDB;

public class customer_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	private Metadata data;
	
	public customer_mod(Metadata data) {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
		this.data = data;
	}
	

	public customer_mod() {
		global = new GlobalDB();
	}


	public Customer get_customer() {
		try {
			global.openDBconnection();
			
			Customer customer = new Customer();
			int membership_id = 0;
			
			//set from user table
			customer.set_user(data.getUser_id(), data.getUsername());
			
			//set from customer table
			global.select_customer_where_id.setInt(1, data.getCustomer_id());
			ResultSet rs = global.select_customer_where_id.executeQuery();
			if (rs.next()) {
				customer.set_customer(data.getCustomer_id(), rs.getString("email"), new Date(rs.getTimestamp("registered").getTime()), 
						rs.getBoolean("status"), rs.getString("phonenumber"), rs.getString("license_firstname"), rs.getString("license_middlename"), 
						rs.getString("license_lastname"), rs.getDate("license_birthdate"), rs.getDate("license_expiration"), 
						rs.getString("license_state"), rs.getString("license_no"), new Date(rs.getTimestamp("membership_exp").getTime()), rs.getDouble("balance"));
				
				membership_id = rs.getInt("membership_id");
			}
			
			//set from customer address table
			global.select_customer_address_where_customer_id.setInt(1, data.getCustomer_id());
			rs = global.select_customer_address_where_customer_id.executeQuery();
			if (rs.next()) {
				customer.set_customer_address(rs.getInt("id"), rs.getString("name"), rs.getString("street1"), rs.getString("street2"), 
						rs.getString("city"), rs.getString("state"), rs.getString("zip"));
			}
			
			//set from customer creditcard table
			global.select_customer_creditcard_where_customer_id.setInt(1, data.getCustomer_id());
			rs = global.select_customer_creditcard_where_customer_id.executeQuery();
			if (rs.next()) {
				customer.set_customer_creditcard(rs.getInt("id"), rs.getString("no"), rs.getString("code"), rs.getDate("expires"), 
						rs.getString("firstname"), rs.getString("lastname"), rs.getString("street1"), rs.getString("street2"), 
						rs.getString("city"), rs.getString("state"), rs.getString("zip"));
			}
			
			//set from customer table
			if (membership_id == 0) {
				customer.set_membership(membership_id, "Free", "", 0.0, 0);
			} else {
				global.select_membership_where_id.setInt(1, membership_id);
				rs = global.select_membership_where_id.executeQuery();
				if (rs.next()) {
					customer.set_membership(membership_id, rs.getString("name"), rs.getString("description"), 
							rs.getDouble("price"), rs.getInt("months"));
				}
			}
			
			

			
			return customer;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Customer();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean verifiyPassword(String password) {
		try {
			global.openDBconnection();
			
			global.select_user_where_id_and_password.setInt(1, data.getUser_id());
			global.select_user_where_id_and_password.setString(2, password);
			ResultSet rs = global.select_user_where_id_and_password.executeQuery();
			if (!rs.next())
				return false;
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> account_setting(Map<String, String[]> parameterMap) {
		try {		
			//Error messages
			List<String> error = new ArrayList<String>();
			boolean update_password = false;

			//current password
			String current_password = ((String[])parameterMap.get("current_password"))[0];
			
			//password
			String password = ((String[])parameterMap.get("password"))[0];
			String password1 = ((String[])parameterMap.get("password"))[1];
			
			if (current_password.length() > 0 || password.length() > 0 || password1.length() > 0) {
				if (verifiyPassword(current_password)) {
					error.addAll(inputparser.parse_password(password, password1));
					if (error.isEmpty())
						update_password = true;
				} else
					error.add("*Incorrect current password");
			}
			
			//email
			String email = ((String[])parameterMap.get("email"))[0].trim();
			error.addAll(inputparser.parse_email(email));
			
			//phone number
			String phonenumber = ((String[])parameterMap.get("phonenumber"))[0].trim();
			error.addAll(inputparser.parse_phonenumber(phonenumber));
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				if (update_password) {
					global.update_user_set_password_where_id.setString(1, password);
					global.update_user_set_password_where_id.setInt(2, data.getUser_id());
					global.update_user_set_password_where_id.executeUpdate();
				}
				
				global.update_customer_where_id.setString(1, email);
				global.update_customer_where_id.setString(2, phonenumber);
				global.update_customer_where_id.setInt(3, data.getCustomer_id());
				global.update_customer_where_id.executeUpdate();
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> account_address(Map<String, String[]> parameterMap) {
		try {			
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//street1
			String street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(street1));
			
			//street2
			String street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			//city
			String city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(city));
			
			//state
			String state = ((String[])parameterMap.get("state"))[0].trim();
			
			//zip
			String zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(zip));
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_customer_address_where_customer_id.setString(1, street1);
				global.update_customer_address_where_customer_id.setString(2, street2);
				global.update_customer_address_where_customer_id.setString(3, city);
				global.update_customer_address_where_customer_id.setString(4, state);
				global.update_customer_address_where_customer_id.setString(5, zip);
				global.update_customer_address_where_customer_id.setInt(6, data.getCustomer_id());
				global.update_customer_address_where_customer_id.executeUpdate();
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> account_creditcard(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//creditcard
			String creditcard = ((String[])parameterMap.get("creditcard"))[0].trim();
			error.addAll(inputparser.parse_creditcard(creditcard));
			
			//security code
			String securitycode = ((String[])parameterMap.get("securitycode"))[0].trim();
			error.addAll(inputparser.parse_securitycode(securitycode));
			
			//expiration date
			String expdateStr = "";
			expdateStr += ((String[])parameterMap.get("exp_year"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_month"))[0];
			expdateStr += "-01";
			Date expires = Date.valueOf(expdateStr);
			
			
			//firstname
			String firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(firstname));
			
			//lastname
			String lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(lastname));
			
			//street1
			String street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(street1));
			
			//street2
			String street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			//city
			String city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(city));
			
			//state
			String state = ((String[])parameterMap.get("state"))[0].trim();
			
			//zip
			String zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(zip));
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_customer_creditcard_where_customer_id.setString(1, creditcard);
				global.update_customer_creditcard_where_customer_id.setString(2, securitycode);
				global.update_customer_creditcard_where_customer_id.setDate(3, expires);
				global.update_customer_creditcard_where_customer_id.setString(4, firstname);
				global.update_customer_creditcard_where_customer_id.setString(5, lastname);
				global.update_customer_creditcard_where_customer_id.setString(6, street1);
				global.update_customer_creditcard_where_customer_id.setString(7, street2);
				global.update_customer_creditcard_where_customer_id.setString(8, city);
				global.update_customer_creditcard_where_customer_id.setString(9, state);
				global.update_customer_creditcard_where_customer_id.setString(10, zip);
				global.update_customer_creditcard_where_customer_id.setInt(11, data.getCustomer_id());
				global.update_customer_creditcard_where_customer_id.executeUpdate();
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> account_license(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//firstname
			String firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(firstname));
			
			//middlename
			String middlename = ((String[])parameterMap.get("middlename"))[0].trim();
			error.addAll(inputparser.parse_middlename(middlename));
			
			//lastname
			String lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(lastname));
			
			//license date of birth in format -- yyyy-MM-dd
			String dateStr = "";
			dateStr += ((String[])parameterMap.get("dob_year"))[0];
			dateStr += "-";
			dateStr += ((String[])parameterMap.get("dob_month"))[0];
			dateStr += "-";
			dateStr += ((String[])parameterMap.get("dob_day"))[0];
			Date dob = Date.valueOf(dateStr);
			error.addAll(inputparser.parse_dob(dateStr));
			
			//license no
			String no = ((String[])parameterMap.get("no"))[0].trim();
			error.addAll(inputparser.parse_license(no));
			
			//license expiration
			String expdateStr = "";
			expdateStr += ((String[])parameterMap.get("exp_year"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_month"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_day"))[0];
			Date expiration = Date.valueOf(expdateStr);
			error.addAll(inputparser.parse_expiration(expdateStr));
			
			
			//issued state
			String state = ((String[])parameterMap.get("state"))[0].trim();
			
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_customer_where_id_1.setString(1, firstname);
				global.update_customer_where_id_1.setString(2, middlename);
				global.update_customer_where_id_1.setString(3, lastname);
				global.update_customer_where_id_1.setDate(4, dob);
				global.update_customer_where_id_1.setDate(5, expiration);
				global.update_customer_where_id_1.setString(6, state);
				global.update_customer_where_id_1.setString(7, no);
				global.update_customer_where_id_1.setInt(8, data.getCustomer_id());
				global.update_customer_where_id_1.executeUpdate();
			}
						
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> membership_terminate(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//check password
			if (!verifiyPassword(((String[])parameterMap.get("password"))[0])) {
				error.add("*Incorrect Password");
			}
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				global.disable_foreignkey.execute();
				global.update_customer_where_id_and_terminate.setInt(1, 0);
				global.update_customer_where_id_and_terminate.setInt(2, data.getCustomer_id());
				global.update_customer_where_id_and_terminate.executeUpdate();
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> account_deactivate(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//check password
			if (!verifiyPassword(((String[])parameterMap.get("password"))[0])) {
				error.add("*Incorrect Password");
			}
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				global.update_customer_where_id_and_status.setInt(1, data.getCustomer_id());
				global.update_customer_where_id_and_status.executeUpdate();
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean checkMembership() {
		try {
			global.openDBconnection();
			
			global.select_customer_where_id.setInt(1, data.getCustomer_id());
			ResultSet rs = global.select_customer_where_id.executeQuery();
			if (rs.next()) {
				if (rs.getInt("membership_id") == 0)
					return false;
			}
			
			return true;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Customer> getAllCustomers() {
		try {
			global.openDBconnection();
			
			List<Customer> customers = new ArrayList<Customer>();
			
			global.select_customer_where_status.setBoolean(1, true);
			ResultSet rs = global.select_customer_where_status.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.set_customer(rs.getInt("id"), rs.getString("email"), new Date(rs.getTimestamp("registered").getTime()), 
						rs.getBoolean("status"), rs.getString("phonenumber"), rs.getString("license_firstname"), rs.getString("license_middlename"), 
						rs.getString("license_lastname"), rs.getDate("license_birthdate"), rs.getDate("license_expiration"), 
						rs.getString("license_state"), rs.getString("license_no"), new Date(rs.getTimestamp("membership_exp").getTime()), rs.getDouble("balance"));
				customer.setUsername(rs.getString("username"));
				
				customers.add(customer);
			}
			
			
			return customers;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return new ArrayList<Customer>();
		}
	}
	
	public Customer getCustomer(String customerID) {
		try {
			global.openDBconnection();
			
			int customer_id = Integer.parseInt(customerID);
			
			
			global.select_customer_where_status_customer_id.setBoolean(1, true);
			global.select_customer_where_status_customer_id.setInt(2, customer_id);
			ResultSet rs = global.select_customer_where_status_customer_id.executeQuery();
			if (rs.next()) {
				Customer customer = new Customer();
				customer.set_customer(rs.getInt("id"), rs.getString("email"), new Date(rs.getTimestamp("registered").getTime()), 
						rs.getBoolean("status"), rs.getString("phonenumber"), rs.getString("license_firstname"), rs.getString("license_middlename"), 
						rs.getString("license_lastname"), rs.getDate("license_birthdate"), rs.getDate("license_expiration"), 
						rs.getString("license_state"), rs.getString("license_no"), new Date(rs.getTimestamp("membership_exp").getTime()), rs.getDouble("balance"));
				customer.setUsername(rs.getString("username"));
				
				return customer;
			}
			
			return new Customer();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Customer();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public String resetCustomerPassword(String customer) {
		try {
			global.openDBconnection();
			
			int customer_id = Integer.parseInt(customer);
			UUID uuid = UUID.randomUUID();			
			
			global.select_customer_where_id.setInt(1, customer_id);
			ResultSet rs = global.select_customer_where_id.executeQuery();
			if (rs.next()) {
				global.update_user_set_password_where_id.setString(1, uuid.toString());
				global.update_user_set_password_where_id.setInt(2, rs.getInt("user_id"));
				global.update_user_set_password_where_id.executeUpdate();
			}
			
			return uuid.toString();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return "";
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean disableCustomer(String customerID) {
		try {
			global.openDBconnection();
			
			int customer_id = Integer.parseInt(customerID);
			
			global.update_customer_where_id_and_status.setInt(1, customer_id);
			global.update_customer_where_id_and_status.executeUpdate();
			
			return true;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
}