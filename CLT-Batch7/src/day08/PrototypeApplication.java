package day08;

import java.util.Scanner;

public class PrototypeApplication 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int employeeID = s.nextInt();
		
		System.out.println("Enter employee Name : ");
		String empName = s.next();
		
		System.out.println("Enter Employee Designation : ");
		String designation = s.next();
		
		EmployeeDetails refEmployeeDetails1 = new EmployeeDetails();
		refEmployeeDetails1.setEmpID(employeeID);
		refEmployeeDetails1.setEmpName(empName);
		refEmployeeDetails1.setDesignation(designation);
		refEmployeeDetails1.showRecord();
		
		//cloning object
		EmployeeDetails refEmployeeDetails2 = (EmployeeDetails) refEmployeeDetails1.clone();
		refEmployeeDetails2.showRecord();

	}

}
