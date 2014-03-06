package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-12
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.GlobalDB;
import objects.Membership;
import objects.Metadata;

public class membership_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public membership_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public void add(String name, String description, double price, int months) {
		try {
			global.openDBconnection();
			
			global.insert_membership.setString(1, name);
			global.insert_membership.setString(2, description);
			global.insert_membership.setDouble(3, price);
			global.insert_membership.setInt(4, months);
			global.insert_membership.executeUpdate();
			
		} catch(Exception e) {
			System.err.println(e.getMessage());
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Membership> get() {
		try {
			global.openDBconnection();
			
			List<Membership> memberships = new ArrayList<Membership>();
			
			ResultSet rs = global.select_membership.executeQuery();
			while (rs.next()) {
				memberships.add(new Membership(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getInt("months")));
			}
			
			return memberships;
		} catch(Exception e) {
			return new ArrayList<Membership>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Membership getFirst() {
		try {
			global.openDBconnection();
			
			Membership membership = new Membership();
			
			ResultSet rs = global.select_membership.executeQuery();
			if (rs.next()) {
				membership = new Membership(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getInt("months"));
			}
			
			return membership;
		} catch(Exception e) {
			return new Membership();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> updateFirst(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			String price = ((String[])parameterMap.get("membership_price"))[0].trim();
			
			double amount = inputparser.parseMoney(price);
			
			if (amount <= 0.0)
				error.add("*Invalid amount");
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_membership_where_id.setDouble(1, amount);
				global.update_membership_where_id.setInt(2, 1);
				global.update_membership_where_id.executeUpdate();
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
	
	public boolean upgrade(Metadata user) {
		try {
			global.openDBconnection();
			
			int renew = 0;
			double membership_price = 0;
			
			global.select_customer_where_id.setInt(1, user.getCustomer_id());
			ResultSet rs = global.select_customer_where_id.executeQuery();
			if (rs.next())
				renew = rs.getInt("membership_id");
			
			
			global.select_membership_where_id.setInt(1, 1);
			rs = global.select_membership_where_id.executeQuery();
			if (rs.next())
				membership_price = rs.getDouble("price");
			
			if (renew == 0) {
				global.update_customer_where_id_and_membership.setInt(1, 1);
				global.update_customer_where_id_and_membership.setInt(2, 6);
				global.update_customer_where_id_and_membership.setDouble(3, membership_price);
				global.update_customer_where_id_and_membership.setInt(4, user.getCustomer_id());
				global.update_customer_where_id_and_membership.executeUpdate();
			} else {
				global.update_customer_where_id_and_membership1.setInt(1, 1);
				global.update_customer_where_id_and_membership1.setInt(2, 6);
				global.update_customer_where_id_and_membership1.setDouble(3, membership_price);
				global.update_customer_where_id_and_membership1.setInt(4, user.getCustomer_id());
				global.update_customer_where_id_and_membership1.executeUpdate();
			}
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
}