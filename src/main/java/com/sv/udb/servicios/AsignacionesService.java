	package com.sv.udb.servicios;

import java.util.List;

import com.sv.udb.modelos.Asignaciones;
import com.sv.udb.modelos.Permisos;
import com.sv.udb.modelos.Usuarios;
/**
 * @author Luis Araujo
 * @version 1.0
 * @since 17-11-2017 
 * @param Asignaciones se usa como clase modelo para manejar los datos.
 */
public interface AsignacionesService {
	public void guarAsig(Asignaciones asignacion);
	public List<Asignaciones> consTodo();
	public void elimAsig(Integer codiAsig);
	public Asignaciones actuAsig(Asignaciones asignacion);
	public Asignaciones consAsig(Integer codiAsig);
	public List<Usuarios> consTodoUsua();
	public List<Permisos> consTodoPerm();
}
