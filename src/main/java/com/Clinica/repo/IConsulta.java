package com.Clinica.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.Clinica.modelo.Consulta;

public interface IConsulta extends IGenericRepo<Consulta, Integer> {

	@Query(value = "select * from TABLA_CONSULTASPORDIA()", nativeQuery = true)
	List<Object[]> getConsultas();

}
