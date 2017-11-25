package com.sv.udb.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignaciones")
public class Asignaciones implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_asig")
	private Integer codiAsig;

    @ManyToOne
    @JoinColumn(name="codi_perm", nullable = false)
	private Permisos permiso;
    
    @ManyToOne
    @JoinColumn(name="codi_usua", nullable = false)
	private Usuarios usuario;
    
	    
	public Asignaciones(Integer codiAsig, Integer codiPerm, Integer codiUsua, Permisos permiso, Usuarios usuario) {
		this.codiAsig = codiAsig;
		this.permiso = permiso;
		this.usuario = usuario;
	}
	
	public Asignaciones() {
	}
	
	public Asignaciones(Integer codiAsig) {
		this.codiAsig = codiAsig;
	}
	
	public Integer getCodiAsig() {
		return codiAsig;
	}
	
	public void setCodiAsig(Integer codiAsig) {
		this.codiAsig = codiAsig;
	}
	
	public Permisos getPermiso() {
		return permiso;
	}

	public void setPermiso(Permisos permiso) {
		this.permiso = permiso;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return this.codiAsig.toString();
	}
	
}
