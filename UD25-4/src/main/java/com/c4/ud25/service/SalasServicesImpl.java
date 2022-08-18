package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.ISalasDAO;
import com.c4.ud25.dto.Sala;

@Service
public class SalasServicesImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Sala> listarSalas() {
		// TODO Auto-generated method stub
		return iSalasDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public Sala salaXID(Long id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		// TODO Auto-generated method stub
		iSalasDAO.deleteById(id);
	}

}
