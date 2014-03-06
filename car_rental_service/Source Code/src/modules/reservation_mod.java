package modules;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import objects.Metadata;
import objects.Rental;
import dao.GlobalDB;

public class reservation_mod {
	private GlobalDB global;
	private inputparser_mod inputparser;
	
	public reservation_mod() {
		global = new GlobalDB();
		inputparser = new inputparser_mod();
	}
	
	public List<String> reserveVehicle(Map<String, String[]> parameterMap) {
		try {
			//Error messages
			List<String> error = new ArrayList<String>();
			
			int rental_hours = 0;
			try {
				rental_hours = Integer.parseInt(((String[])parameterMap.get("hour"))[0].trim());
				if (rental_hours < 1 || rental_hours > 72)
					throw new Exception();
			} catch(Exception e) {
				error.add("*Invalid hours");
			}
			
			String date_str = "";
			date_str += ((String[])parameterMap.get("year"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("month"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("day"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("hours"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("minute"))[0];
			date_str += "-";
			
			if (!inputparser.parseDateAhead(date_str))
				error.add("*Invalid pick up date");
			
			return error;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			List<String> error = new ArrayList<String>();
			error.add("*Server error");
			return error;
		}
	}
	
	public Rental reserveConfirmation(Map<String, String[]> parameterMap) {
		try {
			global.openDBconnection();
			
			Rental rental = new Rental();
			
			
			
			int vehicle_id = Integer.parseInt(((String[])parameterMap.get("vehicle_id"))[0]);
			Double hour_rate = 0.0;
			Double day_rate = 0.0;
			System.out.println("vehicle_id " + vehicle_id);
			
			global.select_vehicle_where_id.setInt(1, vehicle_id);
			ResultSet rs = global.select_vehicle_where_id.executeQuery();
			if (rs.next()) {
				global.select_vehicle_location_where_id.setInt(1, rs.getInt("location_id"));
				ResultSet rss = global.select_vehicle_location_where_id.executeQuery();
				if (rss.next()) {
					rental.setLocation(rss.getString("name"), rss.getString("street1"), rss.getString("street2"), rss.getString("city"), rss.getString("state"), rss.getString("zip"));
				}
				
				String make = "";
				String model = "";
				String type = "";

				
				global.select_vehicle_make_where_id.setInt(1, rs.getInt("make_id"));
				rss = global.select_vehicle_make_where_id.executeQuery();
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
				
				rental.setVehicle(vehicle_id, make, model, type, rs.getInt("year"), rs.getString("color"));
			}
			
			
			int rental_hours = 0;
			try {
				rental_hours = Integer.parseInt(((String[])parameterMap.get("hour"))[0].trim());
			} catch(Exception e) {}
			
			String date_str = "";
			date_str += ((String[])parameterMap.get("year"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("month"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("day"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("hours"))[0];
			date_str += "-";
			date_str += ((String[])parameterMap.get("minute"))[0];
			
			System.out.println("hours: " + rental_hours);
			System.out.println("date_str: " + date_str);
			
			
			Double hourly = rental_hours * hour_rate;
			Double daily = Math.ceil(rental_hours/24.0) * day_rate;
			
			
			System.out.println(Math.ceil(rental_hours/24.0));
			System.out.println(rental_hours/24.0);
			
			System.out.println("hourly: " + hourly);
			System.out.println("daily: " + daily);
			
			
			java.util.Date input = new SimpleDateFormat("yyyy-MM-dd-kk-mm").parse(date_str);
			
			

			Calendar cal = Calendar.getInstance(); // creates calendar
		    cal.setTime(input); // sets calendar time/date
		    

			
			if (rental_hours < 24) {
				rental.setPrice(hour_rate, rental_hours, hourly);

				cal.add(Calendar.HOUR_OF_DAY, rental_hours);
				rental.setTime(input, cal.getTime(), null, null);
				
			} else {
				Double hourss = Math.ceil(rental_hours/24.0)*24;
				
				rental.setPrice((day_rate/24.0), hourss.intValue(), daily);
				
				
				cal.add(Calendar.HOUR_OF_DAY, hourss.intValue());
				rental.setTime(input, cal.getTime(), null, null);
			}
			
			
			
			return rental;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new Rental();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean reserveNow(Rental rental, Metadata data) {
		try {
			global.openDBconnection();
						
			global.insert_rental.setInt(1, data.getCustomer_id());
			global.insert_rental.setInt(2, rental.getId());
			global.insert_rental.setTimestamp(3, new Timestamp(rental.getStart_time().getTime()));
			global.insert_rental.setTimestamp(4, new Timestamp(rental.getEnd_time().getTime()));
			global.insert_rental.setTimestamp(5, null);
			global.insert_rental.setString(6, null);
			global.insert_rental.setDouble(7, rental.getCost());
			global.insert_rental.setDouble(8, rental.getHour_rate());
			global.insert_rental.setBoolean(9, false);
			global.insert_rental.executeUpdate();
			
			global.update_vehicle_available_where_id.setBoolean(1, false);
			global.update_vehicle_available_where_id.setInt(2, rental.getId());
			global.update_vehicle_available_where_id.executeUpdate();
			
			global.update_customer_balance_where_id.setDouble(1, rental.getCost());
			global.update_customer_balance_where_id.setInt(2, data.getCustomer_id());
			global.update_customer_balance_where_id.executeUpdate();
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public List<Rental> getRentalByCustomer(Metadata data) {
		try {
			global.openDBconnection();
			
			List<Rental> rentals = new ArrayList<Rental>();
			
			global.select_rental_where_customer_id.setInt(1, data.getCustomer_id());
			ResultSet rs = global.select_rental_where_customer_id.executeQuery();
			while (rs.next()) {
				Rental rental = new Rental();
				
				rental.setRental_id(rs.getInt("id"));
				
				rental.setCancelled(rs.getBoolean("cancelled"));
				
				if (rs.getTimestamp("returned") == null)
					rental.setTime(new Date(rs.getTimestamp("start_time").getTime()), new Date(rs.getTimestamp("end_time").getTime()), null, rs.getString("cond"));
				else
					rental.setTime(new Date(rs.getTimestamp("start_time").getTime()), new Date(rs.getTimestamp("end_time").getTime()), new Date(rs.getTimestamp("returned").getTime()), rs.getString("cond"));
				
				rental.setPrice1(rs.getDouble("hour_rate"), rs.getDouble("price"));
				
				
				
				global.select_vehicle_where_id.setInt(1, rs.getInt("vehicle_id"));
				ResultSet rss = global.select_vehicle_where_id.executeQuery();
				if (rss.next()) {
					String make = "";
					String model = "";
					String type = "";

					
					global.select_vehicle_make_where_id.setInt(1, rss.getInt("make_id"));
					ResultSet rsss = global.select_vehicle_make_where_id.executeQuery();
					if (rsss.next())
						make = rsss.getString("make");
					
					global.select_vehicle_model_where_id.setInt(1, rss.getInt("model_id"));
					rsss = global.select_vehicle_model_where_id.executeQuery();
					if (rsss.next())
						model = rsss.getString("model");
					
					global.select_vehicle_type_where_id.setInt(1, rss.getInt("type_id"));
					rsss = global.select_vehicle_type_where_id.executeQuery();
					if (rsss.next())
						type = rsss.getString("name");
					
					
					rental.setVehicle(rss.getInt("id"), make, model, type, rss.getInt("year"), rss.getString("color"));
					
					
					global.select_vehicle_location_where_id.setInt(1, rss.getInt("location_id"));
					ResultSet rssss = global.select_vehicle_location_where_id.executeQuery();
					if (rssss.next()) {
						rental.setLocation(rssss.getString("name"), rssss.getString("street1"), rssss.getString("street2"), 
								rssss.getString("city"), rssss.getString("state"), rssss.getString("zip"));

					}
				}
				rentals.add(rental);
			}

			return rentals;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return new ArrayList<Rental>();
		} finally {
			global.closeDBconnection();
		}
	}
	
	public double returnVehicle(String rental) {
		try {
			global.openDBconnection();
			
			int rental_id = Integer.parseInt(rental);
			double overage = 0.0;
			
			global.select_rental_where_id.setInt(1, rental_id);
			ResultSet rs = global.select_rental_where_id.executeQuery();
			if (rs.next()) {
				Date end_time = new Date(rs.getTimestamp("end_time").getTime());
				Date today = new Date();
				
				if (today.after(end_time)) {
					long diff = today.getTime() - end_time.getTime();
				    long diffSeconds = diff / 1000 % 60;
				    long diffMinutes = diff / (60 * 1000) % 60;
				    long diffHours = diff / (60 * 60 * 1000);
				    System.out.println("Time in seconds: " + diffSeconds + " seconds.");
				    System.out.println("Time in minutes: " + diffMinutes + " minutes.");
				    System.out.println("Time in hours: " + diffHours + " hours.");
				    
				    
				    int hours_over = new BigDecimal(diffHours).intValueExact();
				    hours_over++;
				    System.out.println(hours_over);
				    
				    overage = (hours_over * rs.getDouble("hour_rate")) + 50.0;
				    
				    //update customer balance
				    global.update_customer_balance_where_id.setDouble(1, overage);
				    global.update_customer_balance_where_id.setInt(2, rs.getInt("customer_id2"));
				    global.update_customer_balance_where_id.executeUpdate();
				    
				    //update cost in rental
				    global.update_rental_cost_where_id.setDouble(1, overage);
				    global.update_rental_cost_where_id.setInt(2, rs.getInt("id"));
				    global.update_rental_cost_where_id.executeUpdate();
				}
				
				
				//change vehicle to available
				global.update_vehicle_available_where_id.setBoolean(1, true);
				global.update_vehicle_available_where_id.setInt(2, rs.getInt("vehicle_id"));
				global.update_vehicle_available_where_id.executeUpdate();
				
			    //set timestamp in rental
				global.update_rental_returned_where_id.setInt(1, rs.getInt("id"));
				global.update_rental_returned_where_id.executeUpdate();
			}
			
			return overage;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return 0.0;
		} finally {
			global.closeDBconnection();
		}
	}
	
	public boolean cancelReservation(String rental) {
		try {
			global.openDBconnection();
			
			int rental_id = Integer.parseInt(rental);
			
			global.select_rental_where_id.setInt(1, rental_id);
			ResultSet rs = global.select_rental_where_id.executeQuery();
			if (rs.next()) {
				Date start_time = new Date(rs.getTimestamp("start_time").getTime());
				Date today = new Date();
				
				long diff = 0;
				if (start_time.after(today))
					diff = start_time.getTime() - today.getTime();
				else
					diff = today.getTime() - start_time.getTime();
				
				
//				long diff = start_time.getTime() - today.getTime();
			    long diffSeconds = diff / 1000 % 60;
			    long diffMinutes = diff / (60 * 1000) % 60;
			    long diffHours = diff / (60 * 60 * 1000);
			    System.out.println("Time in seconds: " + diffSeconds + " seconds.");
			    System.out.println("Time in minutes: " + diffMinutes + " minutes.");
			    System.out.println("Time in hours: " + diffHours + " hours.");
			    
			    int hours_over = new BigDecimal(diffHours).intValueExact();
			    double price = rs.getDouble("price");
			    
			    if (hours_over < 1) {
			    	price -= rs.getDouble("hour_rate");
			    }
			    
			    price *= -1;
			    
			    //update customer balance
			    global.update_customer_balance_where_id.setDouble(1, price);
			    global.update_customer_balance_where_id.setInt(2, rs.getInt("customer_id2"));
			    global.update_customer_balance_where_id.executeUpdate();
			    
			    //update cost in rental
			    global.update_rental_cost_where_id.setDouble(1, price);
			    global.update_rental_cost_where_id.setInt(2, rs.getInt("id"));
			    global.update_rental_cost_where_id.executeUpdate();
			    
			    //set to cancelled
				global.update_rental_cancelled_where_id.setBoolean(1, true);
				global.update_rental_cancelled_where_id.setInt(2, rs.getInt("id"));
			    global.update_rental_cancelled_where_id.executeUpdate();
			}
			
			
			//change vehicle to available
			global.update_vehicle_available_where_id.setBoolean(1, true);
			global.update_vehicle_available_where_id.setInt(2, rs.getInt("vehicle_id"));
			global.update_vehicle_available_where_id.executeUpdate();
			
			
			
			
			return true;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
}
