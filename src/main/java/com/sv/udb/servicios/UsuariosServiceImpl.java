package com.sv.udb.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.udb.dao.UsuariosDAO;
import com.sv.udb.modelos.Usuarios;

@Service
@Transactional
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
    private UsuariosDAO usuariosDAO;

	public void guarUsua(Usuarios usua) {
		usuariosDAO.guarUsua(usua);
	}

	public List<Usuarios> consTodo() {
		return usuariosDAO.consTodo();
	}

	public void elimUsua(Integer codiUsua) {
		usuariosDAO.elimUsua(codiUsua);
	}

	public Usuarios actuUsua(Usuarios usua) {
		return usuariosDAO.actuUsua(usua);
	}

	public Usuarios consUsua(Integer codiUsua) {
		return usuariosDAO.consUsua(codiUsua);
	}

}
