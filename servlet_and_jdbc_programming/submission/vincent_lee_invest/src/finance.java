import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class finance
 * @author Vincent Lee
 * @version 1.0
 * @date 10/19/2013
 */

@WebServlet("/finance")
public class finance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public finance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get request go to html page.
		response.sendRedirect("/vincent_lee_invest/stocks.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Request parameters map
		Map<String, String[]> inputMap = request.getParameterMap();
		
        //Data Access Object
        StockDAO stockData = new StockDAO();
        
        //Check for no input in all fields
        if (stockData.checkNullInput(inputMap)) {
        	request.setAttribute("inputerror", "Please enter at least one stock with associated quantity.");
        	request.getRequestDispatcher("/stocks.jsp").forward(request, response);
        	return;
        }
        
        //Open Connection
        stockData.connect();
        //Query Database
        stockData.getData();
        
        HashMap<String, String> errorMap = stockData.checkInputValues(inputMap);
        //If there are no errors go to result
        if (errorMap.isEmpty()) {
        	LinkedHashMap<String, ArrayList<String>> resultMap = stockData.getResults();
        	
        	request.setAttribute("shares", resultMap.get("totals").get(0));
        	request.setAttribute("total", resultMap.get("totals").get(1));
        	resultMap.remove("totals");
        	request.setAttribute("results", resultMap);
        	request.getRequestDispatcher("/results.jsp").forward(request, response);
        	return;
        }
        //Display Errors
        else {
        	Iterator<Entry<String,String>> itr = errorMap.entrySet().iterator();
    		//Iterates through entire data set
    		while (itr.hasNext()) {
    		    Entry<String,String> entry = itr.next();
    		    String key = entry.getKey();
    		    String value = entry.getValue();
    		    //System.out.println(key + "=" + value);
    		    request.setAttribute(key, value);
    		}
        }
		
        //Send back original input
        for (Object key: inputMap.keySet()) {
        	String keyStr = (String)key;
        	String[] value = (String[])inputMap.get(keyStr);
        	
        	request.setAttribute(keyStr.trim(), value[0].trim());
        }
        
        request.getRequestDispatcher("/stocks.jsp").forward(request, response);
	}

}
