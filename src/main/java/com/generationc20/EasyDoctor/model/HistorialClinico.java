package com.generationc20.EasyDoctor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="historial_clinico")
public class HistorialClinico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50)
	private String medico;
	private String traumas;
	private String psicologico;
	private String adicciones;
	private String cirugias;
	private String otros;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public HistorialClinico() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getTraumas() {
		return traumas;
	}

	public void setTraumas(String traumas) {
		this.traumas = traumas;
	}

	public String getPsicologico() {
		return psicologico;
	}

	public void setPsicologico(String psicologico) {
		this.psicologico = psicologico;
	}

	public String getAdicciones() {
		return adicciones;
	}

	public void setAdicciones(String adicciones) {
		this.adicciones = adicciones;
	}

	public String getCirugias() {
		return cirugias;
	}

	public void setCirugias(String cirugias) {
		this.cirugias = cirugias;
	}

	public String getOtros() {
		return otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
