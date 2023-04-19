/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IParticipaDAO;
import com.crud.h2.dto.Participa;

/**
 * @author Palmira
 *
 */
@Service
public class ParticipaServiceImp implements IParticipaService{
	
	@Autowired
	IParticipaDAO iParticipaDAO;

	@Override
	public List<Participa> listarParticipa() {
		return iParticipaDAO.findAll();
	}

	@Override
	public Participa guardarParticipa(Participa participa) {
		return iParticipaDAO.save(participa);
	}

	@Override
	public Participa participaXID(int id) {
		return iParticipaDAO.findById(id).get();
	}

	@Override
	public Participa actualizaParticipa(Participa participa) {
		return iParticipaDAO.save(participa);
	}

	@Override
	public void eliminarParticipa(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
