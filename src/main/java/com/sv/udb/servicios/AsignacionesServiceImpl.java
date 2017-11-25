package com.sv.udb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.AsignacionesDAO;
import com.sv.udb.dao.PermisosDAO;
import com.sv.udb.dao.UsuariosDAO;
import com.sv.udb.modelos.Asignaciones;
import com.sv.udb.modelos.Permisos;
import com.sv.udb.modelos.Usuarios;

/**
 * @author Luis Araujo
 * @version 1.0
 * @since 17-11-2017 
 */
@Service
@Transactional
/**
 *La clase AsignacionesServiceImpl hereda los metodos de AsignacionesService
 */
public class AsignacionesServiceImpl implements AsignacionesService {

	/**
	 * Se declaran los metodos que contiene asignacionesDAO
	 */
	@Autowired
	private AsignacionesDAO asignacionesDAO;
	
	/**
	 * Se declaran los metodos que contiene usuariosDAO
	 */
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	/**
	 * Se declaran los metodos que contiene permisosDAO
	 */
	@Autowired
	private PermisosDAO permisosDAO;
	/**
	 * guarAsig recibe un parametro de tipo asignaciones para realizar la accion
	 */
	public void guarAsig(Asignaciones asignacion) {
		asignacionesDAO.guarAsig(asignacion);
	}

	/**
	 * @param consTodo() se utiliza para cargar todos los datos de la tabla asignaciones 
	 */
	public List<Asignaciones> consTodo() {
		return asignacionesDAO.consTodo();
	}

	/**
	 * @param elimAsig() recibe un parametro 
	 * @param codiAsig dato de tipo entero para buscar el registro a eliminar. 
	 */
	public void elimAsig(Integer codiAsig) {
		asignacionesDAO.elimAsig(codiAsig);
	}

	/**
	 * @param actuAsig() recibe un parametro 
	 * @param asignacion, dato de tipo asignacion para buscar el registro a actualizar 
	 */
	public Asignaciones actuAsig(Asignaciones asignacion) {
		return asignacionesDAO.actuAsig(asignacion);
	}

	/**
	 * @param Asignaciones recibe un parametro 
	 * @param codiAsig, dato de tipo entero para buscar el registro a consultar 
	 */	
	public Asignaciones consAsig(Integer codiAsig) {
		return asignacionesDAO.consAsig(codiAsig);
	}

	/**
	 * @param consTodoUsua() se utiliza para cargar todos los datos de la tabla usuarios 
	 */
	public List<Usuarios> consTodoUsua() {
		return usuariosDAO.consTodo();
	}

	/**
	 * @param consTodoPerm() se utiliza para cargar todos los datos de la tabla permisos 
	 */
	public List<Permisos> consTodoPerm() {
		return permisosDAO.consTodo();
	}

}
