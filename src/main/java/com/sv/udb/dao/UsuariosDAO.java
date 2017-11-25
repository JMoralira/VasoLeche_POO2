package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Usuarios;

public interface UsuariosDAO {
	public void guarUsua(Usuarios Usuarios);
	public List<Usuarios> consTodo();
	public void elimUsua(Integer codiUsua);
	public Usuarios actuUsua(Usuarios objeUsua);
	public Usuarios consUsua(Integer codiUsua);
}
