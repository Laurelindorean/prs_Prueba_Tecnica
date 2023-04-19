/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IJuegoDAO;
import com.crud.h2.dto.Juego;

/**
 * @author Palmira
 *
 */
@Service
public class JuegoServiceImp implements IJuegoService{
	
	@Autowired
	IJuegoDAO iJuegoDAO;

	@Override
	public List<Juego> listarJuegos() {
		return iJuegoDAO.findAll();
	}

	@Override
	public Juego juegoXID(int id) {
		return iJuegoDAO.findById(id).get();
	}

	@Override
	public void eliminarJuego(int id) {
		iJuegoDAO.deleteById(id);
	}

}
