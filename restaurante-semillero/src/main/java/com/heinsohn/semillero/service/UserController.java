package com.heinsohn.semillero.service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heinsohn.semillero.dto.UsuarioDTO;
import com.heinsohn.semillero.repository.UsuariariosRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("usuarios")
public class UserController {

	private UsuariariosRepository uRepository;
	
	public UserController(UsuariariosRepository uRepository) {
		this.uRepository = uRepository;
	}
	
	/**
	 * Metodo que retorna los datos de los usuarios
	 * por medio del metodo HTTP.GET
	 * 
	 * @return String
	 */
	@ApiOperation(value = "Metodo que retorna los datos de los usuarios por medio del metodo HTTP.GET",
				  response = Integer.class, tags = "consultarUsuarios")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Exitoso, funcion!"),
		@ApiResponse(code = 401, message = "No autorizado, pilas!"),
		@ApiResponse(code = 403, message = "No tienes permiso!"),
		@ApiResponse(code = 404, message = "No se encontro lo que buscabas!")
	})
	@GetMapping
	public List<UsuarioDTO> getUsuario() {
		return (List<UsuarioDTO>) uRepository.findAll();
	}
	
	/**
	 * Metodo que permite registrar los datos de un usuario
	 * por medio del metodo HTTP.POST
	 * 
	 * @return String
	 */
	@PostMapping
	public String crearUsuario(UsuarioDTO usuario) {
		
		uRepository.save(usuario);
		
		return "Se creo el usuario";
	}
	
	/**
	 * Metodo que permite actualizar los datos de un usuario
	 * por medio del metodo HTTP.PUT
	 * 
	 * @return String
	 */
	@PutMapping
	public String actualizarUsuario(UsuarioDTO usuario) {
		uRepository.save(usuario);
		return "Se actualizo el usuario!";
	}
	
	/**
	 * Este metodo permite eliminar la informaci??n
	 * de un usuario especifico
	 * 
	 * @return String
	 */
	@DeleteMapping
	public String eliminarUsuario(int idUsuario) {
		
		uRepository.deleteById(idUsuario);
		return "Se elimino el usuario exitosamente!";
	}
	
}
