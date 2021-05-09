package com.heinsohn.semillero.service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UserController {

	/**
	 * Metodo que retorma datos del usurio
	 * por medio del metodo http GET
	 * @return String
	 */
	@GetMapping
	public String getUsuario(String nombre) {
		return "Usuario " +  nombre + " creado.";
	}
	
	/**
	 * Metodo que crea un nuevo usuario
	 * por medio del metodo http POST
	 * @return String
	 */
	@PostMapping
	public String crearUsuario() {
		return "Usuario creado";
	}
	
	/**
	 * Metodo que actualiza un usuario
	 * por medio del metodo http PUT
	 * @return String
	 */
	@PutMapping
	public String actualizarUsuario( ) {
		return "Usuario actualizado";
	}
	
	/**
	 * Metodo que elimina un usuario
	 * por medio del metodo http DELETE
	 * @return String
	 */
	@DeleteMapping
	public String deleteUsuario( ) {
		return "Usuario borrado";
	}
}
