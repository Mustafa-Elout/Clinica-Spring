package com.Clinica.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class ConsultaListaExamenDTO {

	@NotNull
	private ConsultaDTO consulta;
	
	@NotNull
    private List<AnaliticaDTO> lstExamen;
 
    public ConsultaDTO getConsulta() {
        return consulta;
    }
 
    public void setConsulta(ConsultaDTO consulta) {
        this.consulta = consulta;
    }
 
    public List<AnaliticaDTO> getLstExamen() {
        return lstExamen;
    }
 
    public void setLstExamen(List<AnaliticaDTO> lstExamen) {
        this.lstExamen = lstExamen;
    }
 
    @Override
    public String toString() {
        return "ConsultaListaExamenDTO [consulta=" + consulta + ", lstExamen=" + lstExamen + "]";
    }
	
}
