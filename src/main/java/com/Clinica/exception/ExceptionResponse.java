package com.Clinica.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	
	private LocalDateTime fechas;
	private String mensaje;
	private String detalles;
	
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}
		
	public ExceptionResponse(LocalDateTime fechas, String mensaje, String detalles) {
		super();
		this.fechas = fechas;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	public LocalDateTime getFechas() {
		return fechas;
	}
	
	public void setFechas(LocalDateTime fechas) {
		this.fechas = fechas;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getDetalles() {
		return detalles;
	}
	
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
}
