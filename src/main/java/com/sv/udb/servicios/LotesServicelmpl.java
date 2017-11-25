package com.sv.udb.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.LotesDAO;
import com.sv.udb.modelos.Lotes;

@Service
@Transactional
public class LotesServicelmpl implements LotesService{
	@Autowired
	private LotesDAO lotesDAO;
	
	
	public void guarLote(Lotes lote) {
		lotesDAO.guarLote(lote);
		
	}

	public List<Lotes> consTodo() {		
		return lotesDAO.consTodo();
	}

	public void elimLote(Integer codiLote) {
		lotesDAO.elimLote(codiLote);
		
	}

	public Lotes actuLote(Lotes lote) {		
		return lotesDAO.actuLote(lote);
	}

	public Lotes consLote(Integer codiLote) {		
		return lotesDAO.consLote(codiLote);
	}

}
