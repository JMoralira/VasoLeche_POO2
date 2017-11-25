package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Entregas;

@Repository
public class EntregasDAOImpl implements EntregasDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void guarEntr(Entregas entregas) {
		sessionFactory.getCurrentSession().saveOrUpdate(entregas);
	}

	@SuppressWarnings("unchecked")
	public List<Entregas> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Entregas").list();
	}

	public void elimEntr(Integer codiEntr) {
		Entregas entr = (Entregas) sessionFactory.getCurrentSession().load(
				Entregas.class, codiEntr);
        if (null != entr){
            this.sessionFactory.getCurrentSession().delete(entr);
        }
	}

	public Entregas actuEntr(Entregas objeEntr) {
		sessionFactory.getCurrentSession().saveOrUpdate(objeEntr);
        return objeEntr;
	}

	public Entregas consEntr(Integer codiEntr) {
		return (Entregas) sessionFactory.getCurrentSession().get(
				Entregas.class, codiEntr);
	}

}
