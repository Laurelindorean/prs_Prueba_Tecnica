/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IMensajeDAO;
import com.crud.h2.dto.Mensaje;

/**
 * @author Palmira
 *
 */
@Service
public class MensajeServiceImp implements IMensajeService {

	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listaMensaje() {
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje mensajeXID(int id) {
		return iMensajeDAO.findById(id).get();
	}

	@Override
	public Mensaje actualizarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void eliminarMensaje(int id) {
		iMensajeDAO.deleteById(id);
	}

}
