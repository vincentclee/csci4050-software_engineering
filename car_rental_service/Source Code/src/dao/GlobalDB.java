package dao;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;

public class GlobalDB {
	//customer
	public PreparedStatement select_customer;
	public PreparedStatement select_customer_where_id;
	public PreparedStatement select_customer_where_status;
	public PreparedStatement select_customer_where_status_customer_id;
	public PreparedStatement insert_customer;
	public PreparedStatement update_customer_where_id;
	public PreparedStatement update_customer_where_id_1;
	public PreparedStatement update_customer_where_id_and_status;
	public PreparedStatement update_customer_where_id_and_terminate;
	public PreparedStatement update_customer_where_id_and_membership;
	public PreparedStatement update_customer_where_id_and_membership1;
	public PreparedStatement update_customer_balance_where_id;
	public PreparedStatement delete_customer;
	
	//customer_address
	public PreparedStatement select_customer_address;
	public PreparedStatement select_customer_address_where_customer_id;
	public PreparedStatement insert_customer_address;
	public PreparedStatement update_customer_address_where_customer_id;
	public PreparedStatement delete_customer_address;
	
	//customer_creditcard
	public PreparedStatement select_customer_creditcard;
	public PreparedStatement select_customer_creditcard_where_customer_id;
	public PreparedStatement insert_customer_creditcard;
	public PreparedStatement update_customer_creditcard_where_customer_id;
	public PreparedStatement delete_customer_creditcard;
	
	//login
	public PreparedStatement select_login;
	public PreparedStatement insert_login;
	public PreparedStatement delete_login;
	
	//membership
	public PreparedStatement select_membership;
	public PreparedStatement select_membership_where_id;
	public PreparedStatement insert_membership;
	public PreparedStatement update_membership_where_id;
	public PreparedStatement delete_membership;
	
	//rental
	public PreparedStatement select_rental;
	public PreparedStatement select_rental_where_id;
	public PreparedStatement select_rental_where_customer_id;
	public PreparedStatement insert_rental;
	public PreparedStatement update_rental_returned_where_id;
	public PreparedStatement update_rental_cost_where_id;
	public PreparedStatement update_rental_cancelled_where_id;
	public PreparedStatement delete_rental;
	
	//role
	public PreparedStatement select_role;
	public PreparedStatement insert_role;
	public PreparedStatement delete_role;
	
	//staff
	public PreparedStatement select_staff;
	public PreparedStatement select_staff_where_status;
	public PreparedStatement select_staff_where_status_id;
	public PreparedStatement insert_staff;
	public PreparedStatement update_staff_where_id;
	public PreparedStatement update_staff_status_where_id;
	public PreparedStatement delete_staff;
	
	//user
	public PreparedStatement select_user;
	public PreparedStatement select_user_where_id;
	public PreparedStatement select_user_where_id_and_password;
	public PreparedStatement select_user_where_username;
	public PreparedStatement select_user_where_username_and_password;
	public PreparedStatement select_user_where_username_and_password_and_status;
	public PreparedStatement select_user_where_username_and_password_and_status_staff;
	public PreparedStatement select_user_staff_where_id;
	public PreparedStatement insert_user;
	public PreparedStatement update_user_set_password_where_id;
	public PreparedStatement delete_user;
	
	//vehicle
	public PreparedStatement select_vehicle;
	public PreparedStatement select_vehicle_where_status;
	public PreparedStatement select_vehicle_where_location;
	public PreparedStatement select_vehicle_where_type;
	public PreparedStatement select_vehicle_where_available_status;
	public PreparedStatement select_vehicle_where_status_available_location;
	public PreparedStatement select_vehicle_where_id;
	public PreparedStatement select_vehicle_where_status_make;
	public PreparedStatement update_vehicle_available_where_id;
	public PreparedStatement update_vehicle_info_where_id;
	public PreparedStatement update_vehicle_status_where_id;
	public PreparedStatement insert_vehicle;
	public PreparedStatement delete_vehicle;
	
	//vehicle_location
	public PreparedStatement select_vehicle_location;
	public PreparedStatement select_vehicle_location_where_id;
	public PreparedStatement select_vehicle_location_where_status;
	public PreparedStatement select_vehicle_location_where_name;
	public PreparedStatement insert_vehicle_location;
	public PreparedStatement update_vehicle_location_where_id;
	public PreparedStatement update_vehicle_location_where_id_status;
	public PreparedStatement delete_vehicle_location;
	
	//vehicle_make
	public PreparedStatement select_vehicle_make;
	public PreparedStatement select_vehicle_make_where_id;
	public PreparedStatement select_vehicle_make_where_make;
	public PreparedStatement insert_vehicle_make;
	public PreparedStatement delete_vehicle_make;
	
	//vehicle_model
	public PreparedStatement select_vehicle_model;
	public PreparedStatement select_vehicle_model_where_id;
	public PreparedStatement select_vehicle_model_where_make;
	public PreparedStatement select_vehicle_model_where_model;
	public PreparedStatement insert_vehicle_model;
	public PreparedStatement delete_vehicle_model;
	
	//vehicle_type
	public PreparedStatement select_vehicle_type;
	public PreparedStatement select_vehicle_type_where_id;
	public PreparedStatement select_vehicle_type_where_status;
	public PreparedStatement select_vehicle_type_where_name;
	public PreparedStatement insert_vehicle_type;
	public PreparedStatement update_vehicle_type_where_id;
	public PreparedStatement update_vehicle_type_where_id_status;
	public PreparedStatement delete_vehicle_type;
	
	
	public PreparedStatement reset;
	public PreparedStatement disable_foreignkey;
	public PreparedStatement select_last_insert_id;
	
	private Connection conn;
	private UUID uuid;
	
	public GlobalDB() {
		
	}
	
	public void openDBconnection() {
		try {
            //Connect to database
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//System.out.println("<Instantiated MySQL driver>");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/team4", "team4", "seprocess");
			uuid = UUID.randomUUID();
			System.out.println("<Connected to MySQL " + uuid + ">");
			
			//Prepared statements used to query database
			select_customer = conn.prepareStatement("SELECT * FROM customer");
			select_customer_where_id = conn.prepareStatement("SELECT * FROM customer WHERE id=?");
			select_customer_where_status = conn.prepareStatement("SELECT customer.*, user.username FROM user JOIN customer ON user.id = customer.user_id WHERE status=?");
			select_customer_where_status_customer_id = conn.prepareStatement("SELECT customer.*, user.username FROM user JOIN customer ON user.id = customer.user_id WHERE status=? AND customer.id=?");
			insert_customer = conn.prepareStatement("INSERT INTO customer(user_id,membership_id,email,registered,status,phonenumber,license_firstname,license_middlename,license_lastname,license_birthdate,license_expiration,license_state,license_no,membership_exp,balance) VALUES(?,?,?,NOW(),?,?,?,?,?,?,?,?,?,TIMESTAMPADD(MONTH,?,NOW()),?)");
			update_customer_where_id = conn.prepareStatement("UPDATE customer SET email=?, phonenumber=? WHERE id=?");
			update_customer_where_id_1 = conn.prepareStatement("UPDATE customer SET license_firstname=?,license_middlename=?,license_lastname=?,license_birthdate=?,license_expiration=?,license_state=?,license_no=? WHERE id=?");
			update_customer_where_id_and_status = conn.prepareStatement("UPDATE customer SET status=0 WHERE id=?");
			update_customer_where_id_and_terminate = conn.prepareStatement("UPDATE customer SET membership_id=?, membership_exp=NOW() WHERE id=?");
			update_customer_where_id_and_membership = conn.prepareStatement("UPDATE customer SET membership_id=?,membership_exp=TIMESTAMPADD(MONTH,?,NOW()),balance=(balance+?) WHERE id=?");
			update_customer_where_id_and_membership1 = conn.prepareStatement("UPDATE customer SET membership_id=?,membership_exp=TIMESTAMPADD(MONTH,?,membership_exp),balance=(balance+?) WHERE id=?");
			update_customer_balance_where_id = conn.prepareStatement("UPDATE customer SET balance=(balance+?) WHERE id=?");
			delete_customer = conn.prepareStatement("DELETE FROM customer");
			
			select_customer_address = conn.prepareStatement("SELECT * FROM customer_address");
			select_customer_address_where_customer_id = conn.prepareStatement("SELECT * FROM customer_address WHERE customer_id=?");
			insert_customer_address = conn.prepareStatement("INSERT INTO customer_address(customer_id,name,street1,street2,city,state,zip,active,last_update) VALUES(?,?,?,?,?,?,?,?,NOW())");
			update_customer_address_where_customer_id = conn.prepareStatement("UPDATE customer_address SET street1=?,street2=?,city=?,state=?,zip=? WHERE id=?");
			delete_customer_address = conn.prepareStatement("DELETE FROM customer_address");
			
			select_customer_creditcard = conn.prepareStatement("SELECT * FROM customer_creditcard");
			select_customer_creditcard_where_customer_id = conn.prepareStatement("SELECT * FROM customer_creditcard WHERE customer_id1=?");
			insert_customer_creditcard = conn.prepareStatement("INSERT INTO customer_creditcard(customer_id1,no,code,expires,firstname,lastname,street1,street2,city,state,zip,active,last_update) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,NOW())");
			update_customer_creditcard_where_customer_id = conn.prepareStatement("UPDATE customer_creditcard SET no=?,code=?,expires=?,firstname=?,lastname=?,street1=?,street2=?,city=?,state=?,zip=? WHERE customer_id1=?");
			delete_customer_creditcard = conn.prepareStatement("DELETE FROM customer_creditcard");
			
			select_login = conn.prepareStatement("SELECT * FROM login");
			insert_login = conn.prepareStatement("INSERT INTO login(username,remote_address,remote_host,remote_port,time,success) VALUES(?,?,?,?,NOW(),?)");
			delete_customer_address = conn.prepareStatement("DELETE FROM login");
			
			select_membership = conn.prepareStatement("SELECT * FROM membership");
			select_membership_where_id = conn.prepareStatement("SELECT * FROM membership WHERE id=?");
			insert_membership = conn.prepareStatement("INSERT INTO membership(name,description,price,months) VALUES(?,?,?,?)");
			update_membership_where_id = conn.prepareStatement("UPDATE membership SET price=? WHERE id=?");
			delete_membership = conn.prepareStatement("DELETE FROM membership");
			
			select_staff_where_status = conn.prepareStatement("SELECT staff.*, user.username FROM user JOIN staff ON user.id = staff.user_id1 WHERE status=?");
			select_staff_where_status_id = conn.prepareStatement("SELECT staff.*, user.username FROM user JOIN staff ON user.id = staff.user_id1 WHERE status=? AND staff.id=?");
			insert_staff = conn.prepareStatement("INSERT INTO staff(user_id1,firstname,middlename,lastname,status,registered) VALUES(LAST_INSERT_ID(),?,?,?,?,NOW())");
			update_staff_where_id = conn.prepareStatement("UPDATE staff SET firstname=?,middlename=?,lastname=? WHERE user_id1=?");
			update_staff_status_where_id = conn.prepareStatement("UPDATE staff SET status=? WHERE id=?");
			
			select_user = conn.prepareStatement("SELECT * FROM user");
			select_user_where_username = conn.prepareStatement("SELECT * FROM user WHERE username=?");
			select_user_where_id_and_password = conn.prepareStatement("SELECT * FROM user WHERE id=? AND password=UNHEX(SHA1(?))");
			select_user_where_username_and_password = conn.prepareStatement("SELECT * FROM user WHERE username=? AND password=UNHEX(SHA1(?))");
			select_user_where_username_and_password_and_status = conn.prepareStatement("SELECT user.username, customer.* FROM user INNER JOIN customer ON user.id=customer.user_id WHERE username=? AND password=UNHEX(SHA1(?)) AND status=1");
			select_user_where_username_and_password_and_status_staff = conn.prepareStatement("SELECT user.username, staff.* FROM user INNER JOIN staff ON user.id=staff.user_id1 WHERE username=? AND password=UNHEX(SHA1(?)) AND status=1");
			select_user_staff_where_id = conn.prepareStatement("SELECT staff.*, user.username FROM user JOIN staff ON user.id=staff.user_id1 WHERE status=1 AND user_id1=?");
			insert_user = conn.prepareStatement("INSERT INTO user (role_id, username, password) VALUES(?, ?, UNHEX(SHA1(?)))");
			update_user_set_password_where_id = conn.prepareStatement("UPDATE user SET password=UNHEX(SHA1(?)) WHERE id=?");
			delete_user = conn.prepareStatement("DELETE FROM user");
			
			select_vehicle = conn.prepareStatement("SELECT * FROM vehicle");
			select_vehicle_where_status = conn.prepareStatement("SELECT * FROM vehicle WHERE status=?");
			select_vehicle_where_status_make = conn.prepareStatement("SELECT * FROM vehicle WHERE status=? AND make_id=?");
			select_vehicle_where_location = conn.prepareStatement("SELECT * FROM vehicle WHERE status=? AND location_id=?");
			select_vehicle_where_id = conn.prepareStatement("SELECT * FROM vehicle WHERE id=?");
			select_vehicle_where_status_available_location = conn.prepareStatement("SELECT * FROM vehicle WHERE status=? AND available=? AND location_id=?");
			select_vehicle_where_available_status = conn.prepareStatement("SELECT * FROM vehicle WHERE status=? AND available=?");
			select_vehicle_where_type = conn.prepareStatement("SELECT * FROM vehicle WHERE status=? AND type_id=?");
			update_vehicle_available_where_id = conn.prepareStatement("UPDATE vehicle SET available=? WHERE id=?");
			update_vehicle_status_where_id = conn.prepareStatement("UPDATE vehicle SET status=? WHERE id=?");
			update_vehicle_info_where_id = conn.prepareStatement("UPDATE vehicle SET type_id=?,location_id=?,registration=?,year=?,color=?,mileage=?,cond=? WHERE id=?");
			insert_vehicle = conn.prepareStatement("INSERT INTO vehicle(make_id,model_id,type_id,location_id,registration,year,color,service,mileage,cond,status,available) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			select_rental_where_id = conn.prepareStatement("SELECT * FROM rental WHERE id=?");
			select_rental_where_customer_id = conn.prepareStatement("SELECT * FROM rental WHERE customer_id2=?");
			insert_rental = conn.prepareStatement("INSERT INTO rental(customer_id2,vehicle_id,start_time,end_time,returned,cond,price,hour_rate,cancelled) VALUES(?,?,?,?,?,?,?,?,?)");
			update_rental_returned_where_id = conn.prepareStatement("UPDATE rental SET returned=NOW() WHERE id=?");
			update_rental_cost_where_id = conn.prepareStatement("UPDATE rental SET price=(price+?) WHERE id=?");
			update_rental_cancelled_where_id = conn.prepareStatement("UPDATE rental SET cancelled=? WHERE id=?");
			
			select_role = conn.prepareStatement("SELECT * FROM role");
			insert_role = conn.prepareStatement("INSERT INTO role(role) VALUES(?)");
			delete_role = conn.prepareStatement("DELETE FROM role");
			
			select_vehicle_location = conn.prepareStatement("SELECT * FROM vehicle_location");
			select_vehicle_location_where_id = conn.prepareStatement("SELECT * FROM vehicle_location WHERE id=?");
			select_vehicle_location_where_status = conn.prepareStatement("SELECT * FROM vehicle_location WHERE status=?");
			select_vehicle_location_where_name = conn.prepareStatement("SELECT * FROM vehicle_location WHERE name=? AND status=1");
			insert_vehicle_location = conn.prepareStatement("INSERT INTO vehicle_location(name,street1,street2,city,state,zip,capacity,status) VALUES(?,?,?,?,?,?,?,?)");
			update_vehicle_location_where_id = conn.prepareStatement("UPDATE vehicle_location SET name=?,street1=?,street2=?,city=?,state=?,zip=?,capacity=? WHERE id=?");
			update_vehicle_location_where_id_status = conn.prepareStatement("UPDATE vehicle_location SET status=? WHERE id=?");
			delete_vehicle_location = conn.prepareStatement("DELETE FROM vehicle_location");
			
			select_vehicle_make = conn.prepareStatement("SELECT * FROM vehicle_make");
			select_vehicle_make_where_id = conn.prepareStatement("SELECT * FROM vehicle_make WHERE id=?");
			select_vehicle_make_where_make = conn.prepareStatement("SELECT * FROM vehicle_make WHERE make=?");
			insert_vehicle_make = conn.prepareStatement("INSERT INTO vehicle_make(make) VALUES(?)");
			delete_vehicle_make = conn.prepareStatement("DELETE FROM vehicle_make");
			
			select_vehicle_model = conn.prepareStatement("SELECT * FROM vehicle_model");
			select_vehicle_model_where_id = conn.prepareStatement("SELECT * FROM vehicle_model WHERE id=?");
			select_vehicle_model_where_make = conn.prepareStatement("SELECT * FROM vehicle_model WHERE make_id1=?");
			select_vehicle_model_where_model = conn.prepareStatement("SELECT * FROM vehicle_model WHERE model=?");
			insert_vehicle_model = conn.prepareStatement("INSERT INTO vehicle_model(make_id1,model) VALUES(?,?)");
			delete_vehicle_model = conn.prepareStatement("DELETE FROM vehicle_model");
			
			select_vehicle_type = conn.prepareStatement("SELECT * FROM vehicle_type");
			select_vehicle_type_where_id = conn.prepareStatement("SELECT * FROM vehicle_type WHERE id=?");
			select_vehicle_type_where_status = conn.prepareStatement("SELECT * FROM vehicle_type WHERE status=?");
			select_vehicle_type_where_name = conn.prepareStatement("SELECT * FROM vehicle_type WHERE name=? AND status=1");
			insert_vehicle_type = conn.prepareStatement("INSERT INTO vehicle_type(name,hour_rate,day_rate,status) VALUES(?,?,?,?)");
			update_vehicle_type_where_id = conn.prepareStatement("UPDATE vehicle_type SET name=?,hour_rate=?,day_rate=? WHERE id=?");
			update_vehicle_type_where_id_status = conn.prepareStatement("UPDATE vehicle_type SET status=? WHERE id=?");
			delete_vehicle_type = conn.prepareStatement("DELETE FROM vehicle_type");
			
			reset = conn.prepareStatement("ALTER TABLE roles AUTO_INCREMENT = 1");
			disable_foreignkey = conn.prepareStatement("SET FOREIGN_KEY_CHECKS = 0");
			select_last_insert_id = conn.prepareStatement("select LAST_INSERT_ID()");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void closeDBconnection() {
		try {
			conn.close();
			System.out.println("<Disconnected from MySQL " + uuid + ">");
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
