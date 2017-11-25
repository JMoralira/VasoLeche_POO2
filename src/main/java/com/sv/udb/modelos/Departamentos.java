package com.sv.udb.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamentos implements Serializable{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_depa")
	private Integer codiDepa;
    
    @Column(name = "nomb_depa")
	private String nombDepa;
    
    public Departamentos()
    {}

	public Integer getCodiDepa() {
		return codiDepa;
	}


	public void setCodiDepa(Integer codiDepa) {
		this.codiDepa = codiDepa;
	}


	public String getNombDepa() {
		return nombDepa;
	}


	public void setNombDepa(String nombDepa) {
		this.nombDepa = nombDepa;
	}


	public Departamentos(Integer codiDepa, String nombDepa) {
		super();
		this.codiDepa = codiDepa;
		this.nombDepa = nombDepa;
	}


	@Override
	public String toString() {
		return this.nombDepa;
	}
    }
