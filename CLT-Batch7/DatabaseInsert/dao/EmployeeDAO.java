package dao;

import java.util.List;
import java.util.Scanner;

import pojo.Employee;

public interface EmployeeDAO 
{
		void addEmp(Employee empRef,Scanner s);
		public void updateEmp(Employee empRef,Scanner s) ;
		public void retrieveData(Employee empRef,Scanner s) ;
		public void delete(Employee empRef,Scanner s) ;
		public List<Employee> getEmpList();

}
