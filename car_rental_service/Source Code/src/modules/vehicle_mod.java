package modules;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import objects.Vehicle;
import dao.GlobalDB;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-22
 */

public class vehicle_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public vehicle_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public List<String> add_vehicle(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			String make = ((String[])parameterMap.get("make"))[0].trim();
			String model = ((String[])parameterMap.get("model"))[0].trim();
			String type = ((String[])parameterMap.get("type"))[0].trim();
			String location = ((String[])parameterMap.get("location"))[0].trim();
			
			String tag = ((String[])parameterMap.get("tag"))[0].trim();
			if (tag.length() == 0)
				error.add("*Invalid TAG");
			
			
			int year = 0;
			try {
				year = Integer.parseInt(((String[])parameterMap.get("year1"))[0].trim());
			} catch(Exception e) {
				error.add("*Invalid year");
			}
			
			String color = ((String[])parameterMap.get("color"))[0].trim();
			
			//service
			String expdateStr = "";
			expdateStr += ((String[])parameterMap.get("year"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("month"))[0];
			expdateStr += "-";
			expdateStr += ((String[])parameterMap.get("day"))[0];
			Date service = Date.valueOf(expdateStr);
			if (!inputparser.parse_date(expdateStr))
				error.add("*Invalid service date");
			
			
			int mileage = 0;
			try {
				mileage = Integer.parseInt(((String[])parameterMap.get("mileage"))[0].trim());
				if (mileage < 1)
					throw new Exception();
			} catch(Exception e) {
				error.add("*Invalid mileage");
			}
			
			String condition = ((String[])parameterMap.get("condition"))[0].trim();
			
			//update database
			if (error.isEmpty()) {
				//le(make_id,model_id,vehicle_type,location_id,registration,year,color,service,mileage,condition,status)
				
				global.openDBconnection();
				
				int make_id = 0;
				int model_id = 0;
				int type_id = 0;
				int location_id = 0;
				
				global.select_vehicle_make_where_make.setString(1, make);
				ResultSet rs = global.select_vehicle_make_where_make.executeQuery();
				if (rs.next())
					make_id = rs.getInt("id");
				
				global.select_vehicle_model_where_model.setString(1, model);
				rs = global.select_vehicle_model_where_model.executeQuery();
				if (rs.next())
					model_id = rs.getInt("id");
				
				global.select_vehicle_type_where_name.setString(1, type);
				rs = global.select_vehicle_type_where_name.executeQuery();
				if (rs.next())
					type_id = rs.getInt("id");
				
				global.select_vehicle_location_where_name.setString(1, location);
				rs = global.select_vehicle_location_where_name.executeQuery();
				if (rs.next())
					location_id = rs.getInt("id");
				
				global.insert_vehicle.setInt(1, make_id);
				global.insert_vehicle.setInt(2, model_id);
				global.insert_vehicle.setInt(3, type_id);
				global.insert_vehicle.setInt(4, location_id);
				
				global.insert_vehicle.setString(5, tag);
				global.insert_vehicle.setInt(6, year);
				global.insert_vehicle.setString(7, color);
				global.insert_vehicle.setDate(8, service);
				global.insert_vehicle.setInt(9, mileage);
				global.insert_vehicle.setString(10, condition);
				global.insert_vehicle.setBoolean(11, true);
				global.insert_vehicle.setBoolean(12, true);
				global.insert_vehicle.executeUpdate();
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
	
	public List<Vehicle> getAllVehicles() {
		try {
			global.openDBconnection();
			
			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			
			global.select_vehicle_where_status.setBoolean(1, true);
			ResultSet rs = global.select_vehicle_where_status.executeQuery();
			while (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				String location = "";
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next())
					type = rss.getString("name");
				
				global.select_vehicle_location_where_id.setInt(1, rs.getInt("location_id"));
				rss = global.select_vehicle_location_where_id.executeQuery();
				if (rss.next())
					location = rss.getString("name");
				
				

				
				vehicles.add(new Vehicle(rs.getInt("id"), rs.getInt("make_id"), make, rs.getInt("model_id"), model, rs.getInt("type_id"), type, rs.getInt("location_id"), location, rs.getString("registration"), rs.getInt("year"), rs.getString("color"), rs.getDate("service"), rs.getInt("mileage"), rs.getString("cond")));
			}
			
			
			
			return vehicles;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Vehicle>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	
	public Vehicle getVehicle(String vehicle) {
		try {
			global.openDBconnection();
			
			int vehicle_id = Integer.parseInt(vehicle);
			
			global.select_vehicle_where_id.setInt(1, vehicle_id);
			ResultSet rs = global.select_vehicle_where_id.executeQuery();
			if (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				double hour_rate = 0.0;
				double day_rate = 0.0;
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next()) {
					type = rss.getString("name");
					hour_rate = rss.getDouble("hour_rate");
					day_rate = rss.getDouble("day_rate");
				}
				
				return new Vehicle(rs.getInt("id"), make, model, type, rs.getInt("year"), rs.getString("color"), hour_rate, day_rate);
			}
			
			
			
			return new Vehicle();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Vehicle();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Vehicle> getVehiclesAtLocation(String location) {
		try {
			global.openDBconnection();
			
			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			
			int location_id = Integer.parseInt(location);
			
			global.select_vehicle_where_location.setBoolean(1, true);
			global.select_vehicle_where_location.setInt(2, location_id);
			ResultSet rs = global.select_vehicle_where_location.executeQuery();
			while (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				double hour_rate = 0.0;
				double day_rate = 0.0;
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next()) {
					type = rss.getString("name");
					hour_rate = rss.getDouble("hour_rate");
					day_rate = rss.getDouble("day_rate");
				}
				
				vehicles.add(new Vehicle(rs.getInt("id"), make, model, type, rs.getInt("year"), rs.getString("color"), hour_rate, day_rate));
			}
			
			
			return vehicles;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Vehicle>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Vehicle> getVehiclesAtLocationAvailable(String locationID) {
		try {
			global.openDBconnection();
			
			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			
			int location_id = Integer.parseInt(locationID);
			
			global.select_vehicle_where_status_available_location.setBoolean(1, true);
			global.select_vehicle_where_status_available_location.setBoolean(2, true);
			global.select_vehicle_where_status_available_location.setInt(3, location_id);
			ResultSet rs = global.select_vehicle_where_status_available_location.executeQuery();
			while (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				double hour_rate = 0.0;
				double day_rate = 0.0;
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next()) {
					type = rss.getString("name");
					hour_rate = rss.getDouble("hour_rate");
					day_rate = rss.getDouble("day_rate");
				}
				
				vehicles.add(new Vehicle(rs.getInt("id"), make, model, type, rs.getInt("year"), rs.getString("color"), hour_rate, day_rate));
			}
			
			
			return vehicles;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Vehicle>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Vehicle> getVehiclesFromMake(String makeName) {
		try {
			global.openDBconnection();
			
			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			
			int make_id = 0;
			global.select_vehicle_make_where_make.setString(1, makeName);
			ResultSet rs = global.select_vehicle_make_where_make.executeQuery();
			if (rs.next())
				make_id = rs.getInt("id");
			
			global.select_vehicle_where_status_make.setBoolean(1, true);
			global.select_vehicle_where_status_make.setInt(2, make_id);
			rs = global.select_vehicle_where_status_make.executeQuery();
			while (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				String location = "";
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next())
					type = rss.getString("name");
				
				global.select_vehicle_location_where_id.setInt(1, rs.getInt("location_id"));
				rss = global.select_vehicle_location_where_id.executeQuery();
				if (rss.next())
					location = rss.getString("name");
				
				

				
				vehicles.add(new Vehicle(rs.getInt("id"), rs.getInt("make_id"), make, rs.getInt("model_id"), model, rs.getInt("type_id"), type, rs.getInt("location_id"), location, rs.getString("registration"), rs.getInt("year"), rs.getString("color"), rs.getDate("service"), rs.getInt("mileage"), rs.getString("cond")));
			}
			
			
			
			return vehicles;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Vehicle>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public Vehicle getDetailedVehicle(String vehicle) {
		try {
			global.openDBconnection();
			
			int vehicle_id = Integer.parseInt(vehicle);
			
			global.select_vehicle_where_id.setInt(1, vehicle_id);
			ResultSet rs = global.select_vehicle_where_id.executeQuery();
			while (rs.next()) {
				
				String make = "";
				String model = "";
				String type = "";
				String location = "";
				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				ResultSet rss = global.select_vehicle_make_where_id.executeQuery();
				if (rss.next())
					make = rss.getString("make");
				
				global.select_vehicle_model_where_id.setInt(1, rs.getInt("model_id"));
				rss = global.select_vehicle_model_where_id.executeQuery();
				if (rss.next())
					model = rss.getString("model");
				
				global.select_vehicle_type_where_id.setInt(1, rs.getInt("type_id"));
				rss = global.select_vehicle_type_where_id.executeQuery();
				if (rss.next())
					type = rss.getString("name");
				
				global.select_vehicle_location_where_id.setInt(1, rs.getInt("location_id"));
				rss = global.select_vehicle_location_where_id.executeQuery();
				if (rss.next())
					location = rss.getString("name");
				
				

				
				return new Vehicle(rs.getInt("id"), rs.getInt("make_id"), make, rs.getInt("model_id"), model, rs.getInt("type_id"), type, rs.getInt("location_id"), location, rs.getString("registration"), rs.getInt("year"), rs.getString("color"), rs.getDate("service"), rs.getInt("mileage"), rs.getString("cond"));
			}
			
			
			
			return new Vehicle();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Vehicle();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<String> updateVehicle(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			String vehicle = ((String[])parameterMap.get("vehicle_id"))[0].trim();
			
			String type = ((String[])parameterMap.get("type"))[0].trim();
			String location = ((String[])parameterMap.get("location"))[0].trim();
			
			int type_id = Integer.parseInt(type);
			int location_id = Integer.parseInt(location);
			int vehicle_id = Integer.parseInt(vehicle);
			
			String tag = ((String[])parameterMap.get("tag"))[0].trim();
			if (tag.length() == 0)
				error.add("*Invalid TAG");
			
			
			int year = 0;
			try {
				year = Integer.parseInt(((String[])parameterMap.get("year"))[0].trim());
			} catch(Exception e) {
				error.add("*Invalid year");
			}
			
			String color = ((String[])parameterMap.get("color"))[0].trim();
			if (color.length() == 0)
				error.add("*Invalid color");
			
			int mileage = 0;
			try {
				mileage = Integer.parseInt(((String[])parameterMap.get("mileage"))[0].trim());
				if (mileage < 1)
					throw new Exception();
			} catch(Exception e) {
				error.add("*Invalid mileage");
			}
			
			String condition = ((String[])parameterMap.get("condition"))[0].trim();
			
			//update database
			if (error.isEmpty()) {
				global.openDBconnection();
				
				global.update_vehicle_info_where_id.setInt(1, type_id);
				global.update_vehicle_info_where_id.setInt(2, location_id);
				global.update_vehicle_info_where_id.setString(3, tag);
				global.update_vehicle_info_where_id.setInt(4, year);
				global.update_vehicle_info_where_id.setString(5, color);
				global.update_vehicle_info_where_id.setInt(6, mileage);
				global.update_vehicle_info_where_id.setString(7, condition);
				global.update_vehicle_info_where_id.setInt(8, vehicle_id);
				global.update_vehicle_info_where_id.executeUpdate();
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
	
	public boolean removeVehicle(String vehicle) {
		try {
			global.openDBconnection();
			
			int vehicle_id = Integer.parseInt(vehicle);
			
			global.update_vehicle_status_where_id.setBoolean(1, false);
			global.update_vehicle_status_where_id.setInt(2, vehicle_id);
			global.update_vehicle_status_where_id.executeUpdate();
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
}
