package application;

import java.sql.SQLException;

import controller.AdminController;

public class CRUDApplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		AdminController refControl = new AdminController();
		refControl.adminControl();
		
		
	}

}
