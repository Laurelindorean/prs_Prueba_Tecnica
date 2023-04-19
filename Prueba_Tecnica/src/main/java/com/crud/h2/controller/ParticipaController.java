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

import com.crud.h2.dto.Participa;
import com.crud.h2.service.ParticipaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ParticipaController {

	@Autowired
	ParticipaServiceImp participaServiceImp;

	@GetMapping("/participa")
	public List<Participa> listaParticipa() {
		return participaServiceImp.listarParticipa();
	}

	@PostMapping("/participa")
	public Participa guardarParticipa(@RequestBody Participa participa) {
		return participaServiceImp.guardarParticipa(participa);
	}

	@GetMapping("/participa/{id}")
	public Participa participaXID(@PathVariable(name = "id") int id) {
		Participa pt_xid = new Participa();
		pt_xid = participaServiceImp.participaXID(id);
		return pt_xid;
	}

	@PutMapping("/participa/{id}")
	public Participa actualizarParticipa(@PathVariable(name = "id") int id, @RequestBody Participa participa) {
		Participa pt_sel = participaServiceImp.participaXID(id);
		pt_sel.setGrupo(participa.getGrupo());
		pt_sel.setUsuario(participa.getUsuario());
		return participaServiceImp.actualizaParticipa(pt_sel);
	}

	@DeleteMapping("/participa/{id}")
	public void eliminarPartidipa(@PathVariable(name = "id") int id) {
		participaServiceImp.eliminarParticipa(id);
	}
}
