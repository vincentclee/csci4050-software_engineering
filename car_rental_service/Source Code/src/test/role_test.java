package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-12
 */

import static org.junit.Assert.*;
import modules.role_mod;
import org.junit.Test;

public class role_test {

	@Test
	public void test() {
		role_mod instance = new role_mod();
		
		instance.add("customer");
		instance.add("administrator");
	}

}
