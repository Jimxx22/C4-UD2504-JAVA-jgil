package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Sala;

public interface ISalasService {
	//Metodos del CRUD
	public List<Sala> listarSalas(); //Listar All 
	
	public Sala guardarSala(Sala sala);	//Guarda una sala CREATE
	
	public Sala salaXID(Long id); //Leer datos de una sala READ
	
	public Sala actualizarSala(Sala articulo); //Actualiza datos de una sala UPDATE
	
	public void eliminarSala(Long id);// Elimina la sala DELETE
}
