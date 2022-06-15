package com.Clinica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinica.modelo.Especialidad;
import com.Clinica.repo.IEspecialidad;
import com.Clinica.repo.IGenericRepo;
import com.Clinica.servicio.IEspecialidadServicio;

@Service
public class EspecialidadServicioImpl extends CRUDImp<Especialidad, Integer> implements IEspecialidadServicio {

	@Autowired
	private IEspecialidad repo;
	
	@Override
	protected IGenericRepo<Especialidad, Integer> getRepo(){
		return repo;
	}
	
}
