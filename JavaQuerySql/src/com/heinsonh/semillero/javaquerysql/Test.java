package com.heinsonh.semillero.javaquerysql;

import java.util.List;
/**
 * 
 * @author Nasser Abuchaibe
 * 
 * Testeando las clases:
 * QueryForName()
 * QueryForDate()
 * QueryAvgSalary()
 * QueryAvgGroup()
 * 
 */


public class Test {

	
	public static void main(String[] args) {
		// Punto 1 (Nombre + Apellido + longitud Apellido)
		System.out.println("Punto 1.");
		System.out.println("Desde la tabla personas mostrar nombres + apellidos capitalizados + longitud apellido");
		System.out.println("");
		// TODO Auto-generated method stub
		IQuerySql query = new QueryForName();
		List<String> qLen = query.getQuery();
		for(String names : qLen) {
			System.out.println(names);
		}
		System.out.println("");
		
		// Punto 2 (Nombre mayuscula donde fecha > 01/01/2010)
		System.out.println("Punto 2.");
		System.out.println("Desde la tabla personas mostrar nombres en mayusculas donde la fecha de nacimiento > 01/01/2010");
		System.out.println("");
		// TODO Auto-generated method stub
		IQuerySql queryDate = new QueryForDate();
		List<String> qDate = queryDate.getQuery();
		for(String names : qDate) {
			System.out.println(names);
		}
		System.out.println("");
		
		// Punto 3 (salario promedio (AVG) de las personas agrupadas por sexo)
		System.out.println("Punto 3.");
		System.out.println("Desde la tabla personas mostrar salario promedio (AVG) de las personas agrupadas por sexo.");
		System.out.println("");
		// TODO Auto-generated method stub
		IQuerySql queryAvg = new QueryAvgSalary();
		List<String> qAvg = queryAvg.getQuery();
		for(String avg : qAvg) {
			System.out.println(avg);
		}
		System.out.println("");
				
		// Punto 4 (Nombre mayuscula donde fecha > 01/01/2010)
		System.out.println("Punto 4.");
		System.out.println("Del grupo anterior excluya los grupos cuyo promedio es menor a 300000");
		System.out.println("");
		// TODO Auto-generated method stub
		IQuerySql queryAvgGr = new QueryAvgGroup();
		List<String> qAvgr = queryAvgGr.getQuery();
		for(String avg : qAvgr) {
			System.out.println(avg);
						

	}
	}
}
