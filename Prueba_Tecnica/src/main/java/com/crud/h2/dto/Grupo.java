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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name="grupo")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name = "juego_id")
	private Juego juego;
	
	@ManyToOne
	@JoinColumn(name = "creador_id")
	private Usuario creador;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo_id")
	private List<Participa> participa;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo_id")
	private List<Mensaje> mensaje;
	
	public Grupo() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param juego
	 * @param usuario_grupo
	 * @param mensaje
	 */
	public Grupo(int id, String nombre, String descripcion, Juego juego, Usuario usuario, List<Participa> participa,
			List<Mensaje> mensaje) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.juego = juego;
		this.creador = usuario;
		this.participa = participa;
		this.mensaje = mensaje;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the juego
	 */
	public Juego getJuego() {
		return juego;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	/**
	 * @return the usuario_grupo
	 */
	@JsonIgnore
	public List<Participa> getParticipa() {
		return participa;
	}

	/**
	 * @param usuario_grupo the usuario_grupo to set
	 */
	public void setParticipa(List<Participa> usuario_grupo) {
		this.participa = usuario_grupo;
	}

	/**
	 * @return the mensaje
	 */
	@JsonIgnore
	public List<Mensaje> getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(List<Mensaje> mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the creador
	 */
	public Usuario getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(Usuario creador) {
		this.creador = creador;
	}
	
	
	
}
