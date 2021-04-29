/**
 * 
 */
package com.heinsohn.semillero.Roedores;

import java.util.*;


/**
 * @author Windows 10
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<IRoedores> roedores = new ArrayList<>();
		
		IRoedores raton = new Raton("raton", "Mikey");
		
		IRoedores gerbo = new Gerbo("gerbo", "tony");
		
		
		roedores.add(raton);
		roedores.add(gerbo);
		
		for(IRoedores x : roedores) {
			System.out.println( x.obeterTipoRoedor());
			System.out.println( x.obeterNombreRoedor());
			System.out.println( x.comer());
			System.out.println( x.correr());
		}
		}
	

}