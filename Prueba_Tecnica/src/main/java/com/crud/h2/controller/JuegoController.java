/**
 * 
 */
package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Juego;
import com.crud.h2.service.JuegoServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class JuegoController {
	
	@Autowired
	JuegoServiceImp juegoServiceImp;
	
	@GetMapping("/juego")
	public List<Juego> listarJuegos(){
		return juegoServiceImp.listarJuegos();
	}
	
	@GetMapping("/juego/{id}")
	public Juego juegoXID(@PathVariable(name="id") int id) {
		Juego game_xid = new Juego();
		game_xid = juegoServiceImp.juegoXID(id);
		return game_xid;
	}
	
	@DeleteMapping("/juego/{id}")
	public void eliminarJuego(@PathVariable(name="id") int id) {
		juegoServiceImp.eliminarJuego(id);
	}

}
