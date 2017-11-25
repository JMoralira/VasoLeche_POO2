package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Escuelas;

public interface EscuelasDAO {
	public void guarEscu(Escuelas escuela);
	public List<Escuelas> consTodo();
	public void elimEscu (Integer codiEscu);
	public Escuelas actuEscu(Escuelas objeEscu);
	public Escuelas consEscu(Integer codiEscu);
}
