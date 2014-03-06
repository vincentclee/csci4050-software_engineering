package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.GlobalDB;

public class vehicle_make_mod {
	private GlobalDB global;
	
	public vehicle_make_mod() {
		global = new GlobalDB();
	}
	
	public boolean add(String make) {
		try {
			global.openDBconnection();
			
			//Insert into database
			global.insert_vehicle_make.setString(1, make);
			global.insert_vehicle_make.executeUpdate();
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	//
	
	public List<String> getMakes(boolean first) {
		try {
			global.openDBconnection();
			
			List<String> makes = new ArrayList<String>();
			
			if (first) makes.add("Select make");
			
			ResultSet rs = global.select_vehicle_make.executeQuery();
			while (rs.next()) {
				makes.add(rs.getString("make"));
			}
			
			
			return makes;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<String>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> getMakesOfVehicles() {
		try {
			global.openDBconnection();
			
			List<Integer> makes_id = new ArrayList<Integer>();
			List<String> makes = new ArrayList<String>();
			makes.add("Select make");
			
			
			global.select_vehicle_where_status.setBoolean(1, true);
			ResultSet rs = global.select_vehicle_where_status.executeQuery();
			while (rs.next()) {
				if (!makes_id.contains(rs.getInt("make_id")))
					makes_id.add(rs.getInt("make_id"));
			}
			
			for (int i = 0; i < makes_id.size(); i++) {
				global.select_vehicle_make_where_id.setInt(1, makes_id.get(i));
				rs = global.select_vehicle_make_where_id.executeQuery();
				if (rs.next())
					makes.add(rs.getString("make"));
			}
			
			return makes;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<String>();
		} finally {
			global.closeDBconnection();
		}
	}
	
}
