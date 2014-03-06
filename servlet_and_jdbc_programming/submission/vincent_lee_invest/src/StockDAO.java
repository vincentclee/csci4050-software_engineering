import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Stock Data Access Object
 * @author Vincent Lee
 * @version 1.0
 * @date 10/19/2013
 */

public class StockDAO {
	PreparedStatement select_stocks; //Statement to get all the data from both tables
	HashMap<String, Company> stockMap = new HashMap<String, Company>(); //Stores query data
	HashMap<String, String> inputHashMap; //Stores input
	boolean DEBUG = false;
	Connection conn;
	
	/**
	 * Default Constructor
	 */
	public StockDAO() {
		
	}
	
	public void connect() {
		try {
            //Connect to database
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("<Instantiated MySQL driver!>");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/stocks", "demo", "demo");
			System.out.println("<Connected to MySQL!>");
			
			//Prepared statements used to query database
			select_stocks = conn.prepareStatement("SELECT company.*, stock_price.price FROM company JOIN stock_price ON company.symbol=stock_price.symbol");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	/**
	 * Query Database
	 */
	public void getData() {
		try {
			ResultSet rs = select_stocks.executeQuery();
			// Goes to next item in stock list result set
			while (rs.next()) {
				if (!stockMap.containsKey(rs.getString("symbol")))
					stockMap.put(rs.getString("symbol"), new Company(rs.getString("name"), rs.getString("exchange"), 
							rs.getString("symbol"), rs.getString("industry"), rs.getDate("addedOn"), rs.getDouble("price")));
			}
			
			//Close connection
			select_stocks.close();
			conn.close();
			System.out.println("<Disconnected from MySQL!>");
			
			if (DEBUG) {
				Iterator<Map.Entry<String, Company>> i = stockMap.entrySet().iterator(); 
				while(i.hasNext()){
				    String key = i.next().getKey();
				    System.out.println(key + "="+stockMap.get(key));
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Checks for population of at least one field.
	 * @param inputMap
	 * @return true if none of fields are populated.
	 */
	public boolean checkNullInput(Map<String, String[]> inputMap) {
        for (Object key: inputMap.keySet()) {
        	String keyStr = (String)key;
        	String[] value = (String[])inputMap.get(keyStr);
        	if (!value[0].trim().isEmpty())
        		return false;
        }
        return true;
	}
	
	public HashMap<String, String> checkInputValues(Map<String, String[]> inputMap) {
		inputHashMap = new HashMap<String, String>();
		HashMap<String, String> errorMap = new HashMap<String, String>();
		
		//Pre-process -- Load inputMap into inputHashMap removing beginning and trailing white spaces
		for (Object key: inputMap.keySet()) {
        	String keyStr = (String)key;
        	String[] value = (String[])inputMap.get(keyStr);
        	value[0] = value[0].toUpperCase();
        	inputHashMap.put(keyStr, value[0].trim());
		}
		
		if (DEBUG) {
			Iterator<Entry<String,String>> itr = inputHashMap.entrySet().iterator();
			//Iterates through entire data set
			while (itr.hasNext()) {
			    Entry<String,String> entry = itr.next();
			    String key = entry.getKey();
			    //System.out.println("key: " + key);
			    String value = entry.getValue();
			    //System.out.println("list: " + list);
			    System.out.println(key + "=" + value);
			}
		}
		
		//Row1 -- If one or both fields are filled, check input.
		if (!(inputHashMap.get("symbol1").isEmpty() && inputHashMap.get("quantity1").isEmpty())) {
			if (inputHashMap.get("symbol1").isEmpty())
				errorMap.put("symbol1error", "*Enter symbol");
			if (inputHashMap.get("quantity1").isEmpty())
				errorMap.put("quantity1error", "*Enter quantity");
			
			if (!inputHashMap.get("symbol1").isEmpty()) {
				if (!stockMap.containsKey(inputHashMap.get("symbol1")))
					errorMap.put("symbol1error", "*Invalid symbol");
			} 
			if (!inputHashMap.get("quantity1").isEmpty()) {
				try {
					int temp = Integer.parseInt(inputHashMap.get("quantity1"));
					if (temp < 1)
						throw new Exception();
				} catch(Exception e) {
					errorMap.put("quantity1error", "*Invalid quantity");
				}
			}
		}
		//Row2 -- If one or both fields are filled, check input.
		if (!(inputHashMap.get("symbol2").isEmpty() && inputHashMap.get("quantity2").isEmpty())) {
			if (inputHashMap.get("symbol2").isEmpty())
				errorMap.put("symbol2error", "*Enter symbol");
			if (inputHashMap.get("quantity2").isEmpty())
				errorMap.put("quantity2error", "*Enter quantity");
			
			if (!inputHashMap.get("symbol2").isEmpty()) {
				if (!stockMap.containsKey(inputHashMap.get("symbol2")))
					errorMap.put("symbol2error", "*Invalid symbol");
			} 
			if (!inputHashMap.get("quantity2").isEmpty()) {
				try {
					int temp = Integer.parseInt(inputHashMap.get("quantity2"));
					if (temp < 1)
						throw new Exception();
				} catch(Exception e) {
					errorMap.put("quantity2error", "*Invalid quantity");
				}
			}
		}
		//Row3 -- If one or both fields are filled, check input.
		if (!(inputHashMap.get("symbol3").isEmpty() && inputHashMap.get("quantity3").isEmpty())) {
			if (inputHashMap.get("symbol3").isEmpty())
				errorMap.put("symbol3error", "*Enter symbol");
			if (inputHashMap.get("quantity3").isEmpty())
				errorMap.put("quantity3error", "*Enter quantity");
			
			if (!inputHashMap.get("symbol3").isEmpty()) {
				if (!stockMap.containsKey(inputHashMap.get("symbol3")))
					errorMap.put("symbol3error", "*Invalid symbol");
			} 
			if (!inputHashMap.get("quantity3").isEmpty()) {
				try {
					int temp = Integer.parseInt(inputHashMap.get("quantity3"));
					if (temp < 1)
						throw new Exception();
				} catch(Exception e) {
					errorMap.put("quantity3error", "*Invalid quantity");
				}
			}
		}
		//Row4 -- If one or both fields are filled, check input.
		if (!(inputHashMap.get("symbol4").isEmpty() && inputHashMap.get("quantity4").isEmpty())) {
			if (inputHashMap.get("symbol4").isEmpty())
				errorMap.put("symbol4error", "*Enter symbol");
			if (inputHashMap.get("quantity4").isEmpty())
				errorMap.put("quantity4error", "*Enter quantity");
			
			if (!inputHashMap.get("symbol4").isEmpty()) {
				if (!stockMap.containsKey(inputHashMap.get("symbol4")))
					errorMap.put("symbol4error", "*Invalid symbol");
			} 
			if (!inputHashMap.get("quantity4").isEmpty()) {
				try {
					int temp = Integer.parseInt(inputHashMap.get("quantity4"));
					if (temp < 1)
						throw new Exception();
				} catch(Exception e) {
					errorMap.put("quantity4error", "*Invalid quantity");
				}
			}
		}
		
        return errorMap;
	}
	
	public LinkedHashMap<String, ArrayList<String>> getResults() {
		LinkedHashMap<String, ArrayList<String>> resultMap = new LinkedHashMap<String, ArrayList<String>>();
		LinkedHashMap<String, Integer> reduceMap = new LinkedHashMap<String, Integer>();
		double totalPrice = 0;
		int shares = 0;
		
		if (!(inputHashMap.get("symbol1").isEmpty())) {
			reduceMap.put(inputHashMap.get("symbol1"), Integer.parseInt(inputHashMap.get("quantity1")));
		}
		if (!(inputHashMap.get("symbol2").isEmpty())) {
			if (reduceMap.containsKey(inputHashMap.get("symbol2")))
				reduceMap.put(inputHashMap.get("symbol2"), reduceMap.get(inputHashMap.get("symbol2")) + Integer.parseInt(inputHashMap.get("quantity2")));
			else
				reduceMap.put(inputHashMap.get("symbol2"), Integer.parseInt(inputHashMap.get("quantity2")));
		}
		if (!(inputHashMap.get("symbol3").isEmpty())) {
			if (reduceMap.containsKey(inputHashMap.get("symbol3")))
				reduceMap.put(inputHashMap.get("symbol3"), reduceMap.get(inputHashMap.get("symbol3")) + Integer.parseInt(inputHashMap.get("quantity3")));
			else
				reduceMap.put(inputHashMap.get("symbol3"), Integer.parseInt(inputHashMap.get("quantity3")));
		}
		if (!(inputHashMap.get("symbol4").isEmpty())) {
			if (reduceMap.containsKey(inputHashMap.get("symbol4")))
				reduceMap.put(inputHashMap.get("symbol4"), reduceMap.get(inputHashMap.get("symbol4")) + Integer.parseInt(inputHashMap.get("quantity4")));
			else
				reduceMap.put(inputHashMap.get("symbol4"), Integer.parseInt(inputHashMap.get("quantity4")));
		}
		
		
		
		
    	Iterator<Entry<String,Integer>> itr = reduceMap.entrySet().iterator();
		//Iterates through entire data set
		while (itr.hasNext()) {
		    Entry<String, Integer> entry = itr.next();
		    String key = entry.getKey();
		    if (DEBUG) System.out.println("key: " + key);
		    Integer value = entry.getValue();
		    if (DEBUG) System.out.println("list: " + value);
		    
		    
		    ArrayList<String> temp = new ArrayList<String>();
		    temp.add(stockMap.get(key).getName());
		    temp.add(stockMap.get(key).getExchange());
		    temp.add(stockMap.get(key).getIndustry());
		    temp.add(stockMap.get(key).getAddedOn().toString());
		    temp.add(stockMap.get(key).getPrice().toString());
		    
		    
			
			double sharePriceTotal = stockMap.get(key).getPrice() * value;
			
			sharePriceTotal = BigDecimal.valueOf(sharePriceTotal).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			
			totalPrice += sharePriceTotal;
			
			shares += value;
			
			temp.add(Integer.toString(value));
			temp.add(Double.toString(sharePriceTotal));
			
			resultMap.put(key, temp);
		}
		
		
		ArrayList<String> temp = new ArrayList<String>();

		totalPrice = BigDecimal.valueOf(totalPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		temp.add(Integer.toString(shares));
		temp.add(Double.toString(totalPrice));		
		resultMap.put("totals", temp);
		
		if (DEBUG) {
			Iterator<Entry<String,ArrayList<String>>> itre = resultMap.entrySet().iterator();
			//Iterates through entire data set
			while (itre.hasNext()) {
			    Entry<String,ArrayList<String>> entry = itre.next();
			    String key = entry.getKey();
			    System.out.print(key);
			    List<String> list = entry.getValue();
			    System.out.println(":" + list);
			}
		}
		
		return resultMap;
	}
}