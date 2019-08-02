package controller;

import java.sql.SQLException;
import java.util.Scanner;
import pojo.Employee;

public class AdminController 


{
	Employee refEmployee;
	
	Scanner s = new Scanner(System.in);
	public void adminControl() throws SQLException 
	{
		String password,dob;
		int id;
		
		System.out.println("Enter ID : ");
		id = s.nextInt();
		refEmployee.setId(id);
		s.next();
		
		System.out.println("Enter name : ");
		password = s.next();
		refEmployee.setPassword(password);
		
		System.out.println("Enter Date Of Birth : ");
		dob = s.next();
		refEmployee.setDob(dob);
		
		refEmployee.getRefSvc().insert();
		
		
	}


}
