package com.c4.ud25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c4.ud25.dto.Pelicula;

public interface IPeliculasDAO extends JpaRepository<Pelicula, Long>{

}
