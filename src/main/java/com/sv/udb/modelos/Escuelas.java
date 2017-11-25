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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "escuelas")
public class Escuelas implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_escu")
	private Integer codiEscu;
    
    @ManyToOne
    @JoinColumn(name="codi_depa", nullable = false)
	private Departamentos departamento;
    
    @Column(name = "nomb_dire")
	private String nombDire;
    
    @Column(name = "nomb_escu")
	private String nombEscu;
    
    @Column(name = "cant_alum")
	private Integer cantAlum;
    
    @Column(name = "cant_entr")
	private Integer cantEntr;
    
    @Column(name = "esta_escu")
	private Integer estaEscu;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codi_escu")
    private List<Entregas> entregasList;
	
	public Escuelas() {
	}

	public Escuelas(Integer codiEscu, Departamentos departamento, String nombDire, String nombEscu, Integer cantAlum,
			Integer cantEntr, Integer estaEscu) {
		this.codiEscu = codiEscu;
		this.departamento = departamento;
		this.nombDire = nombDire;
		this.nombEscu = nombEscu;
		this.cantAlum = cantAlum;
		this.cantEntr = cantEntr;
		this.estaEscu = estaEscu;
	}

	public Integer getCodiEscu() {
		return codiEscu;
	}


	public void setCodiEscu(Integer codiEscu) {
		this.codiEscu = codiEscu;
	}


	public Departamentos getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}


	public String getNombDire() {
		return nombDire;
	}


	public void setNombDire(String nombDire) {
		this.nombDire = nombDire;
	}


	public String getNombEscu() {
		return nombEscu;
	}


	public void setNombEscu(String nombEscu) {
		this.nombEscu = nombEscu;
	}


	public Integer getCantAlum() {
		return cantAlum;
	}


	public void setCantAlum(Integer cantAlum) {
		this.cantAlum = cantAlum;
	}


	public Integer getCantEntr() {
		return cantEntr;
	}


	public void setCantEntr(Integer cantEntr) {
		this.cantEntr = cantEntr;
	}


	public Integer getEstaEscu() {
		return estaEscu;
	}


	public void setEstaEscu(Integer estaEscu) {
		this.estaEscu = estaEscu;
	}


	@Override
	public String toString() {
		return this.nombEscu;
	}
}
