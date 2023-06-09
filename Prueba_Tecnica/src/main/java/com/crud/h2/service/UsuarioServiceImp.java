/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUsuarioDAO;
import com.crud.h2.dto.Usuario;

/**
 * @author Palmira
 *
 */
@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public List<Usuario> listarUsuario() {
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXID(int id) {
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		iUsuarioDAO.deleteById(id);
	}

}
