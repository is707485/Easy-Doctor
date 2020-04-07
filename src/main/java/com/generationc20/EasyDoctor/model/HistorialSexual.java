package com.generationc20.EasyDoctor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Historial_Sexual")
public class HistorialSexual {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer idPaciente;
	
	private int menarca;
	private int primareRelacionSexual;
	@Column(length=50)
	private String sexualidad;
	private int abortos;
	private int cesarias;
	private Date fecha;

	public HistorialSexual() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMenarca() {
		return menarca;
	}

	public void setMenarca(int menarca) {
		this.menarca = menarca;
	}

	public int getPrimareRelacionSexual() {
		return primareRelacionSexual;
	}

	public void setPrimareRelacionSexual(int primareRelacionSexual) {
		this.primareRelacionSexual = primareRelacionSexual;
	}

	public String getSexualidad() {
		return sexualidad;
	}

	public void setSexualidad(String sexualidad) {
		this.sexualidad = sexualidad;
	}

	public int getAbortos() {
		return abortos;
	}

	public void setAbortos(int abortos) {
		this.abortos = abortos;
	}

	public int getCesarias() {
		return cesarias;
	}

	public void setCesarias(int cesarias) {
		this.cesarias = cesarias;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
}
