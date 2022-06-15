package com.Clinica.dto;

import javax.validation.constraints.NotNull;

public class EspecialidadDTO {

	private Integer idEspecialidad;
	
	@NotNull
	private String descripcion;
	
	@NotNull
	private String nombre;
	
	public EspecialidadDTO() {
		// TODO Auto-generated constructor stub
	}

	public EspecialidadDTO(Integer idEspecialidad, @NotNull String descripcion, @NotNull String nombre) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "EspecialidadDTO [idEspecialidad=" + idEspecialidad + ", descripcion=" + descripcion + ", nombre="
				+ nombre + "]";
	}
	
}
