package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-19
 */

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.GlobalDB;

public class inputparser_mod {
	private GlobalDB global;
	
	public inputparser_mod() {
		global = new GlobalDB();
	}
	
	public List<String> parse_username(String username) {
		try {
			global.openDBconnection();
			
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (username.length() == 0)
				error.add("*Invalid username");
			else {
				global.select_user_where_username.setString(1, username);
				
				ResultSet rs = global.select_user_where_username.executeQuery();
				if (rs.next()) {
					error.add("*Username already exists");
				}
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
	
	public List<String> parse_email(String email) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/Validateemailaddress.htm
			String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

			if (!email.matches(EMAIL_REGEX))
				error.add("*Invalid email");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_password(String password, String password1) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//Length > 0
			if (password.length() == 0)
				error.add("*Password not long enough");
			
			if (!password.equals(password1))
				error.add("*Passwords do not match");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_street1(String street1) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (street1.length() == 0)
				error.add("*Invalid address");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_city(String city) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (city.length() == 0)
				error.add("*Invalid city");
			
	        for (char c : city.toCharArray()){
	            if (Character.isDigit(c)){
	            	error.add("*Invalid city");
	                break;
	            }
	        }
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_zip(String zip) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/MatchZip.htm
			String ZIPCODE_REGEX = "\\d{5}(-\\d{4})?";
			
			if (!zip.matches(ZIPCODE_REGEX))
				error.add("*Invalid zipcode");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_phonenumber(String phonenumber) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/Matchphonenumber.htm
			String PHONENUMBER_REGEX = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
			
			if (!phonenumber.matches(PHONENUMBER_REGEX))
				error.add("*Invalid phone number");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_firstname(String firstname) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (firstname.length() == 0)
				error.add("*Invalid firstname");
			
	        for (char c : firstname.toCharArray()){
	            if (Character.isDigit(c)){
	            	error.add("*Invalid firstname");
	                break;
	            }
	        }
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_middlename(String middlename) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
	        for (char c : middlename.toCharArray()){
	            if (Character.isDigit(c)){
	            	error.add("*Invalid middlename");
	                break;
	            }
	        }
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_lastname(String lastname) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (lastname.length() == 0)
				error.add("*Invalid lastname");
			
	        for (char c : lastname.toCharArray()){
	            if (Character.isDigit(c)){
	            	error.add("*Invalid lastname");
	                break;
	            }
	        }
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public boolean parse_date(String date) {
		try {			
			String[] tokens = date.split("-");
			//System.out.println(Arrays.toString(tokens));
			
			int year = Integer.parseInt(tokens[0]);
			int month = Integer.parseInt(tokens[1]);
			int day = Integer.parseInt(tokens[2]);
			
			Map<Integer, Integer> monthDays = new HashMap<Integer, Integer>();
			monthDays.put(1, 31);
			monthDays.put(2, 28);
			monthDays.put(3, 31);
			monthDays.put(4, 30);
			monthDays.put(5, 31);
			monthDays.put(6, 30);
			monthDays.put(7, 31);
			monthDays.put(8, 31);
			monthDays.put(9, 30);
			monthDays.put(10, 31);
			monthDays.put(11, 30);
			monthDays.put(12, 31);
			
			//Check for leap year and over
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, year);
			if (cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365 && month == 2) {
				if (day > 29)
					return false;
			} else {
				if (monthDays.get(month) < day)
					return false;
			}
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public List<String> parse_dob(String date) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (!parse_date(date))
				error.add("*Invalid date of birth");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_expiration(String date) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			if (!parse_date(date))
				error.add("*Invalid expiration date");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_license(String license) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/Checkifgivenstringisanumberdigitsonly.htm
			String NUMBER_REGEX = "^\\d+$";
			
			if (!license.matches(NUMBER_REGEX))
				error.add("*Invalid license number");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_creditcard(String creditcard) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/Checkifgivenstringisanumberdigitsonly.htm
			String NUMBER_REGEX = "^\\d+$";
			
			if (!creditcard.matches(NUMBER_REGEX))
				error.add("*Invalid creditcard number");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<String> parse_securitycode(String securitycode) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//http://www.java2s.com/Code/Java/Regular-Expressions/Checkifgivenstringisanumberdigitsonly.htm
			String NUMBER_REGEX = "^\\d+$";
			
			if (!securitycode.matches(NUMBER_REGEX) || securitycode.length() > 3) {
				error.add("*Invalid security code");
				return error;
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public double parseMoney(String amount) {
		try {
			return Math.round(Double.parseDouble(amount) * 100.0) / 100.0;
		} catch(Exception e) {
			return 0.0;
		}
	}
	
	public boolean parseDateAhead(String date_str) {
		try {
			Date today = new Date();
			Date input = new SimpleDateFormat("yyyy-MM-dd-kk-mm").parse(date_str);
			
			if (input.before(today))
				return false;
			
//			System.out.println(today.toString());
//			System.out.println(input.toString());
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
		
		
	}
}