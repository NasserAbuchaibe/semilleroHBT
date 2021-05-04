package com.heinsonh.semillero.javaquerysql;

import java.sql.*;
import java.util.*;

/**
 * Desde java, muestre los nombres de las personas en mayúscula
 * cuya fecha de nacimiento sea mayor a 01/01/2010
 * 
 * @author Nasser Abuchaibe
 *
 */


public class QueryForDate implements IQuerySql {

	/**
	 * Estableciendo conexion con  la DB
	 */
	Connection conn = ConnectSqlDb.connectDatabase();
	
	String nameBirth;
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
		ResultSet rs = s.executeQuery ("SELECT UPPER(nombres), fecha_nacimiento FROM semillerohbt.persona WHERE fecha_nacimiento > '2010-01-01 00:00:00'");
		while (rs.next())
		{
			String name = rs.getString (1);
			String birthDate = rs.getString (2);
			nameBirth = name + " "+ birthDate;
			listname.add(nameBirth);
			
		}
		}catch (SQLException ex1) {
		    ex1.printStackTrace();
		
		
	}
		return listname;

}
}
