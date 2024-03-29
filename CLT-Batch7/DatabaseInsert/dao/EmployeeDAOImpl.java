package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dataBase.DBConnection2;
import dataBase.MyConnection;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{	
	
	Connection conRef;
	PreparedStatement psRef;
	String password,dob;
	int id;
	void getConnection()
	{
		conRef = DBConnection2.myConnection();
	}
	
	@Override
	public void addEmp(Employee empRef,Scanner s)
	{	
		
		try 
		{
			System.out.println("Enter ID : ");
			id = s.nextInt();
			empRef.setId(id);
			//s.next();
			
			System.out.println("Enter Password : ");
			password = s.next();
			empRef.setPassword(password);
			
			System.out.println("Enter Date Of Birth : ");
			dob = s.next();
			empRef.setDob(dob);
			
			getConnection();
			
			//String query = "insert into employee (id, password, dob) values (?,?,?)";
			//MyConnection.prepareConnection(); // To Prepare Connection
			psRef = conRef.prepareStatement("insert into employee (id, password, dob) values (?,?,?)");
			psRef.setInt(1, empRef.getId()  );
			psRef.setString(2,empRef.getPassword());
			psRef.setString(3, empRef.getDob());
			
			psRef.executeUpdate();
			psRef.close();
			
		} 
		catch 
		(SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Data Inserted sucessfully...");
		
	} // End of Data Insert
	
	
	public void updateEmp(Employee empRef,Scanner s) 
	{
		try 
		{
			System.out.println("Enter ID : ");
			id = s.nextInt();
			empRef.setId(id);
			//s.next();
			
			System.out.println("Enter Password : ");
			password = s.next();
			empRef.setPassword(password);
			
			
		getConnection();
		psRef = conRef.prepareStatement("update employee set password=? where id = ?");
		psRef.setString(1,empRef.getPassword());
		psRef.setInt(2, empRef.getId()  );
		
		
		psRef.executeUpdate();
		psRef.close();
		System.out.println("Updated!!");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} // end of update
	
	
	public void retrieveData(Employee empRef,Scanner s) 
	{
		try 
		{
			System.out.println("Enter ID : ");
			id = s.nextInt();
			empRef.setId(id);

		MyConnection.prepareConnection();
		psRef = conRef.prepareStatement("SELCT * FROM employee WHERE id = ?");
		psRef.setInt(1,empRef.getId());
		int i = psRef.executeUpdate();
		psRef.close();
			
			System.out.println("Retrieve successfully!");
			System.out.println(i);
		}
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
		
		
	} // end of retrieve
	
	
	public void delete(Employee empRef,Scanner s) 
	{
		try 
		{
				System.out.println("Enter ID : ");
				id = s.nextInt();
				empRef.setId(id);
				
	        	getConnection();
//	        	String sql = "DELETE FROM employee WHERE id = ?";
	        	psRef = conRef.prepareStatement("delete FROM employee WHERE id = ?");
	            // set the corresponding param
	            psRef.setInt(1, empRef.getId());
	            // execute the delete statement
	            psRef.executeUpdate();
	            
	            System.out.println("Delete Successful!");
	            
	            
	 
	     } 
		catch (SQLException e) 
		{
	            System.out.println(e.getMessage());
	     }
		
		
		
	} // end of delete
	
	
	public List<Employee> getEmpList()
	
	{
		MyConnection.prepareConnection();
		try 
		{
			psRef = conRef.prepareStatement("SELCT * FROM employee WHERE id = ?");
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
		
		return getEmpList();
	}


	
	
	

}
