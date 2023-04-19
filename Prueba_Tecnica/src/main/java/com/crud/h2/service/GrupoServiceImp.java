/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IGrupoDAO;
import com.crud.h2.dto.Grupo;
import com.crud.h2.dto.Juego;

/**
 * @author Palmira
 *
 */
@Service
public class GrupoServiceImp implements IGrupoService{
	
	@Autowired
	IGrupoDAO iGrupoDAO;

	@Override
	public List<Grupo> listarGrupo() {
		return iGrupoDAO.findAll();
	}

	@Override
	public Grupo guardarGrupo(Grupo grupo) {
		return iGrupoDAO.save(grupo);
	}

	@Override
	public Grupo grupoXID(int id) {
		return iGrupoDAO.findById(id).get();
	}

	@Override
	public Grupo actualizarGrupo(Grupo grupo) {
		return iGrupoDAO.save(grupo);
	}

	@Override
	public void eliminarGrupo(int id) {
		iGrupoDAO.deleteById(id);
		
	}

	@Override
	public List<Grupo> buscarXJuego(int id) {
		return iGrupoDAO.findByJuegoId(id);
	}

	@Override
	public List<Grupo> buscarXNombre(String nombre) {
		return iGrupoDAO.findByJuegoName(nombre);
	}

}
