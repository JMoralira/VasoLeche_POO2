package com.sv.udb.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_usua")
	private Integer codiUsua;
    
    @Column(name = "nomb_usua")
	private String nombUsua;
    
    @Column(name = "cont_usua")
	private String contUsua;
    
    @Column(name = "mail_usua")
	private String mailUsua;
    
    @Column(name = "esta_usua")
	private boolean estaUsua;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codi_usua")
    private List<Asignaciones> asignacionesList;
    

	public Usuarios(Integer codiUsua, String nombUsua, String contUsua, String mailUsua, boolean estaUsua) {
		this.codiUsua = codiUsua;
		this.nombUsua = nombUsua;
		this.contUsua = contUsua;
		this.mailUsua = mailUsua;
		this.estaUsua = estaUsua;
	}
	
	public Usuarios() {
	}


	public Integer getCodiUsua() {
		return codiUsua;
	}


	public void setCodiUsua(Integer codiUsua) {
		this.codiUsua = codiUsua;
	}


	public String getNombUsua() {
		return nombUsua;
	}


	public void setNombUsua(String nombUsua) {
		this.nombUsua = nombUsua;
	}


	public String getContUsua() {
		return contUsua;
	}


	public void setContUsua(String contUsua) {
		this.contUsua = contUsua;
	}


	public String getMailUsua() {
		return mailUsua;
	}


	public void setMailUsua(String mailUsua) {
		this.mailUsua = mailUsua;
	}


	public boolean isEstaUsua() {
		return estaUsua;
	}

	public void setEstaUsua(boolean estaUsua) {
		this.estaUsua = estaUsua;
	}

	@Override
	public String toString() {
		return this.nombUsua;
	}
	
	public List<Asignaciones> getAsignacionesList() {
		return asignacionesList;
	}

	public void setAsignacionesList(List<Asignaciones> asignacionesList) {
		this.asignacionesList = asignacionesList;
	}
	
}
