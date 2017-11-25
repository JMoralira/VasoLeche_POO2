package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Usuarios;

@Repository
public class UsuariosDAOImpl implements UsuariosDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void guarUsua(Usuarios Usuarios) {
		sessionFactory.getCurrentSession().saveOrUpdate(Usuarios);
	}

	@SuppressWarnings("unchecked")
	public List<Usuarios> consTodo() {
		return sessionFactory.getCurrentSession().createQuery("from Usuarios").list();
	}

	public void elimUsua(Integer codiUsua) {
		Usuarios usua = (Usuarios) sessionFactory.getCurrentSession().load(
				Usuarios.class, codiUsua);
        if (null != usua){
            this.sessionFactory.getCurrentSession().delete(usua);
        }
	}

	public Usuarios actuUsua(Usuarios objeUsua) {
		sessionFactory.getCurrentSession().update(objeUsua);
        return objeUsua;
	}

	public Usuarios consUsua(Integer codiUsua) {
		return (Usuarios) sessionFactory.getCurrentSession().get(
				Usuarios.class, codiUsua);
	}

}
