package com.sv.udb.dao;

import java.util.List;

import com.sv.udb.modelos.Departamentos;

public interface DepartamentosDAO {
	public void guarDepa(Departamentos Departamentos);
	public List<Departamentos> consTodo();
	public void elimDepa (Integer codiDepe);
	public Departamentos actuDepa(Departamentos objeDepa);
	public Departamentos consDepa(Integer codiDepa);
}
