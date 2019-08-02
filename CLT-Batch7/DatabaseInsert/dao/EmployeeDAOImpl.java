package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dataBase.MyConnection;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO 
{	
	
	Connection con;
	PreparedStatement st;
	Employee getter = new Employee();
	@Override
	public void addEmp() throws SQLException 
	{	
		try 
		{
			
			con = MyConnection.prepareConnection(); // To Prepare Connection
			st = con.prepareStatement("insert into employee (id, password, dob) values (?,?,?)");
			st.setInt(1, getter.getId() );
			st.setString(2, getter.getPassword());
			st.setString(3, getter.getDob());
			
			st.executeUpdate();
			st.close();
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Data Inserted sucessfully...");
		
	} // End of Data Insert
	
	
	public void updateEmp() throws SQLException
	{
		

		st = con.prepareStatement("update into employee(id,password,dob) values (?,?,?)");
		st.setInt(1, getter.getId());
		st.setString(2, getter.getPassword());
		st.setString(3, getter.getDob());
		
		st.executeUpdate();
		st.close();
		System.out.println("Updated!!");
		
	} // end of update
	
	
	public void retrieveData() throws SQLException, ClassNotFoundException 
	{

		st = con.prepareStatement("SELCT * FROM employee WHERE id = ?");
		st.setInt(1, getter.getId());
		st.setString(2, getter.getPassword());
		st.setString(3, getter.getDob());
		
		st.executeUpdate();
		st.close();
		
		System.out.println("Retrieved! Add retrieve data here...");
		
	} // end of retrieve
	
	
	
	

}
