/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Mensaje;

/**
 * @author Palmira
 *
 */
public interface IMensajeDAO extends JpaRepository<Mensaje, Integer>{

}
