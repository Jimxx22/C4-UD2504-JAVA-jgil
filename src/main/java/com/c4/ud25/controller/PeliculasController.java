package com.c4.ud25.controller;

import java.io.Console;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Pelicula;
import com.c4.ud25.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarFabricantes(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarFabricante(@RequestBody Pelicula pelicula) {
		return peliculasServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula fabricanteXId(@PathVariable(name="id") Long id) {
		
		Pelicula pelicula = new Pelicula();
		
		pelicula=peliculasServiceImpl.peliculaXID(id);
		
		return pelicula;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarFaricante(@PathVariable(name="id") Long id, @RequestBody Pelicula pelicula) {
		
		Pelicula peliculaSel = new Pelicula();
		Pelicula peliculaAct = new Pelicula();
		
		peliculaSel=peliculasServiceImpl.peliculaXID(id);
		
		peliculaSel.setNombre(pelicula.getNombre());
		peliculaSel.setCalificacion_Edad(pelicula.getCalificacion_Edad());
		
		peliculaAct= peliculasServiceImpl.actualizarPelicula(peliculaSel);
		
		return peliculaAct;
		
	}
	
	@DeleteMapping("/peliculas/{id}")
	public String eliminarFabricante(@PathVariable(name="id")Long id) {
				
		try {
			peliculasServiceImpl.eliminarPelicula(id);
			return "Pelicula borrada";
		}catch (Exception e) {
			return "ERROR: no puedes eliminar uns Pelicula sin haver eliminado sus Salas antes.";
		}
		
	}
	
}
