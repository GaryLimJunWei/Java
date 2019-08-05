package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {

	public static Connection prepareConnection()
	{
		Connection ref=null;
		try 
		{
		//database URL
		//3306 is the default port for mysql
		String connectionURL = "jdbc:mysql://localhost:3306/clt6";
		
		//database credentials
		String uname="root";
		String pw1="root";
		
	
			
			//Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//open a Connection
			ref = DriverManager.getConnection(connectionURL,uname,pw1);
			
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		return ref;
	}
	
}
