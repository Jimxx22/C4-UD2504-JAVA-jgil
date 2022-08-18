package com.c4.ud25.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Long codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="calificacion_Edad")
	private String calificacion_Edad;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Sala> salas;
	
	public Pelicula() {
	}

	public Pelicula(String nombre, String calificacion_Edad) {
		this.nombre = nombre;
		this.calificacion_Edad = calificacion_Edad;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalificacion_Edad() {
		return calificacion_Edad;
	}

	public void setCalificacion_Edad(String calificacion_Edad) {
		this.calificacion_Edad = calificacion_Edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacion_Edad=" + calificacion_Edad
				+ ", salas=" + salas + "]";
	}
	
}
