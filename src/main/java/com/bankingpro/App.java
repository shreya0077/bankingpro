package com.bankingpro;

import java.sql.*;

/**
 * JDBC SAMPLE PROGRAM BY #shreyachandne
 * 
 */
public class App
{
	public static void main(String args[]) throws Exception
	{
		
		//load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create the object to get Connection
		//url to db,username,password
		String url="jdbc:mysql://localhost:3306/bankingpro";
		String username="root";
		String password="7498237567";
		
		//get connection to the db 
		Connection sc=DriverManager.getConnection(url,username,password);
		// a statement to execute a query
		Statement st=sc.createStatement(); 
		//execution of query and storing the response in resultset rs
		ResultSet rs=st.executeQuery("select * from customer");
		//checking the response
		
		System.out.println("cusid\tcusname\tcuspin\tcusamount\n");
		while(rs.next())
		{
			String Customerdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4);
			
			System.out.println(Customerdata);
			//reading the mobile name from response
			//printing mobile name
		}
		//closing the connection
		
		sc.close();
	}
		}    	