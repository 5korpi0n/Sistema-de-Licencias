package com.cdainfo.vacaciones.entity;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Peticion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroPeticion;

	@Column(name = "diaDeLicencia") // columna de base de datos :)
	private Date diaDeLicencia;

	@Column(name = "tipoDeLicencia")
	private String tipoDeLicencia;

	@Column(name = "cantidadDias")
	private Date cantidadDias;

	@Column(name = "estado")
	private String estado;
	
	@Column(name = "diaAlta")
	private String diaAlta;

	public String getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(String diaAlta) {
		this.diaAlta = diaAlta;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	public Long getNumeroPeticion() {
		return numeroPeticion;
	}

	public void setNumeroPeticion(Long numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}

	public Date getDiaDeLicencia() {
		return diaDeLicencia;
	}

	public void setDiaDeLicencia(Date diaDeLicencia) {
		this.diaDeLicencia = diaDeLicencia;
	}

	public String getTipoDeLicencia() {
		return tipoDeLicencia;
	}

	public void setTipoDeLicencia(String tipoDeLicencia) {
		this.tipoDeLicencia = tipoDeLicencia;
	}

	public Date getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(Date cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	//public void tiposDePeticion() {

//	}

	//public void verEstadoDeLaPeticion() {

//	}

}
