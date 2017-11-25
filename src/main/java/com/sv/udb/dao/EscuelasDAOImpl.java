package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Escuelas;

@Repository
public class EscuelasDAOImpl implements EscuelasDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void guarEscu(Escuelas escuela) {
		sessionFactory.getCurrentSession().saveOrUpdate(escuela);
	}

	@SuppressWarnings("unchecked")
	public List<Escuelas> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Escuelas").list();
	}

	public void elimEscu(Integer codiEscu) {
		Escuelas escu = (Escuelas) sessionFactory.getCurrentSession().load(
				Escuelas.class, codiEscu);
        if (null != escu){
            this.sessionFactory.getCurrentSession().delete(escu);
        }
	}

	public Escuelas actuEscu(Escuelas objeEscu) {
		sessionFactory.getCurrentSession().update(objeEscu);
        return objeEscu;
	}

	public Escuelas consEscu(Integer codiEscu) {
		return (Escuelas) sessionFactory.getCurrentSession().get(
				Escuelas.class, codiEscu);
	}

}
