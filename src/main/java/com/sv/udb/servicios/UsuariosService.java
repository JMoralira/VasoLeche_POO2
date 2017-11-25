package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Usuarios;

public interface UsuariosService {
	public void guarUsua(Usuarios Usuarios);
	public List<Usuarios> consTodo();
	public void elimUsua(Integer codiUsua);
	public Usuarios actuUsua(Usuarios objeUsua);
	public Usuarios consUsua(Integer codiUsua);

}
