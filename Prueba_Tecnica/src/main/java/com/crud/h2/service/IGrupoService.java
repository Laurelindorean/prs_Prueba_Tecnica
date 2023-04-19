/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Grupo;

/**
 * @author Palmira
 *
 */
public interface IGrupoService {

	// Metodos del CRUD
	public List<Grupo> listarGrupo();

	public Grupo guardarGrupo(Grupo grupo);

	public Grupo grupoXID(int id);

	public Grupo actualizarGrupo(Grupo grupo);
	//para buscar grupos seleccionando un juego
	public List<Grupo> buscarXJuego(int id);

	public void eliminarGrupo(int id);
	
	public List<Grupo> buscarXNombre(String nombre);
}
