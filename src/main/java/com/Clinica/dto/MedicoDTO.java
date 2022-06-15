package com.Clinica.dto;

import javax.validation.constraints.NotNull;

public class MedicoDTO {

	private Integer idMedico;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private String cedula;
	
	@NotNull
	private String fotoUrl;
	
	@NotNull
	private String nombres;
	
	public MedicoDTO() {
		// TODO Auto-generated constructor stub
	}

	public MedicoDTO(Integer idMedico, @NotNull String apellidos, @NotNull String cedula, @NotNull String fotoUrl,
			@NotNull String nombres) {
		super();
		this.idMedico = idMedico;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.fotoUrl = fotoUrl;
		this.nombres = nombres;
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "MedicoDTO [idMedico=" + idMedico + ", apellidos=" + apellidos + ", cedula=" + cedula + ", fotoUrl="
				+ fotoUrl + ", nombres=" + nombres + "]";
	}
	
}
