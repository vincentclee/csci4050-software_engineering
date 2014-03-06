package modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import dao.GlobalDB;
import objects.TempVehicle;

public class vehicle_temp {

	private int zip, capacity, year, mileage, vecID, locID;
	private String regTag, serviceDate, condition, color,make, model, vehicleType;
	private double hourlyRate, dailyRate;
	private String locName, str1, str2, city, state;
	
	PreparedStatement insert_make, insert_model, insert_year, insert_type, insert_color,
	insert_regTag, insert_hourRate, insert_dayRate, insert_mileage, insert_servDate, insert_condition,
	insert_location, insertTo_makeTable, insertTo_modelTable, insertTo_modelTableTwo, insertTo_typeTable, insertTo_locationTable;

	PreparedStatement  getMake_ID, getModel_ID, getType_ID, getLocation_ID;
	Connection conn;

	Integer[] vecIDs = new Integer[4];
	
	//Place ModifyVec vecRec Later
 public vehicle_temp(TempVehicle vecRec){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
			
			//Sets all Values to be passed into record Updates
			unpackModifyInfo(vecRec);
			
			//Updates Records
			//updateVehicle(make, model, vehicleType, hourlyRate, dailyRate, regTag, year, color, serviceDate,
					//mileage, condition);

			
			//Vehicle record Updates
			insert_make = conn.prepareStatement("UPDATE vehicle SET make_id = ?  WHERE vehicle.id="+vecID+";");
			insert_model = conn.prepareStatement("UPDATE vehicle SET model_id = ?  WHERE vehicle.id="+vecID+";");
			insert_year = conn.prepareStatement("UPDATE vehicle SET year = ? WHERE vehicle.id="+vecID+"");
			insert_type= conn.prepareStatement("UPDATE vehicle SET vehicle_type = ? WHERE vehicle.id="+vecID+";");
			
			insert_location = conn.prepareStatement("UPDATE vehicle SET location_id = ? WHERE vehicle.id="+vecID+";");
			insert_color = conn.prepareStatement("UPDATE vehicle SET color = ? WHERE vehicle.id="+vecID+";");
			insert_regTag = conn.prepareStatement("UPDATE vehicle SET registration = ? WHERE vehicle.id="+vecID+";");
			insert_mileage = conn.prepareStatement("UPDATE vehicle SET mileage = ? WHERE vehicle.id="+vecID+";");
			insert_servDate = conn.prepareStatement("UPDATE vehicle SET serviceDate = ? WHERE vehicle.id="+vecID+";");
			insert_condition = conn.prepareStatement("UPDATE vehicle SET `condition` = ? WHERE vehicle.id="+vecID+";");
			
			//Vehicle Foreign Key Inserts
			insertTo_makeTable = conn.prepareStatement("INSERT INTO `youdrive`.`vehicle_make` (`make`) VALUES (?);");
			insertTo_modelTable = conn.prepareStatement("INSERT INTO vehicle_model (model, make_Id1) VALUES (?, ?)");
			insertTo_typeTable = conn.prepareStatement("INSERT INTO vehicle_type (`name`, hour_rate, day_rate) VALUES (?,?,?)");
			insertTo_locationTable = conn.prepareStatement("INSERT INTO vehicle_location (`name`, street1, street2, city, state) VALUES (?,?,?,?,?)");
			
			getMake_ID = conn.prepareStatement("SELECT id FROM vehicle_make WHERE make = ?;");
			getModel_ID = conn.prepareStatement("SELECT id FROM vehicle_model WHERE model =?;");
			getType_ID = conn.prepareStatement("SELECT id FROM vehicle_type WHERE name = ?;");
			getLocation_ID = conn.prepareStatement("SELECT id FROM vehicle_location WHERE name = ?;");
			
			
			
		} catch(Exception e) {
			
		}
		
	}
	
//updates Vehicles	

public void updateVehicle(String make, String model, String type, double hourRate, double dayRate,
	String regTag, int year, String color, String servDate, int mileage, String condition, String lName, String lStr1
	,String lStr2, String lCity, String lState) throws SQLException{
		
				int tempMake, tempModel, tempType, tempLoc;
				ResultSet rs;
				
				System.out.println(make);
				getMake_ID.setString(1, make);
				rs = getMake_ID.executeQuery();
				if(isBlank(make)){
					while(rs.next()){
						tempMake = rs.getInt("make");
						updateVecMake(tempMake, insertTo_makeTable, rs, make);
						tempMake = rs.getInt("make");
						System.out.println(tempMake);
					}
				}
		
				
				
				/*
				//Update Model Table
			
				while(rs.next()){
					if(isBlank(model)){
						tempMake = rs.getInt("make");
						tempModel = rs.getInt("model");
						updateVecModel(tempModel, tempMake, insertTo_modelTable, rs, model);
					}
				}
		
		
				//Updates Type Table
		
				while(rs.next()){
					tempType = rs.getInt("type");
					if(isBlank(type) && hourRate >= 0 && dayRate >= 0){
						updateVecType(tempType, insertTo_typeTable, rs, type, hourRate, dayRate);
					}
				}
				
				while(rs.next()){
					tempMake = rs.getInt("make");
					tempModel = rs.getInt("model");
					tempType = rs.getInt("type");
					
					vecIDs[0] = tempMake;
					vecIDs[1] = tempModel;
					vecIDs[2] = tempType;
				
 				}

	
		ResultSet rs2;
		
		//Location Insertions
	    
	    	
	    		System.out.println(lName);
	    		getLocation_ID.setString(1, lName);
				rs2 = getLocation_ID.executeQuery();
				while(rs2.next()){
					
					tempLoc = rs2.getInt("id");
					System.out.println(tempLoc);
					updateVecLoc(tempLoc, insertTo_locationTable, rs2, lName, lStr1, lStr2, lCity, lState);
			
				}
				
				System.out.println("Location Loops");
				rs2 = getLocation_ID.executeQuery();
				while(rs2.next()){
					
					tempLoc = rs2.getInt("location");
					vecIDs[3] = tempLoc;
 				}
				
			
				*/
				
		System.out.println("Location ID created: " + vecIDs[3]);
		
			//Updates Vehicle Record Based on values
		updateVehicleRec(regTag, year, color, servDate, mileage, condition);
		
		conn.close();
	
	}

//Updates a vehicle component 

public boolean updateVecMake(int value, PreparedStatement stmtTemp,  ResultSet rsTemp, String sVal){
		
		//Update New Components
		if(value == 0){
			try {
				stmtTemp.setString(1, sVal);
				stmtTemp.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
		 
	  //Retrived Old componenet
	   return false;
}//ENDOFMETHOD
	
//Updates a vehicle component 
public boolean updateVecModel(int value1,int value2, PreparedStatement stmtTemp,  ResultSet rsTemp, String sVal){
			//Update New Components
			if(value1 == 0){
				try {
					stmtTemp.setString(1, sVal);
					stmtTemp.setInt(2, value2);
					stmtTemp.executeUpdate();
					return true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   }
		  //Retrived Old componenet
		   return false;
}//ENDOFMETHOD
			
//Updates a vehicle component 
public boolean updateVecType(int value, PreparedStatement stmtTemp,  ResultSet rsTemp, String sVal1, double sVal2,
		double sVal3){				
				//Update New Components
				if(value == 0){
					try {
						
						stmtTemp.setString(1, sVal1);
						stmtTemp.setDouble(2, sVal2);
						stmtTemp.setDouble(3, sVal3);
						stmtTemp.executeUpdate();
						return true;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
			  //Retrived Old componenet
			   return false;
}//ENDOFMETHOD


public boolean updateVecLoc(int value, PreparedStatement stmtTemp,  ResultSet rsTemp, String sVal1, String sVal2,
		String sVal3, String sVal4, String sVal5){				
				//Update New Components
				if(value == 0){
					try {
						System.out.println("Location Values");
						System.out.println(sVal1);
						System.out.println(sVal2);
						System.out.println(sVal3);
						System.out.println(sVal4);
						System.out.println(sVal5);
						stmtTemp.setString(1, sVal1);
						stmtTemp.setString(2, sVal2);
						stmtTemp.setString(3, sVal3);
						stmtTemp.setString(4, sVal4);
						stmtTemp.setString(5, sVal5);
						stmtTemp.executeUpdate();
						return true;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
				
				System.out.println("Inside Insert Location");
			  //Retrived Old componenet
			   return false;
}//ENDOFMETHOD






//Updates Vehicle

public void updateVehicleRec(String regTag, int year, String color, String servDate, int mileage, String condition) throws SQLException{
	
	
	
	
	ResultSet rs;

	
	if(vecIDs[0] != null){
		insert_make.setInt(1, vecIDs[0]);
		insert_make.executeUpdate();
	}

	if( vecIDs[1] != null){
		insert_model.setInt(1, vecIDs[1]);
		insert_model.executeUpdate();
	}
	
	if(vecIDs[2] != null){
			insert_type.setInt(1, vecIDs[2]);
			insert_type.executeUpdate();
	
	}
	
	if(vecIDs[3] != null){
			insert_location.setInt(1, vecIDs[3]);
			insert_type.executeUpdate();
	}
	
	
	if(isBlank(regTag)){
		insert_regTag.setString(1, regTag);
		insert_regTag.executeUpdate();
	}
	

	
	if(year >= 0){
		insert_year.setInt(1, year);
		insert_year.executeUpdate();
	}
	
	if(isBlank(color)){
		insert_color.setString(1, color);
		insert_color.executeUpdate();
	}
	
	System.out.println(servDate);
	if(isBlank(servDate)){
			insert_servDate.setString(1, servDate);
			insert_servDate.executeUpdate();
	}
	

	if(mileage >= 0){
		insert_mileage.setInt(1, mileage);
		insert_mileage.executeUpdate();
	}
	
	System.out.println("Condition: " +condition);
	if(isBlank(condition)){
			insert_condition.setString(1, condition);
			insert_condition.executeUpdate();
	}
}//ENDOFMETHOD

public boolean isBlank(String value){
	if(value.trim().length() != 0){
		return true;
	}else{
		return false;
	}
}

public void unpackModifyInfo(TempVehicle temp){
	this.vecID = temp.getVecID();
	this.make = temp.getMake();
	this.model = temp.getModel();
	this.vehicleType = temp.getModel();
	this.locID = temp.getLocID();
	this.year = temp.getYear();
	this.regTag = temp.getRegTag();
	this.color = temp.getColor();
	this.serviceDate = temp.getServiceDate();
	this.condition = temp.getCondition();
	this.mileage = temp.getMileage();
	this.hourlyRate = temp.getHourlyRate();
	this.dailyRate = temp.getDailyRate();
	this.locName = temp.getLocName();
	this.str1 = temp.getStr1();
	this.str2 = temp.getStr2();
	this.city = temp.getCity();
	this.state = temp.getState();
	this.zip = temp.getZip();
	this.capacity = temp.getCapacity();
	
}
}//ENDOFCLASS

	