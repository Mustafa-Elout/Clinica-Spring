package com.Clinica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinica.modelo.Paciente;
import com.Clinica.repo.IGenericRepo;
import com.Clinica.repo.IPaciente;
import com.Clinica.servicio.IPacienteServicio;

@Service
public class PacienteServicioImp extends CRUDImp<Paciente, Integer> implements IPacienteServicio{

	@Autowired
	private IPaciente repo;
	
	@Override
	protected IGenericRepo<Paciente, Integer> getRepo(){
		return repo;
	}

}
