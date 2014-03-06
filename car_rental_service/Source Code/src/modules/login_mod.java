package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-10
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import objects.Metadata;
import dao.GlobalDB;

public class login_mod {
	private GlobalDB global;
	private int user_id;
	private int customer_id;
	private int staff_id;
	private String username;
	
	public login_mod() {
		global = new GlobalDB();
		user_id = -1;
		customer_id = -1;
		staff_id = -1;
		username = "";
	}
	
	public void logger(String username, String remote_address, String remote_host, int remote_port, boolean success) {
		try {
			
			global.insert_login.setString(1, username);
			global.insert_login.setString(2, remote_address);
			global.insert_login.setString(3, remote_host);
			global.insert_login.setInt(4, remote_port);
			global.insert_login.setBoolean(5, success);
			global.insert_login.executeUpdate();
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public List<String> authenticate(Map<String, String[]> parameterMap, String remote_address, String remote_host, int remote_port) {
		try {
			global.openDBconnection();
			
			//Error messages
			List<String> error = new ArrayList<String>();
			int role = 1;
			
			//Check username
			global.select_user_where_username.setString(1, ((String[])parameterMap.get("username"))[0].trim());
			ResultSet rs = global.select_user_where_username.executeQuery();
			if (!rs.next()) {
				error.add("*Username does not exist");
				System.out.println("username bad");
				logger(((String[])parameterMap.get("username"))[0].trim(), remote_address, remote_host, remote_port, false);
				return error;
			}
			
			//Check username and password
			global.select_user_where_username_and_password.setString(1, ((String[])parameterMap.get("username"))[0].trim());
			global.select_user_where_username_and_password.setString(2, ((String[])parameterMap.get("password"))[0]);
			rs = global.select_user_where_username_and_password.executeQuery();
			if (rs.next()) {
				role = rs.getInt("role_id");
				logger(((String[])parameterMap.get("username"))[0].trim(), remote_address, remote_host, remote_port, true);
			} else {
				error.add("*Incorrect password");
				logger(((String[])parameterMap.get("username"))[0].trim(), remote_address, remote_host, remote_port, false);
				return error;
			}
			
			//Check username, password, and account status
			if (role == 1) {
				global.select_user_where_username_and_password_and_status.setString(1, ((String[])parameterMap.get("username"))[0].trim());
				global.select_user_where_username_and_password_and_status.setString(2, ((String[])parameterMap.get("password"))[0]);
				rs = global.select_user_where_username_and_password_and_status.executeQuery();
				if (rs.next()) {
					user_id = rs.getInt("user_id");
					customer_id = rs.getInt("id");
					username = rs.getString("username");
					return error;
				} else {
					error.add("*Account has been disabled");
					return error;
				}
			} else {
				global.select_user_where_username_and_password_and_status_staff.setString(1, ((String[])parameterMap.get("username"))[0].trim());
				global.select_user_where_username_and_password_and_status_staff.setString(2, ((String[])parameterMap.get("password"))[0]);
				rs = global.select_user_where_username_and_password_and_status_staff.executeQuery();
				if (rs.next()) {
					user_id = rs.getInt("user_id1");
					staff_id = rs.getInt("id");
					username = rs.getString("username");
					return error;
				} else {
					error.add("*Account has been disabled");
					return error;
				}
				
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Metadata getMetadata() {
		return new Metadata(user_id, customer_id, staff_id, username);
	}
}
