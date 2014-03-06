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

public class vehicle_model_mod {
	private GlobalDB global;
	
	public vehicle_model_mod() {
		global = new GlobalDB();
	}
	
	public boolean add(String make, String model) {
		try {
			global.openDBconnection();
			
			//Find vehicle make
			global.select_vehicle_make_where_make.setString(1, make);
			
			//Insert into database
			ResultSet rs = global.select_vehicle_make_where_make.executeQuery();
			if (rs.next()) {
				global.insert_vehicle_model.setInt(1, rs.getInt(1));
				global.insert_vehicle_model.setString(2, model);
				global.insert_vehicle_model.executeUpdate();
			} else
				return false;
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	//
	
	public List<String> getModels(String make) {
		try {
			global.openDBconnection();
			
			List<String> models = new ArrayList<String>();
			int make_id = 0;
			
			global.select_vehicle_make_where_make.setString(1, make);
			ResultSet rs = global.select_vehicle_make_where_make.executeQuery();
			if (rs.next()) {
				make_id = rs.getInt("id");
			}
			
			global.select_vehicle_model_where_make.setInt(1, make_id);
			rs = global.select_vehicle_model_where_make.executeQuery();
			while (rs.next()) {
				models.add(rs.getString("model"));
			}
			
			return models;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<String>();
		} finally {
			global.closeDBconnection();
		}
	}
}
