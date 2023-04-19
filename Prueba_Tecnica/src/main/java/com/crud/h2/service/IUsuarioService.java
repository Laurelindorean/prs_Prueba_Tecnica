/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Usuario;

/**
 * @author Palmira
 *
 */
public interface IUsuarioService {

	// Metodos del CRUD
	public List<Usuario> listarUsuario();

	public Usuario guardarUsuario(Usuario usuario);

	public Usuario usuarioXID(int id);

	public Usuario actualizarUsuario(Usuario usuario);

	public void eliminarUsuario(int id);
}
