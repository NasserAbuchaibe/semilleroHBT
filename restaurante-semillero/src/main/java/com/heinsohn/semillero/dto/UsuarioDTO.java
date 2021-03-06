package com.heinsohn.semillero.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="usuario")
@Entity
public class UsuarioDTO {
	

	public UsuarioDTO() {
		super();
	}

	@Id
	private int id;
	
	private String nombre;
	
	private String login;

	private String password;
	
	private String estado;
	
	public UsuarioDTO(int id, String nombre, String login, String password, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.estado = estado;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
