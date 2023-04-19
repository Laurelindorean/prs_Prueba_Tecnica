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

import com.crud.h2.dto.Grupo;
import com.crud.h2.service.GrupoServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class GrupoController {

	@Autowired
	GrupoServiceImp grupoServiceImp;

	@GetMapping("/grupo")
	public List<Grupo> listarGrupo() {
		return grupoServiceImp.listarGrupo();
	}

	@GetMapping("/grupo/{id}")
	public Grupo grupoXID(@PathVariable(name = "id") int id) {
		Grupo grupo_xid = new Grupo();
		grupo_xid = grupoServiceImp.grupoXID(id);
		return grupo_xid;
	}

	@PostMapping("/grupo")
	public Grupo guardarGrupo(@RequestBody Grupo grupo) {
		return grupoServiceImp.guardarGrupo(grupo);
	}

	@PutMapping("/grupo/{id}")
	public Grupo actualizarGrupo(@PathVariable(name = "id") int id, @RequestBody Grupo grupo) {
		Grupo grupoUpt = grupoServiceImp.grupoXID(id);
		grupoUpt.setNombre(grupo.getNombre());
		grupoUpt.setDescripcion(grupo.getDescripcion());
		grupoUpt.setJuego(grupo.getJuego());
		grupoUpt.setCreador(grupo.getCreador());
		return grupoServiceImp.actualizarGrupo(grupoUpt);
	}

	@DeleteMapping("/grupo/{id}")
	public void eliminarGrupo(@PathVariable(name = "id") int id) {
		grupoServiceImp.eliminarGrupo(id);
	}

}
