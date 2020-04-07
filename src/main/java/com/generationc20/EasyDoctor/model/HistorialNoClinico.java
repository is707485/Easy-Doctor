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
@Table(name="historial_no_clinico")
public class HistorialNoClinico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String actividadfisica;
	private String vacunas;
	private String habitosAlimenticios;
	private String habitosSueño;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public HistorialNoClinico () {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActividadfisica() {
		return actividadfisica;
	}

	public void setActividadfisica(String actividadfisica) {
		this.actividadfisica = actividadfisica;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	public String getHabitosAlimenticios() {
		return habitosAlimenticios;
	}

	public void setHabitosAlimenticios(String habitosAlimenticios) {
		this.habitosAlimenticios = habitosAlimenticios;
	}

	public String getHabitosSueño() {
		return habitosSueño;
	}

	public void setHabitosSueño(String habitosSueño) {
		this.habitosSueño = habitosSueño;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
