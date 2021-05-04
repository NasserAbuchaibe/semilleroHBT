package com.heinsonh.semillero.javaquerysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Configura y crea la conexion a la DB
 * 
 * @author Nasser Abuchaibe
 *
 */

public class ConnectSqlDb {
	
	public static Connection connectDatabase() {
		
		
		String dbURL = "jdbc:mysql://localhost:3306/semillerohbt";
		String username = "root";
		String password = "kalodiz11";
		 
		try {
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        return conn;
		    }
		} catch (SQLException ex1) {
		    ex1.printStackTrace();
		}
		return null ;
	}
}
