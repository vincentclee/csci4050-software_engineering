package modules;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-12
 */

import dao.GlobalDB;

public class role_mod {
	private GlobalDB global;
	
	public role_mod() {
		this.global = new GlobalDB();
	}
	
	public void add(String role) {
		try {
			global.openDBconnection();
			
			global.insert_role.setString(1, role);
			global.insert_role.executeUpdate();
		} catch(Exception e) {
			System.err.println(e.getMessage());
		} finally {
			global.closeDBconnection();
		}
	}
}
