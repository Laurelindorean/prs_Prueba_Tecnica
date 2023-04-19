/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Participa;

/**
 * @author Palmira
 *
 */
public interface IParticipaService {

	// Metodos del CRUD
	public List<Participa> listarParticipa();

	public Participa guardarParticipa(Participa participa);

	public Participa participaXID(int id);

	public Participa actualizaParticipa(Participa participa);

	public void eliminarParticipa(int id);

}
