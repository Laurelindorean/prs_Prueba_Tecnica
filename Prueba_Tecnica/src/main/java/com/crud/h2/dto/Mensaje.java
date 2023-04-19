/**
 * 
 */
package com.crud.h2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "mensaje")
public class Mensaje {
	//Atributos de entidad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String contenido;
	private String fecha_hora;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;

	public Mensaje() {

	}

	/**
	 * @param id
	 * @param contenido
	 * @param fecha_hora
	 * @param usuario
	 * @param grupo
	 */
	public Mensaje(int id, String contenido, String fecha_hora, Usuario usuario, Grupo grupo) {
		this.id = id;
		this.contenido = contenido;
		this.fecha_hora = fecha_hora;
		this.usuario = usuario;
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
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the fecha_hora
	 */
	public String getFecha_hora() {
		return fecha_hora;
	}

	/**
	 * @param fecha_hora the fecha_hora to set
	 */
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the grupo
	 */
	public Grupo getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
