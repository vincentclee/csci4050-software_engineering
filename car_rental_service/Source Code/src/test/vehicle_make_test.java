package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import static org.junit.Assert.*;
import modules.vehicle_make_mod;
import org.junit.Test;

public class vehicle_make_test {

	@Test
	public void test() {
		vehicle_make_mod instance = new vehicle_make_mod();
		
		assertTrue("Acura", instance.add("Acura"));
		assertTrue("Alfa Romeo", instance.add("Alfa Romeo"));
		assertTrue("AM General", instance.add("AM General"));
		assertTrue("Aston Martin", instance.add("Aston Martin"));
		assertTrue("Audi", instance.add("Audi"));
		assertTrue("Bentley", instance.add("Bentley"));
		assertTrue("BMW", instance.add("BMW"));
		assertTrue("Bugatti", instance.add("Bugatti"));
		assertTrue("Buick", instance.add("Buick"));
		assertTrue("Cadillac", instance.add("Cadillac"));
		assertTrue("Chevrolet", instance.add("Chevrolet"));
		assertTrue("Chrysler", instance.add("Chrysler"));
		assertTrue("Daewood", instance.add("Daewood"));
		assertTrue("Dodge", instance.add("Dodge"));
		assertTrue("Eagle", instance.add("Eagle"));
		assertTrue("Ferrari", instance.add("Ferrari"));
		assertTrue("FIAT", instance.add("FIAT"));
		assertTrue("Fisker", instance.add("Fisker"));
		assertTrue("Ford", instance.add("Ford"));
		assertTrue("Geo", instance.add("Geo"));
		assertTrue("GMC", instance.add("GMC"));
		assertTrue("Honda", instance.add("Honda"));
		assertTrue("HUMMER", instance.add("HUMMER"));
		assertTrue("Hyundai", instance.add("Hyundai"));
		assertTrue("Infiniti", instance.add("Infiniti"));
		assertTrue("Isuzu", instance.add("Isuzu"));
		assertTrue("Jaguar", instance.add("Jaguar"));
		assertTrue("Jeep", instance.add("Jeep"));
		assertTrue("Kia", instance.add("Kia"));
		assertTrue("Lamborghini", instance.add("Lamborghini"));
		assertTrue("Land Rover", instance.add("Land Rover"));
		assertTrue("Lexus", instance.add("Lexus"));
		assertTrue("Lincoln", instance.add("Lincoln"));
		assertTrue("Lotus", instance.add("Lotus"));
		assertTrue("Maserati", instance.add("Maserati"));
		assertTrue("Maybach", instance.add("Maybach"));
		assertTrue("Mazda", instance.add("Mazda"));
		assertTrue("McLaren", instance.add("McLaren"));
		assertTrue("Mercedes-Benz", instance.add("Mercedes-Benz"));
		assertTrue("Mercury", instance.add("Mercury"));
		assertTrue("MINI", instance.add("MINI"));
		assertTrue("Mitsubishi", instance.add("Mitsubishi"));
		assertTrue("Nissan", instance.add("Nissan"));
		assertTrue("Oldsmobile", instance.add("Oldsmobile"));
		assertTrue("Panoz", instance.add("Panoz"));
		assertTrue("Plymouth", instance.add("Plymouth"));
		assertTrue("Pontiac", instance.add("Pontiac"));
		assertTrue("Porsche", instance.add("Porsche"));
		assertTrue("Ram", instance.add("Ram"));
		assertTrue("Rolls-Royce", instance.add("Rolls-Royce"));
		assertTrue("Saab", instance.add("Saab"));
		assertTrue("Saturn", instance.add("Saturn"));
		assertTrue("Scion", instance.add("Scion"));
		assertTrue("Smart", instance.add("Smart"));
		assertTrue("Spyker", instance.add("Spyker"));
		assertTrue("Subaru", instance.add("Subaru"));
		assertTrue("Suzuki", instance.add("Suzuki"));
		assertTrue("Tesla", instance.add("Tesla"));
		assertTrue("Toyota", instance.add("Toyota"));
		assertTrue("Volkswagen", instance.add("Volkswagen"));
		assertTrue("Volvo", instance.add("Volvo"));
	}
}