package application;

import java.sql.SQLException;

import databaseController.controller;

public class CRUDApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		controller refControl = new controller();
		refControl.adminControl();
		
		
	}

}
