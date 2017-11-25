package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Permisos;

public interface PermisosDAO {
	public void guarPerm(Permisos Permisos);
	public List<Permisos> consTodo();
	public void elimPerm (Integer codiPerm);
	public Permisos actuPerm(Permisos objePerm);
	public Permisos consPerm(Integer codiPerm);
}
