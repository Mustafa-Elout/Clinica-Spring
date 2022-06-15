package com.Clinica.dto;

import java.util.List;

import com.Clinica.modelo.Rol;

public class MenuDTO {
	
	 private Integer idMenu;
	 
	 private String icono;
	 
	 private String nombre;
	 
	 private String url;
	 
	 private List<Rol> roles;
	 
	 public MenuDTO() {
		// TODO Auto-generated constructor stub
	}

	public MenuDTO(Integer idMenu, String icono, String nombre, String url, List<Rol> roles) {
		super();
		this.idMenu = idMenu;
		this.icono = icono;
		this.nombre = nombre;
		this.url = url;
		this.roles = roles;
	}

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "MenuDTO [idMenu=" + idMenu + ", icono=" + icono + ", nombre=" + nombre + ", url=" + url + ", roles="
				+ roles + "]";
	}
	 
}
