package dao;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import objects.*;
import test.*;
import servlets.*;

public class ListVehicles {
	    
		PreparedStatement locationIds, listVehicles;
		int locID;
		ArrayList<Vehicle> list = new ArrayList();
		ArrayList<Integer> locIDlist = new ArrayList<Integer>();
		
		//Variables used for retrieving vehicles
		String make, model, type;
		double hourCost, dayCost;
	    int curLoc;
	    
		
		public ListVehicles(String city, String state){
			
			
			
			
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
				Statement stmt = (Statement) conn.createStatement();
				
				//Creates List of Location ID's
				locationIds = conn.prepareStatement("SELECT id FROM vehicle_location WHERE city = ? AND state= ?;");
				locationIds.setString(1, city);
				locationIds.setString(2, state);
				ResultSet rs = locationIds.executeQuery();
				while(rs.next()){
					int tempId = rs.getInt("id");
					locIDlist.add(tempId);
				}
				
				listVehicles = conn.prepareStatement("SELECT make, model, name, hour_rate, day_rate FROM vehicle"
	                                                +" JOIN vehicle_make"
	                                                	+ " ON vehicle.make_id = vehicle_make.id" 
	                                                +" JOIN vehicle_model"
	                                                	+ " ON vehicle.model_id = vehicle_model.id"
                                                    +" JOIN vehicle_type"
                                                    	+ " ON vehicle.vehicle_type = vehicle_type.id" 
                                                    +" WHERE location_id = ?;");
				
				
				
				
			    
			    ResultSet rs2;
			    
			    for(int i = 0; i < locIDlist.size(); i++){
			    	curLoc = locIDlist.get(i);
			    	listVehicles.setInt(1, curLoc);
			    	rs2 = listVehicles.executeQuery();
			    	
			    	
			    	while(rs2.next()){
			    	
			    		make = rs2.getString("make");
			    		model = rs2.getString("model");
			    		type = rs2.getString("name");
			    		hourCost = rs2.getDouble("hour_rate");
			    		dayCost = rs2.getDouble("day_rate");
			    		//setVehicle(new Vehicle(make, model, type, hourCost, dayCost));
			    	
			    	}
			    }
				
			
			getVehicles();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		public void setQueryValues(PreparedStatement temp1, PreparedStatement temp2) throws SQLException{
			ResultSet rs = temp1.executeQuery();
			while(rs.next()){
				locID = rs.getInt("id");
			}		
		}
		
		
		public void setVehicle(Vehicle newVehicle){
			list.add(newVehicle);	
		}
		
		public ArrayList<Vehicle> getVehicles(){
			//Mini Test
			
			
			
			System.out.println("ArrayList Results");
			for(int i = 0; i < list.size(); i++){
				Vehicle temp = list.get(i);
//				System.out.println("Make: " + temp.getMake() + " Make: " + temp.getModel()
//						+ " Type: " + temp.getVehicleType() +  " Hour Rate: " + temp.getHourlyRate()
//						+ " Day Rate: " + temp.getDailyRate());
			}
			
			return list;
		}
}
