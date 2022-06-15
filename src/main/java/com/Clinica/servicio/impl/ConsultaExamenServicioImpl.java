package com.Clinica.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinica.modelo.ConsultaAnalitica;
import com.Clinica.repo.IConsultaExamen;
import com.Clinica.servicio.IConsultaExamenServicio;

@Service
public class ConsultaExamenServicioImpl implements IConsultaExamenServicio {
 
    @Autowired
    private IConsultaExamen repo;

    @Override
    public List<ConsultaAnalitica> listarExamenesPorConsulta(Integer idconsulta) {
        return repo.listarExamenesPorConsulta(idconsulta);
    }
}