package com.sv.udb.modelos;


import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "lotes")
@Table(name = "lotes")
public class Lotes implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "codi_lote")
	private Integer codiLote;
	
	@Column(name = "nomb_lote")
	private String nombLote;
	
	@Column(name = "cant_lote")
	private Integer cantLote;
	
	@Column(name = "prec_lote")
	private Double precLote;
	
	@Column(name = "fech_lote")
	@Temporal(TemporalType.DATE)
	private Date fechLote;
	
	@Column(name = "fech_venc")
	@Temporal(TemporalType.DATE)
	private Date fechVenc;
	
	@Column(name = "esta_lote")
	private boolean estaLote;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codi_lote")
    private List<Entregas> entregasList;

	public Lotes(Integer codiLote, String nombLote, Integer cantLote, Double precLote, Date fechLote, Date fechVenc,
			boolean estaLote) {
		super();
		this.codiLote = codiLote;
		this.nombLote = nombLote;
		this.cantLote = cantLote;
		this.precLote = precLote;
		this.fechLote = fechLote;
		this.fechVenc = fechVenc;
		this.estaLote = estaLote;
	}
	
	public Lotes(){
		
	}
	
	public Integer getCodiLote() {
		return codiLote;
	}

	public void setCodiLote(Integer codiLote) {
		this.codiLote = codiLote;
	}

	public String getNombLote() {
		return nombLote;
	}

	public void setNombLote(String nombLote) {
		this.nombLote = nombLote;
	}

	public Integer getCantLote() {
		return cantLote;
	}

	public void setCantLote(Integer cantLote) {
		this.cantLote = cantLote;
	}

	public Double getPrecLote() {
		return precLote;
	}

	public void setPrecLote(Double precLote) {
		this.precLote = precLote;
	}

	public Date getFechLote() {
		return fechLote;
	}

	public void setFechLote(Date fechLote) {
		this.fechLote = fechLote;
	}

	public Date getFechVenc() {
		return fechVenc;
	}

	public void setFechVenc(Date fechVenc) {
		this.fechVenc = fechVenc;
	}

	public boolean isEstaLote() {
		return estaLote;
	}

	public void setEstaLote(boolean estaLote) {
		this.estaLote = estaLote;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return this.nombLote;
	}
	
	
}
