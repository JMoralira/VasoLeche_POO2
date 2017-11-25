package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Permisos;

public interface PermisosService {
	public void guarPerm(Permisos perm);
	public List<Permisos> consTodo();
	public void elimPerm(Integer codiPerm);
	public Permisos actuPerm(Permisos perm);
	public Permisos consPerm(Integer perm);
}
