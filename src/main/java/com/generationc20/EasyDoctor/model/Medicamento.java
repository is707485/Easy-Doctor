package com.generationc20.EasyDoctor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=70)
	private String nombre;
	private String Formula;
	@Column(length=10)
	private String gramage;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToMany(targetEntity= Alergia.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="idMedicamento",referencedColumnName="id")
	private List<Alergia> alergias;
	
	public Medicamento() {}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFormula() {
		return Formula;
	}

	public void setFormula(String formula) {
		Formula = formula;
	}

	public String getGramage() {
		return gramage;
	}

	public void setGramage(String gramage) {
		this.gramage = gramage;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public List<Alergia> getAlergias() {
		return alergias;
	}


	public void setAlergias(List<Alergia> alergias) {
		this.alergias = alergias;
	}

}
