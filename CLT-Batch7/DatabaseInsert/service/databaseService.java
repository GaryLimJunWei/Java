package service;


import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import pojo.Employee;

public class databaseService implements databaseServiceI
{
	public void option(Employee empRef,int choice) 
	{
		EmployeeDAO refEmp = new EmployeeDAOImpl();
		
		switch(choice)
		{
		case 1 : refEmp.addEmp(empRef);
		case 2 : refEmp.updateEmp(empRef);
		case 3 : refEmp.delete(empRef);
		case 4 : //Create new database
		}


		
		

		
		
		
	}
}
