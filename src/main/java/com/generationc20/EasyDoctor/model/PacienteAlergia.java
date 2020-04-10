package com.generationc20.EasyDoctor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pacienteAlergia")
public class PacienteAlergia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idPaciente;
	private Integer idAlergia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public PacienteAlergia() {
		
	}
	public PacienteAlergia(Integer id, Integer idPaciente, Integer idAlergia, Date fecha) {
		this.id = id;
		this.idPaciente = idPaciente;
		this.idAlergia = idAlergia;
		this.fecha = fecha;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Integer getIdAlergia() {
		return idAlergia;
	}

	public void setIdAlergia(Integer idAlergia) {
		this.idAlergia = idAlergia;
	}
	

}
