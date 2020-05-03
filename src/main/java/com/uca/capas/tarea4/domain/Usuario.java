package com.uca.capas.tarea4.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Usuario {
	@Size(min=1,max=25)
	private String usuario;
	@NotEmpty
	private String contrsenia;
	
	public Usuario(String usuario, String contrsenia) {
		super();
		this.usuario = usuario;
		this.contrsenia = contrsenia;
	}
	
	public Usuario() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrsenia() {
		return contrsenia;
	}
	public void setContrsenia(String contrsenia) {
		this.contrsenia = contrsenia;
	}
	
	

}
