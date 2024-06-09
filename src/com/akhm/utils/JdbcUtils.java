package com.akhm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	public JdbcUtils()
	{
		
	}
	
	private static Connection con;
	
	static 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3309/student_db","root","root");
			
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getconnection() {
		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3309/jdbc_servelet_db", "root", "root");
				
			} catch (ClassNotFoundException confe) {
				confe.printStackTrace();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			} catch (Exception exp) {
				exp.printStackTrace();
			}

		}

		return con;

	}
	public static void cloaseStatement(Statement st) {
		if(st!=null)
		{
			try {
				st.close();
				
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public static void closeResultSet(ResultSet rs)
	{
		if(rs!=null)
		{
			try
			{
				rs.close();
			}
			catch(SQLException sql)
			{
				sql.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}
