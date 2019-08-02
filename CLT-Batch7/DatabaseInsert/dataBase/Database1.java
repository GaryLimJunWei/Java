package dataBase;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database1 {

	public static void main(String []args) throws ClassNotFoundException,SQLException{
		//Step 1
		Connection con = MyConnection.prepareConnection();
		
		//Execute a query
		System.out.println("Creating table in given database....");
		Statement st = con.createStatement();
		
		//create table
//		String sql = "Create TABLE students"+
//					 "(mobile INTEGER not NULL,"
//					 +"name VARCHAR(25),"+
//					 "email varchar(35),"+
//					 "PRIMARY KEY (mobile))";
//		st.executeUpdate(sql);
//		System.out.println("Created table in given database....");
		
		//insert record
//		String sql = "INSERT INTO students " +
//					"VALUES (676092612, 'yugal', 'yugal@gmail.com')";
//		st.execute(sql);
//		
//		System.out.println("Data Inserted sucessfully...");
		
		//edit a record
//		String sql = "UPDATE students" +
//		"SET name = 'vikas' WHERE mobile in (92934348)";
//		st.executeUpdate(sql); //update the table base on the insert
//		System.out.println("Record Modified Successfully....");
		
		//delete a record
//		String sql = "DELETE FROM students " +
//		"WHERE mobile = 96106891 ";
//		st.executeUpdate(sql);
//		System.out.println("Record Deleted from table sucessfully..");
		
		//Retrieve Data from Table
	String sql = "SELECT mobile,name,email FROM students";
				ResultSet rs = st.executeQuery(sql);
				
				//STEP 5 : Extract data from result set
				
				System.out.println("\n\n");
				System.out.println("Mobile \t\t" + "Name"+ "\t\t" + "Email" );
				System.out.println("=====================================================");
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				}
		
		
//		//create table
//		String sql = "Create TABLE employee"+
//					 "(id INTEGER not NULL,"
//					 +"password VARCHAR(25),"+
//					 "dob datetime,"+
//					 "PRIMARY KEY (id))";
//		st.executeUpdate(sql);
//		System.out.println("Created table in given database....");
				
	}
	
}
