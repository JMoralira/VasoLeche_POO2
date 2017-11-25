package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Asignaciones;

@Repository
public class AsignacionesDAOImpl implements AsignacionesDAO {
	
	@Autowired
    private SessionFactory sessionFactory;

	public void guarAsig(Asignaciones asignacion) {
		sessionFactory.getCurrentSession().saveOrUpdate(asignacion);
	}

	@SuppressWarnings("unchecked")
	public List<Asignaciones> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Asignaciones").list();
	}

	public void elimAsig(Integer codiAsig) {
		Asignaciones asig = (Asignaciones) sessionFactory.getCurrentSession().load(
				Asignaciones.class, codiAsig);
        if (null != asig){
            this.sessionFactory.getCurrentSession().delete(asig);
        }
	}

	public Asignaciones actuAsig(Asignaciones asignacion) {
		sessionFactory.getCurrentSession().update(asignacion);
        return asignacion;
	}

	public Asignaciones consAsig(Integer codiAsig) {
		return (Asignaciones) sessionFactory.getCurrentSession().get(
				Asignaciones.class, codiAsig);
	}

}
