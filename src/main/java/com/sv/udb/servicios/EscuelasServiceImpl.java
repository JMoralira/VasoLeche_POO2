package com.sv.udb.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.udb.dao.EscuelasDAO;
import com.sv.udb.modelos.Departamentos;
import com.sv.udb.modelos.Escuelas;

@Service
@Transactional
public class EscuelasServiceImpl implements EscuelasService {

	@Autowired
	private EscuelasDAO escuelasDAO;
	
	public void guarEscu(Escuelas escuela) {
		// TODO Auto-generated method stub
		
	}

	public List<Escuelas> consTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void elimEscu(Integer codiEscu) {
		// TODO Auto-generated method stub
		
	}

	public Escuelas actuEscu(Escuelas objeEscu) {
		// TODO Auto-generated method stub
		return null;
	}

	public Escuelas consEscu(Integer codiEscu) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Departamentos> consTodoDepa() {
		// TODO Auto-generated method stub
		return null;
	}

}
