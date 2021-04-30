package com.heinsohn.semillero.Fecha;

public class StringFechas {

	public StringFechas() {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			String fecha = "28/04/2021";
			
			String day = fecha.substring(0,2);
			String month = fecha.substring(3,5);
			String year = fecha.substring(6,10);
			System.out.println("Formato de fecha original 28/04/2021");
			System.out.println("Nuevo Formato de fecha:");
			System.out.println(day + " " + month + " " + year);


	}

}
