package service;


import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import pojo.Employee;

public class databaseService implements databaseServiceI
{
	public void option(Employee empRef,int choice,Scanner s) 
	{
		EmployeeDAO refEmp = new EmployeeDAOImpl();
		
		switch(choice)
		{
		case 1 : refEmp.addEmp(empRef,s);
		case 2 : refEmp.updateEmp(empRef,s);
		case 3 : refEmp.delete(empRef,s);
		case 4 : //Create new database
		}
		
		

		
		

		
		
		
	}
}
