package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Departamentos;

@Repository
public class DepartamentosDAOImpl implements DepartamentosDAO{

	@Autowired
    private SessionFactory sessionFactory;
	public void guarDepa(Departamentos Depa) {
		sessionFactory.getCurrentSession().saveOrUpdate(Depa);
	}
	
	@SuppressWarnings("unchecked")
	public List<Departamentos> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Departamentos").list();
	}

	public void elimDepa(Integer codiDepe) {
		Departamentos depa = (Departamentos) sessionFactory.getCurrentSession().load(
				Departamentos.class, codiDepe);
        if (null != depa){
            this.sessionFactory.getCurrentSession().delete(depa);
        }
		
	}

	public Departamentos actuDepa(Departamentos objeDepa) {
		sessionFactory.getCurrentSession().update(objeDepa);
        return objeDepa;
	}

	public Departamentos consDepa(Integer codiDepa) {
		return (Departamentos) sessionFactory.getCurrentSession().get(
				Departamentos.class, codiDepa);
	}

}
