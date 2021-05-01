/**
 * 
 */
package com.heinsohn.semillero.AppPrecio;
import java.util.*;

/**
 * 
 * @author Nasser Abuchaibe
 *
 */
public class PrecioFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int NumeroArticulos, cont, totalCompra, precioArticulo, may, precioArtMay, artMayor; 
        double pagar, tax;
 
        System.out.print("Digite numero de articulos: ");
        NumeroArticulos = input.nextInt();
 
        totalCompra = 0;
        may = 0;
        artMayor = 0;
        precioArtMay = 0;
        pagar = 0;
 
        for(cont = 1; cont <= NumeroArticulos; cont++)
        {
            System.out.print("Digite el precio del articulo " + cont + ": ");
            precioArticulo = input.nextInt();
            if (precioArticulo > may) {
            	may = precioArticulo;
            	precioArtMay = precioArticulo;
            	artMayor = cont;
            }
 
            totalCompra = totalCompra + precioArticulo;
        }
        System.out.println();
        System.out.println("El articulo " + artMayor + " con precio de $" + may + " es el de mayor valor");
        System.out.println("Valor neto compra: $" + totalCompra);
        
        if (totalCompra > 300) {
        	tax = totalCompra * 0.1;
        	pagar = totalCompra + tax;
        	System.out.println("+ Impuesto del 10%: $" + tax);
        	System.out.println("Valor total compra: $" + pagar);
        } else {
        	tax = totalCompra * 0.07;
        	pagar = totalCompra + tax;
        	System.out.println("+ Impuesto del 7%: $" + tax);
        	System.out.println("Valor total compra: $" + pagar);
        }
        input.close();
        
	}

}
