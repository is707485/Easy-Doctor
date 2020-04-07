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
@Table(name="Historial_Familiar")
public class HistorialFamiliar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idPaciente;
	
	private String papa;
	private String mama;
	private String abuelosP;
	private String abuelosM;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public HistorialFamiliar() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPapa() {
		return papa;
	}

	public void setPapa(String papa) {
		this.papa = papa;
	}

	public String getMama() {
		return mama;
	}

	public void setMama(String mama) {
		this.mama = mama;
	}

	public String getAbuelosP() {
		return abuelosP;
	}

	public void setAbuelosP(String abuelosP) {
		this.abuelosP = abuelosP;
	}

	public String getAbuelosM() {
		return abuelosM;
	}

	public void setAbuelosM(String abuelosM) {
		this.abuelosM = abuelosM;
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
