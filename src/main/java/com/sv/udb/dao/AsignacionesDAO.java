package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Asignaciones;

public interface AsignacionesDAO {
	public void guarAsig(Asignaciones asignacion);
	public List<Asignaciones> consTodo();
	public void elimAsig(Integer codiAsig);
	public Asignaciones actuAsig(Asignaciones asignacion);
	public Asignaciones consAsig(Integer codiAsig);
}
