package com.sv.udb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.DepartamentosDAO;
import com.sv.udb.modelos.Departamentos;

@Service
@Transactional
public class DepartamentosServiceImpl implements DepartamentosService {


	@Autowired
    private DepartamentosDAO departamentosDAO;

	public void guarDepa(Departamentos Departamentos) {
		departamentosDAO.guarDepa(Departamentos);
	}

	public List<Departamentos> consTodo() {
		return departamentosDAO.consTodo();
	}

	public void elimDepa(Integer codiDepa) {
		departamentosDAO.elimDepa(codiDepa);
	}

	public Departamentos actuDepa(Departamentos objeDepa) {
		return departamentosDAO.actuDepa(objeDepa);
	}

	public Departamentos consDepa(Integer codiDepa) {
		return departamentosDAO.consDepa(codiDepa);
	}
	
}
