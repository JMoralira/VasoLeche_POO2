package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Lotes;
public interface LotesDAO {
	public void guarLote(Lotes Lotes);
	public List<Lotes> consTodo();
	public void elimLote (Integer codiLote);
	public Lotes actuLote(Lotes objeLote);
	public Lotes consLote(Integer codiLote);
}
