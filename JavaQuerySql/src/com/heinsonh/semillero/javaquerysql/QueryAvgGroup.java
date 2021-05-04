package com.heinsonh.semillero.javaquerysql;


import java.sql.*;
import java.util.*;

/**
 * 
 * Desde java, muestre el salario promedio (AVG)
 * de las personas agrupadas por sexo
 * excluyendo los grupos cuyo promedio es menor a 300000
 * 
 * @author Nasser Abuchaibe
 *
 */


public class QueryAvgGroup implements IQuerySql {

	/**
	 * Estableciendo conexion con  la DB
	 */
	Connection conn = ConnectSqlDb.connectDatabase();
	
	String avgSalary;
	List<String> listAvg = new ArrayList<>();
	int len;
	
	@Override
	public List<String> getQuery() {
		// TODO Auto-generated method stub
		
		try {
		/**
		 * Realizando consulta a la DB
		 */
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery ("SELECT sexo, AVG(salario) pro FROM semillerohbt.persona group by sexo  HAVING pro > 300000");
		while (rs.next())
		{
			String sex = rs.getString (1);
			String avg = rs.getString (2);
			avgSalary = sex + " "+ avg;
			listAvg.add(avgSalary);
			
		}
		}catch (SQLException ex1) {
		    ex1.printStackTrace();
		
		
	}
		return listAvg;

}
}
