package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Departamentos;

public interface DepartamentosService {

	public void guarDepa(Departamentos Departamentos);
	public List<Departamentos> consTodo();
	public void elimDepa (Integer codiDepa);
	public Departamentos actuDepa(Departamentos objeDepa);
	public Departamentos consDepa(Integer codiDepa);
}
