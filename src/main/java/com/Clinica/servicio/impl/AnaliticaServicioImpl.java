package com.Clinica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinica.modelo.Analitica;
import com.Clinica.repo.IAnalitica;
import com.Clinica.repo.IGenericRepo;
import com.Clinica.servicio.IAnaliticaServicio;

@Service
public class AnaliticaServicioImpl extends CRUDImp<Analitica, Integer> implements IAnaliticaServicio {

	@Autowired
	private IAnalitica repo;

	@Override
	protected IGenericRepo<Analitica, Integer> getRepo(){
		return repo;
	}
	
	
	
}
