/**
 * 
 */
package com.crud.h2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name="juego")
public class Juego {

	//Atributos de la entidad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String plataforma;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "juego_id")
	private List<Grupo> grupo;
	
	public Juego() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param plataforma
	 * @param grupo
	 */
	public Juego(int id, String nombre, String plataforma, List<Grupo> grupo) {
		this.id = id;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.grupo = grupo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * @param plataforma the plataforma to set
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * @return the grupo
	 */
	@JsonIgnore
	public List<Grupo> getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}
	
}
