package org.anish.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
	public static Connection getDBConnection(String db) throws Exception
	{
		Connection conn =null;
		try{
			  Class.forName("com.mysql.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalcar_db1","root",""); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

}

