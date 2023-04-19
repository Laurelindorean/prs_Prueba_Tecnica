/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Mensaje;

/**
 * @author Palmira
 *
 */
public interface IMensajeService {

	// Metodos del CRUD
	public List<Mensaje> listaMensaje();

	public Mensaje guardarMensaje(Mensaje mensaje);

	public Mensaje mensajeXID(int id);

	public Mensaje actualizarMensaje(Mensaje mensaje);

	public void eliminarMensaje(int id);
	
	public void eliminarMensajeUsuario(int idMsg, int idUser);
	
	public Mensaje editarMensajeUsuario(Mensaje mensaje, int idUser);
}
