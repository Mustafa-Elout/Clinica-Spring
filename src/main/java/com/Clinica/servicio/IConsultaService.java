package com.Clinica.servicio;

import java.util.List;

import com.Clinica.dto.ConsultaFechaDTO;
import com.Clinica.modelo.Analitica;
import com.Clinica.modelo.Consulta;

public interface IConsultaService extends ICRUD<Consulta, Integer> {

	Consulta registrarTransaccional(Consulta consulta, List<Analitica> examenes) throws Exception;

	List<ConsultaFechaDTO> listarResumen();

	byte[] generarReporte();

}
