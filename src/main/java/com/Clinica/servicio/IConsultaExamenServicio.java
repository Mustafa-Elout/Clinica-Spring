package com.Clinica.servicio;

import java.util.List;

import com.Clinica.modelo.ConsultaAnalitica;

public interface IConsultaExamenServicio {
	 
    List<ConsultaAnalitica> listarExamenesPorConsulta(Integer idconsulta);
 
}