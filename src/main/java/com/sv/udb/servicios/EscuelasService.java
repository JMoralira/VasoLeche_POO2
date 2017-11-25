package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Departamentos;
import com.sv.udb.modelos.Escuelas;

public interface EscuelasService {
	public void guarEscu(Escuelas escuela);
	public List<Escuelas> consTodo();
	public void elimEscu (Integer codiEscu);
	public Escuelas actuEscu(Escuelas objeEscu);
	public Escuelas consEscu(Integer codiEscu);
	public List<Departamentos> consTodoDepa();
}
