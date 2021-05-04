package com.heinsonh.semillero.javaquerysql;

import java.sql.*;
import java.util.*;

/**
 * 
 * Desde java, muestre el salario promedio (AVG)
 * de las personas agrupadas por sexo.
 * 
 * @author Nasser Abuchaibe
 *
 */


public class QueryAvgSalary implements IQuerySql {

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
		ResultSet rs = s.executeQuery ("SELECT sexo, AVG(salario) FROM semillerohbt.persona group by sexo;");
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
