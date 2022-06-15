package com.Clinica.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Clinica.modelo.ConsultaAnalitica;

public interface IConsultaExamen extends IGenericRepo<ConsultaAnalitica, Integer>{
	 
    //@Transactional
    @Modifying
    @Query(value = "INSERT INTO consulta_analitica(id_consulta, id_analitica) VALUES (:idConsulta, :idExamen)", nativeQuery = true)
    Integer registrar(@Param("idConsulta") Integer idConsulta, @Param("idExamen") Integer idExamen);

    @Query("FROM ConsultaAnalitica ce where ce.consulta.idConsulta = :idConsulta")
    List<ConsultaAnalitica> listarExamenesPorConsulta(@Param("idConsulta") Integer idconsulta);
    //[consulta, examen]
    //[consulta, examen]
    //[consulta, examen]
 

}