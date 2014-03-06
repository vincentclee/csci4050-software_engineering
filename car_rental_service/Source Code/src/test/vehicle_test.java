package test;

/**
 * @author Vincent Lee
 * @author Osama Mansour
 * @version 1.0
 * @since 2013-11-05
 */

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import modules.vehicle_mod;
import org.junit.Test;

public class vehicle_test {

        @Test
        public void Ford_Focus_Sedan() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Ford"});
                parameterMap.put("model", new String[]{"Focus Sedan"});
                parameterMap.put("type", new String[]{"Sedan"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"575PHD"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"Blue"});
                parameterMap.put("month", new String[]{"4"});
                parameterMap.put("day", new String[]{"3"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"43234"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }

        @Test
        public void Toyota_Prius_Hatchback() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Toyota"});
                parameterMap.put("model", new String[]{"Prius Hatchback"});
                parameterMap.put("type", new String[]{"Hatchback"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"123GRE"});
                parameterMap.put("year1", new String[]{"2012"});
                parameterMap.put("color", new String[]{"Red"});
                parameterMap.put("month", new String[]{"6"});
                parameterMap.put("day", new String[]{"3"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"87223"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
        
        @Test
        public void Honda_Civic_Hybrid() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Honda"});
                parameterMap.put("model", new String[]{"Civic Hybrid"});
                parameterMap.put("type", new String[]{"Hybrid/Electric"});
                parameterMap.put("location", new String[]{"NYC3"});
                parameterMap.put("tag", new String[]{"644RGE"});
                parameterMap.put("year1", new String[]{"2011"});
                parameterMap.put("color", new String[]{"Gray"});
                parameterMap.put("month", new String[]{"7"});
                parameterMap.put("day", new String[]{"6"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"101321"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
        
        @Test
        public void Mazda_MAZDA3_Sedan() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Mazda"});
                parameterMap.put("model", new String[]{"MAZDA3 Sedan"});
                parameterMap.put("type", new String[]{"Sedan"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"542DFE"});
                parameterMap.put("year1", new String[]{"2010"});
                parameterMap.put("color", new String[]{"Green"});
                parameterMap.put("month", new String[]{"5"});
                parameterMap.put("day", new String[]{"12"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"121654"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
        
		 public void Subaru_Forester_SUV() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Subaru"});
                parameterMap.put("model", new String[]{"Forester SUV"});
                parameterMap.put("type", new String[]{"SUV"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"521SUB"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"Gray"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"5"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"13222"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
        @Test
        public void Nissan_200SX_Coupe() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Nissan"});
                parameterMap.put("model", new String[]{"200SX Coupe"});
                parameterMap.put("type", new String[]{"Convertible"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"KK9393"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"Blue"});
                parameterMap.put("month", new String[]{"12"});
                parameterMap.put("day", new String[]{"5"});
                parameterMap.put("year", new String[]{"2012"});
                parameterMap.put("mileage", new String[]{"30222"});
                parameterMap.put("condition", new String[]{"Fair"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
		   @Test
        public void Toyota_Prius_Hybird() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Toyota"});
                parameterMap.put("model", new String[]{"Prius Sedan"});
                parameterMap.put("type", new String[]{"Hybrid/Electric"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"89UIIK"});
                parameterMap.put("year1", new String[]{"2012"});
                parameterMap.put("color", new String[]{"Yellow"});
                parameterMap.put("month", new String[]{"9"});
                parameterMap.put("day", new String[]{"5"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"60223"});
                parameterMap.put("condition", new String[]{"Good"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
	
		   @Test
        public void BMW_3Series_Sedan() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"BMW"});
                parameterMap.put("model", new String[]{"3 Series Sedan"});
                parameterMap.put("type", new String[]{"Sedan"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"GJGK8K"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"Yellow"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"15"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"76454"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
			   @Test
        public void Buick_RegalGS_Crossover() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Buick"});
                parameterMap.put("model", new String[]{"Regal GS"});
                parameterMap.put("type", new String[]{"Crossover"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"MMM789"});
                parameterMap.put("year1", new String[]{"2011"});
                parameterMap.put("color", new String[]{"Red"});
                parameterMap.put("month", new String[]{"12"});
                parameterMap.put("day", new String[]{"1"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"82828"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
			   @Test
        public void Audi_A6Diesel_Diesel() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Audi"});
                parameterMap.put("model", new String[]{"A6 Diesel"});
                parameterMap.put("type", new String[]{"Diesel"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"K67HHP"});
                parameterMap.put("year1", new String[]{"2012"});
                parameterMap.put("color", new String[]{"Green"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"15"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"10873"});
                parameterMap.put("condition", new String[]{"Fair"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
		@Test
        public void Daewood_Lanos_Hatchback() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Daewood"});
                parameterMap.put("model", new String[]{"Lanos Hatchback"});
                parameterMap.put("type", new String[]{"Hatchback"});
                parameterMap.put("location", new String[]{"NYC1"});
                parameterMap.put("tag", new String[]{"M10KK7"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"Orange"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"23"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"1002"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
		
		@Test
        public void Dodge_Caravan_Minivan() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Dodge"});
                parameterMap.put("model", new String[]{"Grand Caravan Minivan"});
                parameterMap.put("type", new String[]{"Minivan"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"TYDJS9"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"yellow"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"26"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"167788"});
                parameterMap.put("condition", new String[]{"Good"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		@Test
        public void Toyota_Tocoma_DoubleCab() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Toyota"});
                parameterMap.put("model", new String[]{"Tacoma Extended Cab"});
                parameterMap.put("type", new String[]{"Truck"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"THII89"});
                parameterMap.put("year1", new String[]{"2013"});
                parameterMap.put("color", new String[]{"black"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"26"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"18899"});
                parameterMap.put("condition", new String[]{"Excellent"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		@Test
        public void Suburu_Legacy_Wagon() {
                vehicle_mod instance = new vehicle_mod();
                Map<String, String[]> parameterMap = new HashMap<String, String[]>();
                
                parameterMap.put("make", new String[]{"Subaru"});
                parameterMap.put("model", new String[]{"Legacy Wagon"});
                parameterMap.put("type", new String[]{"Wagon"});
                parameterMap.put("location", new String[]{"NYC2"});
                parameterMap.put("tag", new String[]{"TY99O"});
                parameterMap.put("year1", new String[]{"2012"});
                parameterMap.put("color", new String[]{"grey"});
                parameterMap.put("month", new String[]{"11"});
                parameterMap.put("day", new String[]{"26"});
                parameterMap.put("year", new String[]{"2013"});
                parameterMap.put("mileage", new String[]{"11788"});
                parameterMap.put("condition", new String[]{"Fair"});
                assertTrue(instance.add_vehicle(parameterMap).isEmpty());
        }
		
		
		
		
}
