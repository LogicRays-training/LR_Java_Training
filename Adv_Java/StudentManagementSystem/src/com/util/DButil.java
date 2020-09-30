package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
	private static Connection con = null;
	

	// For mySQL use
	private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/javalr_preet";
	private static final String USER = "root";
	private static final String PASSWORD = null;
	
	/*
	// For Oracle use
	private static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "root";
	private static final String PASSWORD = null;
	
	*/
	
	public static Connection getConnection()
	{
		if(con==null)
		{
			try
			{
				
				Class.forName(DRIVER_NAME);  
				con = DriverManager.getConnection(URL, USER, PASSWORD);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static void closeConnection()
	{
		try
		{
			if(con != null && !con.isClosed())
			{
				con.close();
			}
			con = null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
