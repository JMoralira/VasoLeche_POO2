package com.sv.udb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.EntregasDAO;
import com.sv.udb.dao.EscuelasDAO;
import com.sv.udb.dao.LotesDAO;
import com.sv.udb.modelos.Entregas;
import com.sv.udb.modelos.Escuelas;
import com.sv.udb.modelos.Lotes;

@Service
@Transactional
public class EntregasServiceImpl implements EntregasService {
	
	@Autowired
	private EntregasDAO entregasDAO;
	
	@Autowired
	private EscuelasDAO escuelasDAO;
	
	@Autowired
	private LotesDAO lotesDAO;

	public void guarEntr(Entregas entregas) {
		entregasDAO.guarEntr(entregas);
	}

	public List<Entregas> consTodo() {
		return entregasDAO.consTodo();
	}

	public void elimEntr(Integer codiEntr) {
		entregasDAO.elimEntr(codiEntr);
	}

	public Entregas actuEntr(Entregas objeEntr) {
		return entregasDAO.actuEntr(objeEntr);
	}

	public Entregas consEntr(Integer codiEntr) {
		return entregasDAO.consEntr(codiEntr);
	}

	public List<Escuelas> consTodoEscu() {
		return escuelasDAO.consTodo();
	}

	public List<Lotes> consTodoLote() {
		return lotesDAO.consTodo();
	}

}
