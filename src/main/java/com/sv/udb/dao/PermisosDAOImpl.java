package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Permisos;

@Repository
public class PermisosDAOImpl implements PermisosDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void guarPerm(Permisos perm) {
		sessionFactory.getCurrentSession().saveOrUpdate(perm);
	}

	@SuppressWarnings("unchecked")
	public List<Permisos> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Permisos").list();
	}

	public void elimPerm(Integer codiPerm) {
		Permisos perm = (Permisos) sessionFactory.getCurrentSession().load(
				Permisos.class, codiPerm);
        if (null != perm){
            this.sessionFactory.getCurrentSession().delete(perm);
        }
	}

	public Permisos actuPerm(Permisos perm) {
		sessionFactory.getCurrentSession().update(perm);
        return perm;
	}

	public Permisos consPerm(Integer codiPerm) {
		return (Permisos) sessionFactory.getCurrentSession().get(
				Permisos.class, codiPerm);
	}
}
