package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-13
 */

import static org.junit.Assert.*;
import modules.membership_mod;
import org.junit.Test;

public class membership_test {

	@Test
	public void test() {
		membership_mod instance = new membership_mod();
		
		instance.add("YouDrive Standard", "all around great value", 49.99, 6);
		//instance.add("YouDrive Premium", "extra value", 79.99, 12);
	}
}
