/**
 * 
 */
package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Usuario;
import com.crud.h2.service.UsuarioServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioServiceImp usuarioServiceImp;

	@GetMapping("/usuario")
	public List<Usuario> listarUsuarios() {
		return usuarioServiceImp.listarUsuario();
	}

	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImp.guardarUsuario(usuario);
	}

	@GetMapping("/usuario/{id}")
	public Usuario usuarioXID(@PathVariable(name = "id") int id) {
		Usuario usuario_xid = new Usuario();
		usuario_xid = usuarioServiceImp.usuarioXID(id);
		return usuario_xid;
	}

	@PutMapping("/usuario/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") int id, @RequestBody Usuario usuario) {
		Usuario usuario_sel = new Usuario();
		usuario_sel = usuarioServiceImp.usuarioXID(id);
		usuario_sel.setNombre(usuario.getNombre());
		usuario_sel.setContrasena(usuario.getContrasena());
		usuario_sel.setMail(usuario.getMail());
		return usuarioServiceImp.actualizarUsuario(usuario_sel);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminarUsuario(@PathVariable(name = "id") int id) {
		usuarioServiceImp.eliminarUsuario(id);
	}

}
