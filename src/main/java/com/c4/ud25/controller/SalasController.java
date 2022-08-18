package com.c4.ud25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Sala;
import com.c4.ud25.service.SalasServicesImpl;
@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServicesImpl articulosServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarArticulos(){
		return articulosServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Sala guardarArticulo(@RequestBody Sala sala) {
		return articulosServiceImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{id}")
	public Sala ArticuloXId(@PathVariable(name="id") Long id) {
		
		Sala sala = new Sala();
		
		sala=articulosServiceImpl.salaXID(id);
		
		return sala;
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarArticulo(@PathVariable(name="id") Long id, @RequestBody Sala sala) {
		
		Sala salaSel = new Sala();
		Sala salaAct = new Sala();
		
		salaSel=articulosServiceImpl.salaXID(id);
		
		salaSel.setNombre(sala.getNombre());
		
		salaAct= articulosServiceImpl.actualizarSala(salaSel);
		
		return salaAct;
		
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarSala(id);
	}
}
