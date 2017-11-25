package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Entregas;
import com.sv.udb.modelos.Escuelas;
import com.sv.udb.modelos.Lotes;

public interface EntregasService {
	public void guarEntr(Entregas entregas);
	public List<Entregas> consTodo();
	public void elimEntr (Integer codiEntr);
	public Entregas actuEntr(Entregas objeEntr);
	public Entregas consEntr(Integer codiEntr);
	public List<Escuelas> consTodoEscu();
	public List<Lotes> consTodoLote();
}
