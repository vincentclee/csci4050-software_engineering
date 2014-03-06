package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-14
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	//role - membership - registration - administrator
	role_test.class, membership_test.class, registration_test.class, administrator_test.class, 
	//vehicle_location - vehicle_make - vehicle_model - vehicle_type - vehicle
	vehicle_location_test.class, vehicle_make_test.class, vehicle_model_test.class, vehicle_type_test.class, vehicle_test.class })
public class Startup {

}
