package service;

import java.sql.SQLException;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;

public class databaseService implements databaseServiceI
{
	public void insert() throws SQLException
	{
		EmployeeDAO refEmp = new EmployeeDAOImpl();
		refEmp.addEmp();
	}
}
