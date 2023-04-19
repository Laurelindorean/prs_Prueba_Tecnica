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

	public void eliminarGrupo(int id);
}
