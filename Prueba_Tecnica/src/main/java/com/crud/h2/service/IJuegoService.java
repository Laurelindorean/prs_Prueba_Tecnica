/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Juego;

/**
 * @author Palmira
 *
 */
public interface IJuegoService {

	// Metodos del CRUD
	public List<Juego> listarJuegos();

	public Juego juegoXID(int id);

	public void eliminarJuego(int id);
	// No he añadido el metodo para actuzalizar ni crear el juego porque entiendo que el
	// usuario no deberia de poder modificar un juego ni crearlo
}
