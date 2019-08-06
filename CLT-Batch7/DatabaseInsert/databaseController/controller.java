package databaseController;

import java.util.Scanner;
import pojo.Employee;

public class controller 


{
	Employee empRef = new Employee();
	
	Scanner s = new Scanner(System.in);
	public void adminControl() 
	{
	
		int choice;
		
		
		System.out.println("Enter choice : ");
		System.out.println("1. Add item into table in Database? ");
		System.out.println("2. Update item into table in Database? ");
		System.out.println("3. Delete item into table in Database? ");
		System.out.println("4. Create new Database? ");
		System.out.println("5. Print all tables in Database? ");
		
		choice = s.nextInt();
		
		empRef.getRefSvc().option(empRef,choice,s);
		
		
	}


}
