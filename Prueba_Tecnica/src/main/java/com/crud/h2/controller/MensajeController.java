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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Mensaje;
import com.crud.h2.service.MensajeServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class MensajeController {
	
	@Autowired
	MensajeServiceImp mensajeServiceImp;
	
	@GetMapping("/mensaje")
	public List<Mensaje> listarUsuario(){
		return mensajeServiceImp.listaMensaje();
	}
	
	@PostMapping("/mensaje")
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImp.guardarMensaje(mensaje);
	}
	
	@GetMapping("/mensaje/{id}")
	public Mensaje mensajeXID(@PathVariable(name = "id") int id) {
		Mensaje msj = new Mensaje();
		msj = mensajeServiceImp.mensajeXID(id);
		return msj;
	}
	
	@PutMapping("/mensaje/{id}")
	public Mensaje actualizarMensaje(@PathVariable(name = "id") int id, @RequestBody Mensaje mensaje){
		Mensaje msj = new Mensaje();
		msj.setContenido(mensaje.getContenido());
		msj.setFecha_hora(mensaje.getFecha_hora());
		msj.setGrupo(mensaje.getGrupo());
		msj.setUsuario(mensaje.getUsuario());
		return mensajeServiceImp.actualizarMensaje(msj);
		
	}
	
	@DeleteMapping("/mensaje/{id}")
	public void eliminarMensaje(@PathVariable(name = "id") int id) {
		mensajeServiceImp.eliminarMensaje(id);
	}
	
	@DeleteMapping("/mensaje")
	public void eliminarMensaje(@RequestParam int idMsg, @RequestParam int idUser) {
		mensajeServiceImp.eliminarMensajeUsuario(idMsg, idUser);
	}
	
	@PutMapping("/mensaje")
	public void editarMensajeUsuario(@RequestBody Mensaje mensaje, @RequestParam int idUser) {
		mensajeServiceImp.editarMensajeUsuario(mensaje, idUser);
	}
}
