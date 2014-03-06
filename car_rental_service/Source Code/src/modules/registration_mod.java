package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import dao.GlobalDB;

public class registration_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	//step
	private String username, password, email;
	
	//step1
	private String address_name, address_street1, address_street2, address_city, address_state, address_zip;
	
	//step2
	private int membership;
	
	//step3
	private String firstname, middlename, lastname, phonenumber, license_state, license;
	private Date dob, expiration;
	
	//step4
	private String creditcard, securitycode, cc_firstname, cc_lastname, cc_street1, cc_street2, cc_city, cc_state, cc_zip;
	private Date cc_expiration;
	
	public registration_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public List<String> step(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//username
			username = ((String[])parameterMap.get("username"))[0].trim();
			error.addAll(inputparser.parse_username(username));
			
			//email
			email = ((String[])parameterMap.get("email"))[0].trim();
			error.addAll(inputparser.parse_email(email));
			
			//password
			password = ((String[])parameterMap.get("password"))[0];
			error.addAll(inputparser.parse_password(((String[])parameterMap.get("password"))[0], ((String[])parameterMap.get("password"))[1]));
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> step1(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			address_name = ((String[])parameterMap.get("name"))[0];
			
			//street address
			address_street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(address_street1));
			
			//can be blank
			address_street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			//city
			address_city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(address_city));
			
			//state
			address_state = ((String[])parameterMap.get("state"))[0];
			
			//zip code
			address_zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(address_zip));
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> step2(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			for (Object key: parameterMap.keySet()) {
				String keyStr = (String)key;
				
				if (!keyStr.equals("step")) {
					membership = Integer.parseInt(keyStr);
					return error;
				}
			}
			error.add("*Select a membership");
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> step3(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//firstname
			firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(firstname));
			
			//middlename
			middlename = ((String[])parameterMap.get("middlename"))[0].trim();
			error.addAll(inputparser.parse_middlename(middlename));
			
			//lastname
			lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(lastname));
			
			//phonenumber
			phonenumber = ((String[])parameterMap.get("phonenumber"))[0].trim();
			error.addAll(inputparser.parse_phonenumber(phonenumber));
			
			//license date of birth in format -- yyyy-MM-dd
			String dateStr = "";
			dateStr += ((String[])parameterMap.get("dob_year"))[0];
			dateStr += "-";
			dateStr += ((String[])parameterMap.get("dob_month"))[0];
			dateStr += "-";
			dateStr += ((String[])parameterMap.get("dob_day"))[0];
			dob = Date.valueOf(dateStr);
			error.addAll(inputparser.parse_dob(dateStr));
			
			//license state
			license_state = ((String[])parameterMap.get("license_state"))[0];
			
			//license
			license = ((String[])parameterMap.get("license"))[0].trim();
			error.addAll(inputparser.parse_license(license));
			
			//license expiration
			String expdateStr = "";
			expdateStr += ((String[])parameterMap.get("exp_year"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_month"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_day"))[0];
			expiration = Date.valueOf(expdateStr);
			error.addAll(inputparser.parse_expiration(expdateStr));
			
			return error;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> step4(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//need parsing
			creditcard = ((String[])parameterMap.get("creditcard"))[0].trim();
			error.addAll(inputparser.parse_creditcard(creditcard));
			
			//security code
			securitycode = ((String[])parameterMap.get("securitycode"))[0].trim();
			error.addAll(inputparser.parse_securitycode(securitycode));
			
			//expiration date
			String expdateStr = "";
			expdateStr += ((String[])parameterMap.get("exp_year"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("exp_month"))[0];
			expdateStr += "-01";
			cc_expiration = Date.valueOf(expdateStr);
						
			//firstname
			cc_firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(cc_firstname));
			
			//lastname
			cc_lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(cc_lastname));
			
			//street
			cc_street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(cc_street1));
			
			cc_street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			//city
			cc_city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(cc_city));
			
			cc_state = ((String[])parameterMap.get("state"))[0];
			
			//zip code
			cc_zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(cc_zip));
			
			//add to database if no errors
			if (error.isEmpty())
				add();
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public void add() {
		try {
			global.openDBconnection();
			
			global.insert_user.setInt(1, 1);
			global.insert_user.setString(2, username);
			global.insert_user.setString(3, password);
			global.insert_user.executeUpdate();
			
			int last_insert_id = 1;
			ResultSet rs = global.select_last_insert_id.executeQuery();
			if (rs.next())
				last_insert_id = rs.getInt(1);
			
			
			global.insert_customer.setInt(1, last_insert_id);
			global.insert_customer.setInt(2, membership);
			global.insert_customer.setString(3, email);
			global.insert_customer.setInt(4, 1);
			global.insert_customer.setString(5, phonenumber);
			global.insert_customer.setString(6, firstname);
			global.insert_customer.setString(7, middlename);
			global.insert_customer.setString(8, lastname);
			global.insert_customer.setDate(9, dob);
			global.insert_customer.setDate(10, expiration);
			global.insert_customer.setString(11, license_state);
			global.insert_customer.setString(12, license);
			global.insert_customer.setDouble(14, 0.0);
			
			global.select_membership_where_id.setInt(1, membership);
			ResultSet rss = global.select_membership_where_id.executeQuery();
			if (rss.next())
				global.insert_customer.setInt(13, rss.getInt("months"));
			
			global.insert_customer.executeUpdate();
			
			
			rs = global.select_last_insert_id.executeQuery();
			if (rs.next())
				last_insert_id = rs.getInt(1);
			
			
			//address
			global.insert_customer_address.setInt(1, last_insert_id);
			global.insert_customer_address.setString(2, address_name);
			global.insert_customer_address.setString(3, address_street1);
			global.insert_customer_address.setString(4, address_street2);
			global.insert_customer_address.setString(5, address_city);
			global.insert_customer_address.setString(6, address_state);
			global.insert_customer_address.setString(7, address_zip);
			global.insert_customer_address.setInt(8, 1);
			global.insert_customer_address.executeUpdate();
			
			//creditcard
			global.insert_customer_creditcard.setInt(1, last_insert_id);
			global.insert_customer_creditcard.setString(2, creditcard);
			global.insert_customer_creditcard.setString(3, securitycode);
			global.insert_customer_creditcard.setDate(4, cc_expiration);
			global.insert_customer_creditcard.setString(5, cc_firstname);
			global.insert_customer_creditcard.setString(6, cc_lastname);
			global.insert_customer_creditcard.setString(7, cc_street1);
			global.insert_customer_creditcard.setString(8, cc_street2);
			global.insert_customer_creditcard.setString(9, cc_city);
			global.insert_customer_creditcard.setString(10, cc_state);
			global.insert_customer_creditcard.setString(11, cc_zip);
			global.insert_customer_creditcard.setInt(12, 1);
			global.insert_customer_creditcard.executeUpdate();
		} catch(Exception e) {
			System.err.println(e.getMessage());
		} finally {
			global.closeDBconnection();
		}
	}
}