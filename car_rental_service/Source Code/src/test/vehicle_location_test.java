package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import static org.junit.Assert.*;
import modules.vehicle_location_mod;
import org.junit.Test;

public class vehicle_location_test {

	@Test
	public void test() {
		vehicle_location_mod instance = new vehicle_location_mod();
		
		assertTrue("NYC1", instance.add("NYC1", "60 Hudson St", null, "New York", "NY", "10013",10));
		assertTrue("NYC2", instance.add("NYC2", "111 8th Avenue", null, "New York", "NY", "10011", 20));
		assertTrue("NYC3", instance.add("NYC3", "32 Avenue of the Americas (6th Ave)", null, "New York", "NY", "10013", 15));
	}
}
