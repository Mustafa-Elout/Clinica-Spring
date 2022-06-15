package com.Clinica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinica.modelo.Medico;
import com.Clinica.repo.IGenericRepo;
import com.Clinica.repo.IMedico;
import com.Clinica.servicio.IMedicoServicio;

@Service
public class MedicoServicioImp extends CRUDImp<Medico, Integer> implements IMedicoServicio {

	@Autowired
	private IMedico repo;
	
	@Override
	protected IGenericRepo<Medico, Integer> getRepo(){
		return repo;
	}

}
