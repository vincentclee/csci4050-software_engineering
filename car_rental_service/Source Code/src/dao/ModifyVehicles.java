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

	public class ModifyVehicles {
		   
			PreparedStatement vehicleID, getVehicle;
			int vecID;
			
			TempVehicle modVehicle;
			
			public ModifyVehicles(String RegTag){
				
				
				
				try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn;
						conn = DriverManager.getConnection("jdbc:mysql://localhost/youdrive", "root", "mysql");
						
						vehicleID = conn.prepareStatement("SELECT id FROM vehicle WHERE registration=?;");
						vehicleID.setString(1, RegTag);
						ResultSet rs = vehicleID.executeQuery();
						while(rs.next()){
							vecID = rs.getInt("id");
							System.out.println(vecID);
						}
						
						modVehicle = new TempVehicle(vecID);
					
						
											
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
					
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					
			}
			
			
			//Returns the Vehicle to be Modified
			public TempVehicle getModVehicle(){
				return modVehicle;
			}
			
			
			
			
	}
				
