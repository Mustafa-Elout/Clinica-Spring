package com.Clinica.servicio;

import java.util.List;

import com.Clinica.modelo.Menu;

public interface IMenuServicio extends ICRUD<Menu, Integer> {

	List<Menu> listarMenuPorUsuario(String nombre);
	
}
