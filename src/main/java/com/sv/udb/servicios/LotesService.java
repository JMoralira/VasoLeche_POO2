package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Lotes;

public interface LotesService {
	public void guarLote(Lotes lote);
	public List<Lotes> consTodo();
	public void elimLote(Integer codiLote);
	public Lotes actuLote(Lotes lote);
	public Lotes consLote(Integer lote);
}
