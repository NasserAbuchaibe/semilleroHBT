package com.heinsonh.semillero.javaquerysql;

import java.sql.*;
import java.util.*;

/**
 * Desde JAVA, muestre una lista de los nombres y apellidos de las personas
 * concatenados, con la primera letra en may?scula, adem?s, muestre la longitud
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
		ResultSet rs = s.executeQuery ("SELECT CONCAT(UPPER(LEFT(nombres, 1)), LOWER(SUBSTRING(nombres, 2))), CONCAT(UPPER(LEFT(apellidos, 1)), LOWER(SUBSTRING(apellidos, 2))) FROM semillerohbt.persona;");
		while (rs.next())
		{
			String name = rs.getString (1);
			String lastName = rs.getString (2);
			len = lastName.length();
			fullName = name + " "+ lastName + ",  longitud del apellido: " + len ;
			listname.add(fullName);
			
		}
		}catch (SQLException ex1) {
		    ex1.printStackTrace();
		
		
	}
		return listname;

}
}
