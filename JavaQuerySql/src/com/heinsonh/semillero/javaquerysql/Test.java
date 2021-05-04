package com.heinsonh.semillero.javaquerysql;

import java.util.List;
/**
 * 
 * @author Nasser Abuchaibe
 * 
 * Testeando las clases:
 * QueryForName()
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
		List<String> x = query.getQuery();
		for(String names : x) {
			System.out.println(names);
		}
	}

}
