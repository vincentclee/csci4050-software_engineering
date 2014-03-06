package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import objects.VehicleType;
import dao.GlobalDB;

public class vehicle_type_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public vehicle_type_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public boolean add(String name, double hour_rate, double day_rate) {
		try {
			global.openDBconnection();
			
			//Insert into database
			global.insert_vehicle_type.setString(1, name);
			global.insert_vehicle_type.setDouble(2, hour_rate);
			global.insert_vehicle_type.setDouble(3, day_rate);
			global.insert_vehicle_type.setBoolean(4, true);
			global.insert_vehicle_type.executeUpdate();
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> add_vehicle_type(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			String name = ((String[])parameterMap.get("name"))[0].trim();
			if (name.length() == 0)
				error.add("*Invalid name");
			
			double hour_rate = inputparser.parseMoney(((String[])parameterMap.get("hour_rate"))[0].trim());
			if (hour_rate <= 0.0)
				error.add("*Invalid hour rate");
			
			double day_rate = inputparser.parseMoney(((String[])parameterMap.get("day_rate"))[0].trim());
			if (day_rate <= 0.0)
				error.add("*Invalid day rate");
			else if ((hour_rate * 24) <= day_rate)
				error.add("*Day rate not less than hour_rate*24");
			
			//update database
			if (error.isEmpty()) {
				add(name, hour_rate, day_rate);
			}
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public List<VehicleType> getVehicleTypes() {
		try {
			global.openDBconnection();
			
			List<VehicleType> vehicleTypes = new ArrayList<VehicleType>();
			
			global.select_vehicle_type_where_status.setBoolean(1, true);
			
			ResultSet rs = global.select_vehicle_type_where_status.executeQuery();
			while (rs.next()) {
				int vehicles = 0;
				
				global.select_vehicle_where_type.setBoolean(1, true);
				global.select_vehicle_where_type.setInt(2, rs.getInt("id"));
				ResultSet rss = global.select_vehicle_where_type.executeQuery();
				while (rss.next()) {
					vehicles += 1;
				}
				
				vehicleTypes.add(new VehicleType(rs.getInt("id"), rs.getString("name"), rs.getDouble("hour_rate"), 
						rs.getDouble("day_rate"), vehicles));
			}
			
			return vehicleTypes;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return new ArrayList<VehicleType>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public VehicleType getVehicleType(String type_id) {
		try {
			global.openDBconnection();
			
			int type = Integer.parseInt(type_id);
			
			global.select_vehicle_type_where_id.setInt(1, type);
			
			ResultSet rs = global.select_vehicle_type_where_id.executeQuery();
			if (rs.next()) {
				int vehicles = 0;
				
				global.select_vehicle_where_type.setBoolean(1, true);
				global.select_vehicle_where_type.setInt(2, rs.getInt("id"));
				ResultSet rss = global.select_vehicle_where_type.executeQuery();
				while (rss.next()) {
					vehicles += 1;
				}
				
				return new VehicleType(rs.getInt("id"), rs.getString("name"), rs.getDouble("hour_rate"), rs.getDouble("day_rate"), vehicles);
			}
			
			return new VehicleType();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return new VehicleType();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> updateVehicleType(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			int type_id = Integer.parseInt(((String[])parameterMap.get("type_id"))[0].trim());
			
			String name = ((String[])parameterMap.get("name"))[0].trim();
			if (name.length() == 0)
				error.add("*Invalid name");
			
			double hour_rate = inputparser.parseMoney(((String[])parameterMap.get("hour_rate"))[0].trim());
			if (hour_rate <= 0.0)
				error.add("*Invalid hour rate");
			
			double day_rate = inputparser.parseMoney(((String[])parameterMap.get("day_rate"))[0].trim());
			if (day_rate <= 0.0)
				error.add("*Invalid day rate");
			else if ((hour_rate * 24) <= day_rate)
				error.add("*Day rate not less than hour_rate*24");
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_vehicle_type_where_id.setString(1, name);
				global.update_vehicle_type_where_id.setDouble(2, hour_rate);
				global.update_vehicle_type_where_id.setDouble(3, day_rate);
				global.update_vehicle_type_where_id.setInt(4, type_id);
				global.update_vehicle_type_where_id.executeUpdate();
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
	
	public List<String> removeVehicleType(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			int type_id = Integer.parseInt(((String[])parameterMap.get("type_id"))[0].trim());
			
			int vehicles = Integer.parseInt(((String[])parameterMap.get("vehicles"))[0].trim());
			if (vehicles != 0)
				error.add("*There are vehicles under this Type. Remove/Move them first.");
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_vehicle_type_where_id_status.setBoolean(1, false);
				global.update_vehicle_type_where_id_status.setInt(2, type_id);
				global.update_vehicle_type_where_id_status.executeUpdate();
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
	
	public Map<Integer, String> getVehicleTypesByID() {
		try {
			global.openDBconnection();
			
			Map<Integer, String> vehicleTypes = new HashMap<Integer, String>();
			
			global.select_vehicle_type_where_status.setBoolean(1, true);
			ResultSet rs = global.select_vehicle_type_where_status.executeQuery();
			while (rs.next()) {
				vehicleTypes.put(rs.getInt("id"), rs.getString("name"));
			}
			
			System.out.println(vehicleTypes.toString());
			
			return vehicleTypes;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new HashMap<Integer, String>();
		} finally {
			global.closeDBconnection();
		}
	}
}
