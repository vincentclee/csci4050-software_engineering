package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import static org.junit.Assert.*;
import org.junit.Test;
import modules.*;

public class vehicle_type_test {

	@Test
	public void test() {
		vehicle_type_mod instance = new vehicle_type_mod();
		
		assertTrue("Convertible", instance.add("Convertible", 5, 20));
		assertTrue("Coupe", instance.add("Coupe", 6, 21));
		assertTrue("Crossover", instance.add("Crossover", 7, 25));
		assertTrue("Diesel", instance.add("Diesel", 9, 24));
		assertTrue("Hatchback", instance.add("Hatchback", 8, 22));
		assertTrue("Hybrid/Electric", instance.add("Hybrid/Electric", 7, 21));
		assertTrue("Luxury", instance.add("Luxury", 6, 20));
		assertTrue("Minivan", instance.add("Minivan", 9, 26));
		assertTrue("Sedan", instance.add("Sedan", 8, 25));
		assertTrue("SUV", instance.add("SUV", 6, 27));
		assertTrue("Truck", instance.add("Truck", 7, 25));
		assertTrue("Wagon", instance.add("Wagon", 9, 21));
	}
}