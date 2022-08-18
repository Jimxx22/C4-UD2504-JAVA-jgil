package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Pelicula;

public interface IPeliculasService {
	
	//Metodos del CRUD
	public List<Pelicula> listarPeliculas(); //Listar All 
	
	public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda un cliente CREATE
	
	public Pelicula peliculaXID(Long id); //Leer datos de un cliente READ
	
	public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos del cliente UPDATE
	
	public void eliminarPelicula(Long id);// Elimina el cliente DELETE

}
