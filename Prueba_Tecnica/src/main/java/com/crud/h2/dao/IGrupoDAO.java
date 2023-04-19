/**
 * 
 */
package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.h2.dto.Grupo;

/**
 * @author Palmira
 *
 */
public interface IGrupoDAO extends JpaRepository<Grupo, Integer>{
	
	
	@Query("FROM Grupo g WHERE g.juego.id = :idJuego")
	public List<Grupo> findByJuegoId(int idJuego);
	
	@Query("FROM Grupo g WHERE g.juego.nombre = :nombre")
	public List<Grupo> findByJuegoName(String nombre);
}
