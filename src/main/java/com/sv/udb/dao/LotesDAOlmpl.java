package com.sv.udb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sv.udb.modelos.Lotes;

@Repository
public class LotesDAOlmpl implements LotesDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void guarLote(Lotes lote){
		sessionFactory.getCurrentSession().saveOrUpdate(lote);		
	}
	
	@SuppressWarnings("unchecked")
	public List<Lotes> consTodo(){
		return sessionFactory.getCurrentSession().createQuery("from lotes").list();
	}
	
	public void elimLote(Integer codiLote){
		Lotes lote = (Lotes) sessionFactory.getCurrentSession().load(Lotes.class, codiLote);
		
		if(null != lote){
			this.sessionFactory.getCurrentSession().delete(lote);			
		}
	}
	
	public Lotes actuLote(Lotes lote){
	 sessionFactory.getCurrentSession().update(lote);
	 return lote;
	
	}

	public Lotes consLote(Integer codiLote) {
		return (Lotes) sessionFactory.getCurrentSession().get(Lotes.class, codiLote);
	}
}
