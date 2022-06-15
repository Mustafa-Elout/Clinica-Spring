package com.Clinica.controlador;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Clinica.dto.MedicoDTO;
import com.Clinica.exception.ModeloNotFoundException;
import com.Clinica.modelo.Medico;
import com.Clinica.servicio.IMedicoServicio;

@RestController
@RequestMapping("/medicos")
//@CrossOrigin(origins="http://localhost:4200")
public class MedicoControlador {

	@Autowired
	private IMedicoServicio servicio; 
	
	@Autowired
	private ModelMapper mapper;
	
	// @PreAuthorize("hasAuthority('ADMIN')")
	@PreAuthorize("@authServiceImp.tieneAcceso('listar')")
	@GetMapping
	public ResponseEntity<List<MedicoDTO>> listar() throws Exception{
		List<MedicoDTO> lista = servicio.listar().stream().map(x -> mapper.map(x,  MedicoDTO.class)).collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MedicoDTO> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Medico objeto = servicio.listarPorId(id);
		if (objeto == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		MedicoDTO dtoResponse = mapper.map(objeto, MedicoDTO.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody MedicoDTO m) throws Exception{
		Medico objeto = mapper.map(m,  Medico.class);
		Medico obj = servicio.registrar(objeto);
		MedicoDTO dtoResponse = mapper.map(obj, MedicoDTO.class);
		
		//Bloque de localizacion formar una url localhost:8080/pacientes/1
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dtoResponse.getIdMedico()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<MedicoDTO> modificar(@Valid @RequestBody MedicoDTO m) throws Exception{
		Medico pacienteRequest = mapper.map(m, Medico.class);
		Medico  pacienteConsultado = servicio.listarPorId(pacienteRequest.getIdMedico());
		if (pacienteConsultado == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + pacienteRequest.getIdMedico());
		}
		Medico BBDD = servicio.modificar(pacienteRequest);
		MedicoDTO pacienteResponse = mapper.map(BBDD, MedicoDTO.class);
		return new ResponseEntity<>(pacienteResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) throws Exception{
		Medico objeto = servicio.listarPorId(id);
		if (objeto == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		servicio.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	}
}
