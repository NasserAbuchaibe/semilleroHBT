package com.heinsonh.semillero.javaquerysql;

import java.sql.*;
import java.util.*;

/**
 * Desde JAVA, muestre una lista de los nombres y apellidos de las personas
 * concatenados, con la primera letra en mayúscula, además, muestre la longitud
 * total de los apellidos.
 * 
 * @author Nasser Abuchaibe
 *
 */


public class QueryForName implements IQuerySql {

	/**
	 * Estableciendo conexion con  la DB
	 */
	Connection conn = ConnectSqlDb.connectDatabase();
	String fullName;
	List<String> listname = new ArrayList<>();
	int len;
	
	@Override
	public List<String> getQuery() {
		// TODO Auto-generated method stub
		
		try {
		/**
		 * Realizando consulta a la DB
		 */
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery ("select nombres, apellidos from persona");
		while (rs.next())
		{
			String name = rs.getString (1);
			String lastName = rs.getString (2);
			len = lastName.length();
			name.toUpperCase().charAt(0);
			lastName.toUpperCase().charAt(0);
			fullName = name + " "+ lastName + ",  longitud del apellido: " + len ;
			listname.add(fullName);
			
		}
		}catch (SQLException ex1) {
		    ex1.printStackTrace();
		
		
	}
		return listname;

}
}
