package com.Clinica.controlador;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Clinica.dto.MenuDTO;
import com.Clinica.modelo.Menu;
import com.Clinica.servicio.IMenuServicio;

@RestController
@RequestMapping("/menus")
public class MenuControlador {
	
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private IMenuServicio service;
    
    @GetMapping
    public ResponseEntity<List<MenuDTO>> listar() throws Exception {
        List<Menu> menus = new ArrayList<>();
        menus = service.listar();
        List<MenuDTO> menusDTO = modelMapper.map(menus, new TypeToken<List<MenuDTO>>() {}.getType());
        return new ResponseEntity<>(menusDTO, HttpStatus.OK);
    }
    
    @PostMapping("/usuario")
    public ResponseEntity<List<MenuDTO>> listar(@RequestBody String nombre) throws Exception {
        List<Menu> menus = new ArrayList<>();
        // Authentication usuarioLogueado=
        // SecurityContextHolder.getContext().getAuthentication(); //menus
        // service.listarMenuPorUsuario(usuarioLogueado.getName()); List<MenuDTO>
        // menusDTO modelMapper.map (menus, new TypeToken<List<MenuDTO>>()
        // ().getType());
        menus = service.listarMenuPorUsuario(nombre);
        List<MenuDTO> menusDTO = modelMapper.map(menus, new TypeToken<List<MenuDTO>>() {}.getType());
        return new ResponseEntity<>(menusDTO, HttpStatus.OK);
    }
}