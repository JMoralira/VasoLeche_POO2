package com.sv.udb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.PermisosDAO;
import com.sv.udb.modelos.Permisos;

@Service
@Transactional
public class PermisosServiceImpl implements PermisosService{
	
	@Autowired
    private PermisosDAO permisosDAO;

	public void guarPerm(Permisos perm) {
		permisosDAO.guarPerm(perm);
	}

	public List<Permisos> consTodo() {
		return permisosDAO.consTodo();
	}

	public void elimPerm(Integer codiPerm) {
		permisosDAO.elimPerm(codiPerm);
	}

	public Permisos actuPerm(Permisos perm) {
		return permisosDAO.actuPerm(perm);
	}

	public Permisos consPerm(Integer codiPerm) {
		return permisosDAO.consPerm(codiPerm);
	}

}
