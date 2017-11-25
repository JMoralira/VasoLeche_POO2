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
@Table(name = "permisos")
public class Permisos implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_perm")
	private Integer codiPerm;
    
    @Column(name = "nomb_perm")
	private String nombPerm;
    
    @Column(name = "desc_perm")
	private String descPerm;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codi_perm")
    private List<Asignaciones> asignacionesList;
    
	public Permisos(Integer codiPerm, String nombPerm, String descPerm) {
		this.codiPerm = codiPerm;
		this.nombPerm = nombPerm;
		this.descPerm = descPerm;
	}

	public Permisos() {
		
	}

	public Integer getCodiPerm() {
		return codiPerm;
	}

	public void setCodiPerm(Integer codiPerm) {
		this.codiPerm = codiPerm;
	}

	public String getNombPerm() {
		return nombPerm;
	}

	public void setNombPerm(String nombPerm) {
		this.nombPerm = nombPerm;
	}

	public String getDescPerm() {
		return descPerm;
	}

	public void setDescPerm(String descPerm) {
		this.descPerm = descPerm;
	}
	
	public List<Asignaciones> getAsignacionesList() {
		return asignacionesList;
	}

	public void setAsignacionesList(List<Asignaciones> asignacionesList) {
		this.asignacionesList = asignacionesList;
	}
	
	@Override
	public String toString() {
		return this.nombPerm;
	}
}
