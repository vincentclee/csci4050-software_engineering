package modules;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import objects.Administrator;
import objects.Metadata;
import dao.GlobalDB;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-22
 */

public class administrator_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public administrator_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public List<String> add_administrator(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			//username
			String username = ((String[])parameterMap.get("username"))[0].trim();
			error.addAll(inputparser.parse_username(username));
			
			//password
			String password = ((String[])parameterMap.get("password"))[0];
			String password1 = ((String[])parameterMap.get("password"))[1];
			error.addAll(inputparser.parse_password(password, password1));
			
			//firstname
			String firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(firstname));
			
			//middlename
			String middlename = ((String[])parameterMap.get("middlename"))[0].trim();
			
			//lastname
			String lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(lastname));
			
			//add to database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.insert_user.setInt(1, 2);
				global.insert_user.setString(2, username);
				global.insert_user.setString(3, password);
				global.insert_user.executeUpdate();
				
				global.insert_staff.setString(1, firstname);
				global.insert_staff.setString(2, middlename);
				global.insert_staff.setString(3, lastname);
				global.insert_staff.setBoolean(4, true);
				global.insert_staff.executeUpdate();
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
	
	public Administrator getAdministrator(Metadata user) {
		try {
			global.openDBconnection();
			
			global.select_user_staff_where_id.setInt(1, user.getUser_id());
			ResultSet rs = global.select_user_staff_where_id.executeQuery();
			if (rs.next()) {
				return new Administrator(user.getUser_id(), rs.getString("username"), rs.getInt("id"), rs.getString("firstname"), rs.getString("middlename"), rs.getString("lastname"), rs.getTimestamp("registered"));
			}
			
			return new Administrator();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return new Administrator();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean verifiyPassword(String password, int user_id) {
		try {
			global.openDBconnection();
			
			global.select_user_where_id_and_password.setInt(1, user_id);
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
	
	public List<String> updateAdministrator(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			boolean passwordUpdate = false;
			int user_id = Integer.parseInt(((String[])parameterMap.get("user_id"))[0]);
			
			String password_old = ((String[])parameterMap.get("password_old"))[0];
			
			
			
			//password
			String password = ((String[])parameterMap.get("password"))[0];
			String password1 = ((String[])parameterMap.get("password"))[1];
			
			if (password_old.length() != 0) {
				if (verifiyPassword(password_old, user_id)) {
					error.addAll(inputparser.parse_password(password, password1));
					if (error.isEmpty())
						passwordUpdate = true;
				} else {
					error.add("*Incorrect old password");
				}
			}

			
			//firstname
			String firstname = ((String[])parameterMap.get("firstname"))[0].trim();
			error.addAll(inputparser.parse_firstname(firstname));
			
			//middlename
			String middlename = ((String[])parameterMap.get("middlename"))[0].trim();
			
			//lastname
			String lastname = ((String[])parameterMap.get("lastname"))[0].trim();
			error.addAll(inputparser.parse_lastname(lastname));
			
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				if (passwordUpdate) {
					global.update_user_set_password_where_id.setString(1, password);
					global.update_user_set_password_where_id.setInt(2, user_id);
					global.update_user_set_password_where_id.executeUpdate();
				}
				
				global.update_staff_where_id.setString(1, firstname);
				global.update_staff_where_id.setString(2, middlename);
				global.update_staff_where_id.setString(3, lastname);
				global.update_staff_where_id.setInt(4, user_id);
				global.update_staff_where_id.executeUpdate();
				
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
	
	public List<Administrator> getAdministrators() {
		try {
			global.openDBconnection();
			
			List<Administrator> administrators = new ArrayList<Administrator>();
			
			global.select_staff_where_status.setBoolean(1, true);
			ResultSet rs = global.select_staff_where_status.executeQuery();
			while (rs.next()) {
				administrators.add(new Administrator(rs.getInt("user_id1"), rs.getString("username"), rs.getInt("id"), rs.getString("firstname"), rs.getString("middlename"), rs.getString("lastname"), rs.getTimestamp("registered")));
			}
			
			return administrators;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ArrayList<Administrator>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean disableAdministrator(String staff) {
		try {
			global.openDBconnection();
			
			int staff_id = Integer.parseInt(staff);
			
			global.update_staff_status_where_id.setBoolean(1, false);
			global.update_staff_status_where_id.setInt(2, staff_id);
			global.update_staff_status_where_id.executeUpdate();
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Administrator getAdministrator(String staff) {
		try {
			global.openDBconnection();
			
			int staff_id = Integer.parseInt(staff);
			
			global.select_staff_where_status_id.setBoolean(1, true);
			global.select_staff_where_status_id.setInt(2, staff_id);
			ResultSet rs = global.select_staff_where_status_id.executeQuery();
			if (rs.next()) {
				return new Administrator(rs.getInt("user_id1"), rs.getString("username"), rs.getInt("id"), rs.getString("firstname"), rs.getString("middlename"), rs.getString("lastname"), rs.getTimestamp("registered"));
			}
			
			return new Administrator();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return new Administrator();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public String resetAdministratorPassword(String staff) {
		try {
			global.openDBconnection();
			
			int staff_id = Integer.parseInt(staff);
			UUID uuid = UUID.randomUUID();
			
			global.select_staff_where_status_id.setBoolean(1, true);
			global.select_staff_where_status_id.setInt(2, staff_id);
			ResultSet rs = global.select_staff_where_status_id.executeQuery();
			if (rs.next()) {
				global.update_user_set_password_where_id.setString(1, uuid.toString());
				global.update_user_set_password_where_id.setInt(2, rs.getInt("user_id1"));
				global.update_user_set_password_where_id.executeUpdate();
			}
			
			return uuid.toString();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return "";
		} finally {
			global.closeDBconnection();
		}
	}
}
