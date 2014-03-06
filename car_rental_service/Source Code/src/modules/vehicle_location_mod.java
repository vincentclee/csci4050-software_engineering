package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import objects.Location;
import dao.GlobalDB;


public class vehicle_location_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public vehicle_location_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public boolean add(String name, String street1, String street2, String city, String state, String zip, int capacity) {
		try {
			global.openDBconnection();
			
			//Insert into database
			global.insert_vehicle_location.setString(1, name);
			global.insert_vehicle_location.setString(2, street1);
			global.insert_vehicle_location.setString(3, street2);
			global.insert_vehicle_location.setString(4, city);
			global.insert_vehicle_location.setString(5, state);
			global.insert_vehicle_location.setString(6, zip);
			global.insert_vehicle_location.setInt(7, capacity);
			global.insert_vehicle_location.setBoolean(8, true);
			global.insert_vehicle_location.executeUpdate();
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> add_location(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			String name = ((String[])parameterMap.get("name"))[0].trim();
			if (name.length() == 0)
				error.add("*Invalid name");
			
			String street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(street1));
			
			String street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			String city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(city));
			
			String state = ((String[])parameterMap.get("state"))[0].trim();
			
			String zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(zip));
			
			String capacity = ((String[])parameterMap.get("capacity"))[0].trim();
			int capacity1 = 0;
			
			try {
				capacity1 = Integer.parseInt(capacity);
				if (capacity1 < 1)
					throw new Exception();
			} catch(Exception e) {
				error.add("*Invalid capacity");
			}
			
			if (error.isEmpty()) {
				add(name, street1, street2, city, state, zip, capacity1);
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<Location> getLocations() {
		try {
			global.openDBconnection();
			
			List<Location> location = new ArrayList<Location>();
			
			global.select_vehicle_location_where_status.setBoolean(1, true);
			
			ResultSet rs = global.select_vehicle_location_where_status.executeQuery();
			while (rs.next()) {
				int vehicles = 0;
				
				global.select_vehicle_where_location.setBoolean(1, true);
				global.select_vehicle_where_location.setInt(2, rs.getInt("id"));
				ResultSet rss = global.select_vehicle_where_location.executeQuery();
				while (rss.next()) {
					vehicles += 1;
				}
				
				location.add(new Location(rs.getInt("id"), rs.getString("name"), rs.getString("street1"), 
						rs.getString("street2"), rs.getString("city"), rs.getString("state"), rs.getString("zip"), 
						rs.getInt("capacity"), vehicles));
			}
			
			return location;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Location>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Location getLocation(String location) {
		try {
			global.openDBconnection();
			
			int location_id = Integer.parseInt(location);
			
			global.select_vehicle_location_where_id.setInt(1, location_id);
			
			ResultSet rs = global.select_vehicle_location_where_id.executeQuery();
			if (rs.next()) {
				int vehicles = 0;
				
				global.select_vehicle_where_location.setBoolean(1, true);
				global.select_vehicle_where_location.setInt(2, rs.getInt("id"));
				ResultSet rss = global.select_vehicle_where_location.executeQuery();
				while (rss.next()) {
					vehicles += 1;
				}
				
				return new Location(rs.getInt("id"), rs.getString("name"), rs.getString("street1"), 
						rs.getString("street2"), rs.getString("city"), rs.getString("state"), rs.getString("zip"), 
						rs.getInt("capacity"), vehicles);
			}
			
			return new Location();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Location();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> updateLocation(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			int location_id = Integer.parseInt(((String[])parameterMap.get("location_id"))[0].trim());
			
			String name = ((String[])parameterMap.get("name"))[0].trim();
			if (name.length() == 0)
				error.add("*Invalid name");
			
			String street1 = ((String[])parameterMap.get("street1"))[0].trim();
			error.addAll(inputparser.parse_street1(street1));
			
			String street2 = ((String[])parameterMap.get("street2"))[0].trim();
			
			String city = ((String[])parameterMap.get("city"))[0].trim();
			error.addAll(inputparser.parse_city(city));
			
			String state = ((String[])parameterMap.get("state"))[0].trim();
			
			String zip = ((String[])parameterMap.get("zip"))[0].trim();
			error.addAll(inputparser.parse_zip(zip));
			
			String capacity = ((String[])parameterMap.get("capacity"))[0].trim();
			int capacity1 = 0;
			
			try {
				capacity1 = Integer.parseInt(capacity);
				if (capacity1 < 1)
					throw new Exception();
			} catch(Exception e) {
				error.add("*Invalid capacity");
			}
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_vehicle_location_where_id.setString(1, name);
				global.update_vehicle_location_where_id.setString(2, street1);
				global.update_vehicle_location_where_id.setString(3, street2);
				global.update_vehicle_location_where_id.setString(4, city);
				global.update_vehicle_location_where_id.setString(5, state);
				global.update_vehicle_location_where_id.setString(6, zip);
				global.update_vehicle_location_where_id.setInt(7, capacity1);
				global.update_vehicle_location_where_id.setInt(8, location_id);
				global.update_vehicle_location_where_id.executeUpdate();
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
	
	public List<String> removeLocation(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			int location_id = Integer.parseInt(((String[])parameterMap.get("location_id"))[0].trim());
			
			int vehicles = Integer.parseInt(((String[])parameterMap.get("vehicles"))[0].trim());
			if (vehicles != 0)
				error.add("*There are vehicles at this Location. Remove/Move them first.");
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_vehicle_location_where_id_status.setBoolean(1, false);
				global.update_vehicle_location_where_id_status.setInt(2, location_id);
				global.update_vehicle_location_where_id_status.executeUpdate();
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
	
	public Map<Integer, String> getVehicleLocationsWithAvailableCars() {
		try {
			global.openDBconnection();
			
			Map<Integer, String> locations = new HashMap<Integer, String>();
			List<Integer> location_keys = new ArrayList<Integer>();
			locations.put(0, "Select Location");
			
			global.select_vehicle_where_available_status.setBoolean(1, true);
			global.select_vehicle_where_available_status.setBoolean(2, true);
			ResultSet rs = global.select_vehicle_where_available_status.executeQuery();
			while (rs.next()) {
				if (!location_keys.contains(rs.getInt("location_id")))
					location_keys.add(rs.getInt("location_id"));
			}
			
//			System.out.println(location_keys.toString());
			Collections.sort(location_keys);
//			System.out.println(location_keys.toString());
			
			for (int i : location_keys) {
				global.select_vehicle_location_where_id.setInt(1, i);
				rs = global.select_vehicle_location_where_id.executeQuery();
				if (rs.next()) {
					locations.put(i, rs.getString("street1") + " (" + rs.getString("name") + ")");
				}
			}
			
			
			
			return locations;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			Map<Integer, String> error = new HashMap<Integer, String>();
			error.put(0, "Select Location");
			return error;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public String getVehicleLocationName(String id) {
		try {
			global.openDBconnection();
			
			int location_id = Integer.parseInt(id);
			
			global.select_vehicle_location_where_id.setInt(1, location_id);
			ResultSet rs = global.select_vehicle_location_where_id.executeQuery();
			if (rs.next()) {
				return (rs.getString("street1") + " (" + rs.getString("name") + ")");
			}
			
			return "";
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return "";
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Map<Integer, String> getVehicleLocationsByID() {
		try {
			global.openDBconnection();
			
			Map<Integer, String> locations = new HashMap<Integer, String>();
			
			global.select_vehicle_location_where_status.setBoolean(1, true);
			ResultSet rs = global.select_vehicle_location_where_status.executeQuery();
			while (rs.next()) {
				locations.put(rs.getInt("id"), rs.getString("name"));
			}
			
			return locations;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new HashMap<Integer, String>();
		} finally {
			global.closeDBconnection();
		}
	}
}
