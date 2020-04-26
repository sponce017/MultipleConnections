package com.example.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class MultipleConnections {
	
	public static void main(String[] args) throws Exception {
	      //Registering the Driver
	      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	      //Getting the connection
	      String oracleUrl = "jdbc:oracle:thin:@localhost:1521/hr";
	      Connection oracleCon = DriverManager.getConnection(oracleUrl, "hr", "root");
	      System.out.println("oracleConn=" + oracleCon);
	      
	      //Registering the Driver
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/";
	      Connection mysqlCon = DriverManager.getConnection(mysqlUrl, "root", "password");
	      System.out.println("mysqlConn=" + mysqlCon);
	   }	
}
