package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.IPeliculasDAO;
import com.c4.ud25.dto.Pelicula;

@Service
public class PeliculasServiceImpl implements IPeliculasService{

	@Autowired
	IPeliculasDAO iPeliculasDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long id) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		// TODO Auto-generated method stub
		iPeliculasDAO.deleteById(id);
	}

}
