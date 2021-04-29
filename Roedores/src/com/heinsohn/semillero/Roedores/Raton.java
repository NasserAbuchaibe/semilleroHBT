/**
 * 
 */
package com.heinsohn.semillero.Roedores;

/**
 * @author Windows 10
 *
 */
public class Raton implements IRoedores {

	private String tipo;
	
	private String nombre;

	public Raton(String tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	@Override
	public String obeterTipoRoedor() {
		return "Soy un roedor tipo " + tipo;
	}
	
	@Override
	public String obeterNombreRoedor() {
		return "Mi  nombre es " + nombre;
	}
	
	@Override
	public String comer() {
		return "Yo como de todo";
	}
	
	@Override
	public String correr() {
		return "Yo corro muy rapido";
	}
	

}
