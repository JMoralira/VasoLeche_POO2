package com.sv.udb.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "entregas")
public class Entregas implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codi_entr")
	private Integer codiEntr;
    
    @ManyToOne
    @JoinColumn(name="codi_escu", nullable = false)
	private Escuelas escuela;
    
    @ManyToOne
    @JoinColumn(name="codi_lote", nullable = false)
	private Lotes lote;
    
    @Column(name = "cant_entr")
    private Integer cantEntr;
    
    @Column(name = "fech_entr")
    @Temporal(TemporalType.DATE)
    private Date fechEntr;
    
    @Column(name = "esta_entr")
    private Integer estaEntr;

	public Entregas(Integer codiEntr, Escuelas escuela, Lotes lote, Integer cantEntr, Date fechEntr, Integer estaEntr) {
		this.codiEntr = codiEntr;
		this.escuela = escuela;
		this.lote = lote;
		this.cantEntr = cantEntr;
		this.fechEntr = fechEntr;
		this.estaEntr = estaEntr;
	}

	public Entregas() {
	}

	public Integer getCodiEntr() {
		return codiEntr;
	}

	public void setCodiEntr(Integer codiEntr) {
		this.codiEntr = codiEntr;
	}

	public Escuelas getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuelas escuela) {
		this.escuela = escuela;
	}

	public Lotes getLote() {
		return lote;
	}

	public void setLote(Lotes lote) {
		this.lote = lote;
	}

	public Integer getCantEntr() {
		return cantEntr;
	}

	public void setCantEntr(Integer cantEntr) {
		this.cantEntr = cantEntr;
	}

	public Date getFechEntr() {
		return fechEntr;
	}

	public void setFechEntr(Date fechEntr) {
		this.fechEntr = fechEntr;
	}

	public Integer getEstaEntr() {
		return estaEntr;
	}

	public void setEstaEntr(Integer estaEntr) {
		this.estaEntr = estaEntr;
	}

	@Override
	public String toString() {
		return this.escuela.getNombEscu() + ":" + this.lote.getNombLote();
	}
    
}
