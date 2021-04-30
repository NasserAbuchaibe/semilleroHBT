package com.heinsonh.semillero.AddArray;

public class AddArreglo {

	public AddArreglo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] array = new int[]{11,15,17,23,28};
				int sum = 0;
				// Suma elementos del array
				for (int cont = 0; cont < array.length; cont++)
				{
					sum = sum + array[cont];
					
				}
				// Imprime Array
				System.out.print("[");
				for (int cont = 0; cont < array.length; cont++)
				{
					System.out.print(array[cont] + " ");
				}
				System.out.print("]");
				
				System.out.println();
				System.out.println("La sumatoria de los valores del array es: " + sum);	

	}

}
