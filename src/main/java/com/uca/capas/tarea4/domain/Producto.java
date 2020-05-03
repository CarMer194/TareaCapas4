package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(min=12,max=12,message="El valor debe contener solamente 12 digitos")
	@Pattern(regexp = "[0-9]+", message="El valor debe contener solamente 12 digitos")
	private String codigo;
	
	@Size(min=1,max=100)
	private String nombre;
	@Size(min=1,max=100)
	private String marca;
	@Size(min=1,max=500,message="el valor debe contener entre 1 y 500 caractenres")
	private String descripcion;
	@Pattern(regexp = "[0-9]+",message="El valor debe ser numeros exactos")
	private String existencia;
	@Pattern(regexp = "[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]",message="La fecha debe ser ingresada con el formato dd/mm/aaaa")
	private String fechaIngreso;
	public Producto() {
		super();
	}
	
	

	public Producto(
			@Size(min = 12, max = 12, message = "El valor debe contener solamente 12 digitos") @Pattern(regexp = "[0-9]+", message = "El valor debe contener solamente 12 digitos") String codigo,
			@Size(min = 1, max = 100) String nombre, @Size(min = 1, max = 100) String marca,
			@Size(min = 1, max = 500, message = "el valor debe contener entre 1 y 500 caractenres") String descripcion,
			@Pattern(regexp = "[0-9]+", message = "El valor debe ser numeros exactos") String existencia,
			@Pattern(regexp = "[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]", message = "La fecha debe ser ingresada con el formato dd/mm/aaaa") String fechaIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencia = existencia;
		this.fechaIngreso = fechaIngreso;
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
}
