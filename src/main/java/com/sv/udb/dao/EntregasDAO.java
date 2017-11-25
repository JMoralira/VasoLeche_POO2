package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Entregas;

public interface EntregasDAO {
	public void guarEntr(Entregas entregas);
	public List<Entregas> consTodo();
	public void elimEntr (Integer codiEntr);
	public Entregas actuEntr(Entregas objeEntr);
	public Entregas consEntr(Integer codiEntr);
}
