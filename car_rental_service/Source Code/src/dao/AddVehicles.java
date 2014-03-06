package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import objects.Vehicle;
import servlets.VehicleServlet;

import com.mysql.jdbc.Statement;

public class AddVehicles {
	
	private Boolean added = false;
	PreparedStatement idTable, insertVehicle;
	
	public AddVehicles(Vehicle newCar){
		
		Statement stmt;
		Connection conn;
		
		
		String make = newCar.getMake();
		String model = newCar.getModel(); 
		//String vecType = newCar.getVehicleType();
		String loc = newCar.getLocation();
		
		//Stores ID's of Make, Model, VechicleType, Location
		int make_id, model_id, vecType_id, loc_id;
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
			System.out.println("Adding Vehicle");
			
			stmt = (Statement) conn.createStatement();
			//Creates Table of ID's
//			idTable = conn.prepareStatement("SELECT (SELECT id FROM vehicle_make WHERE make = '"+make+"') as makeID,"
//									   + "(SELECT make_id1 FROM vehicle_model WHERE model = '"+model+"' ) as modelID,"
//									   + "(SELECT id FROM vehicle_type WHERE name = '"+vecType+"') as vehicleTypeID,"
//									   + "(SELECT id FROM vehicle_location WHERE city = '"+loc+"') as locationID;");
			PreparedStatement disable_foreignkey = conn.prepareStatement("SET FOREIGN_KEY_CHECKS = 0");
			
			disable_foreignkey.execute();
			
			idTable = conn.prepareStatement("SELECT (SELECT id FROM vehicle_make WHERE make = ?) as makeID,"
					   + "(SELECT make_id1 FROM vehicle_model WHERE model = ?) as modelID,"
					   + "(SELECT id FROM vehicle_type WHERE name = ?) as vehicleTypeID,"
					   + "(SELECT id FROM vehicle_location WHERE city = ?) as locationID;");
			
			//Insertion Query for Vechile Records
			String insert = "INSERT INTO vehicle (make_id, model_id, vehicle_type, location_id, "
					       + "registration, year, color, serviceDate, mileage,`condition`) "
					        + "values(?, ?, ?, ?, ?, ?, ?, NOW(), ?, ?)";
			
			System.out.println(insert);
			insertVehicle = conn.prepareStatement(insert);
			
			idTable.setString(1, make);
			idTable.setString(2, model);
//			idTable.setString(3, vecType);
			idTable.setString(4, loc);
			//Note: Need to Create Make Model ID Check
			ResultSet rs = idTable.executeQuery();
			while(rs.next()){
				make_id = rs.getInt(1);
				model_id = rs.getInt(2);
				vecType_id = rs.getInt(3);
				loc_id = rs.getInt(4);
			
				//Inserts Vehicle into Database
				insertRecord(insertVehicle,newCar,make_id, model_id, vecType_id, loc_id);	
				
			}
			
			System.out.println("You have Sucessfully Added a New Vehicle");
			setRecStatus(true); //Sets added status to true
			rs.close();
		    stmt.close();
		    conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//Converts Vehicle Object into String to be Stored in the Database
	public void insertRecord(PreparedStatement temp, Vehicle car, int tempMakeId, int tempModelId,int tempVecType, int tempVecLoc) throws SQLException{
		
		//Inserts Values into Table using Prepared Statements
		
		temp.setInt(1, tempMakeId);
		temp.setInt(2, tempModelId);
		temp.setInt(3, tempVecType);
	    temp.setInt(4, tempVecLoc);
//	    temp.setString(5, car.getRegTag());
	    temp.setInt(6, car.getYear());
	    temp.setString(7, car.getColor());
		//temp.setTimestamp(8, getCurrentTimeStamp());
		temp.setInt(8, car.getMileage());
//		temp.setString(9, car.getCondition());
	    temp.executeUpdate();
	}
	
	public void setRecStatus (boolean success){
		this.added = success;
	}
	
	public Boolean getRecStatus(){
		return added;
	}
	
	private static java.sql.Timestamp getCurrentTimeStamp() {
		 
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	 
	}
}
