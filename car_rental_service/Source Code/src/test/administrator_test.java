package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-22
 */


import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import modules.administrator_mod;
import org.junit.Test;

public class administrator_test {

	@Test
	public void administrator() {
		administrator_mod instance = new administrator_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"administrator"});
		parameterMap.put("password", new String[]{"!@#$%^&*", "!@#$%^&*"});
		parameterMap.put("firstname", new String[]{"administrator"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"global"});
		assertTrue(instance.add_administrator(parameterMap).isEmpty());
	}
	
	@Test
	public void admin() {
		administrator_mod instance = new administrator_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"admin"});
		parameterMap.put("password", new String[]{"*&^%$#@!", "*&^%$#@!"});
		parameterMap.put("firstname", new String[]{"admin"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"test"});
		assertTrue(instance.add_administrator(parameterMap).isEmpty());
	}
}
