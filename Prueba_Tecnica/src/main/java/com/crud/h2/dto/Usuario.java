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
@Table(name="usuario")
public class Usuario {

	// Atributos de la entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String nombre;
		private String contrasena;
		private String mail;
		
		@OneToMany(fetch = FetchType.LAZY)
		@JoinColumn(name = "creador_id")
		private List<Grupo> grupo;
		
		@OneToMany(fetch = FetchType.LAZY)
		@JoinColumn(name = "usuario_id")
		private List<Participa> participa;
		
		@OneToMany(fetch = FetchType.LAZY)
		@JoinColumn(name="usuario_id")
		private List<Mensaje> mensaje;
		
		//Constructores
		public Usuario() {
			
		}

		/**
		 * @param id
		 * @param nombre
		 * @param contrasena
		 * @param mail
		 * @param grupo
		 * @param usuario_grp
		 * @param mensaje
		 */
		public Usuario(int id, String nombre, String contrasena, String mail, List<Grupo> grupo,
				List<Participa> participa, List<Mensaje> mensaje) {
			this.id = id;
			this.nombre = nombre;
			this.contrasena = contrasena;
			this.mail = mail;
			this.grupo = grupo;
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
		 * @return the contrasena
		 */
		public String getContrasena() {
			return contrasena;
		}

		/**
		 * @param contrasena the contrasena to set
		 */
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}

		/**
		 * @return the mail
		 */
		public String getMail() {
			return mail;
		}

		/**
		 * @param mail the mail to set
		 */
		public void setMail(String mail) {
			this.mail = mail;
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

		/**
		 * @return the usuario_grp
		 */
		@JsonIgnore
		public List<Participa> getParticipa() {
			return participa;
		}

		/**
		 * @param usuario_grp the usuario_grp to set
		 */
		public void setParticipa(List<Participa> usuario_grp) {
			this.participa = usuario_grp;
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
		
		
		
		
}
