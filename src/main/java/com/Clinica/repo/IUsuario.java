package com.Clinica.repo;

import com.Clinica.modelo.Usuario;

public interface IUsuario extends IGenericRepo<Usuario, Integer> {

	Usuario findOneByUsername(String username);
	
}
