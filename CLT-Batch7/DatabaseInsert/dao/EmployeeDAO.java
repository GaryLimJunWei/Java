package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDAO 
{
		void addEmp(Employee empRef);
		public void updateEmp(Employee empRef) ;
		public void retrieveData(Employee empRef) ;
		public void delete(Employee empRef) ;
		public List<Employee> getEmpList();

}
