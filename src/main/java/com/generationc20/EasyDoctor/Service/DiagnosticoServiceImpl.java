package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.model.Diagnostico;
import com.generationc20.EasyDoctor.Respository.DiagnosticoRepository;

import com.generationc20.EasyDoctor.model.Diagnostico;

public class DiagnosticoServiceImpl implements DiagnosticoService{
	
	@Autowired
	private DiagnosticoRepository repository;

	@Override
	public Diagnostico crear(Integer idDoctor, Diagnostico diagnostico) {
		diagnostico.setId(idDoctor);
		diagnostico.setFecha(new Date());
		return diagnostico;
	}

	@Override
	public List<Diagnostico> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Diagnostico update(Integer id, Diagnostico d) {
		Diagnostico diagnostico = getById(id).get();
		diagnostico.setFecha(new Date());
		diagnostico.setSpecificaciones(d.getSpecificaciones());
		return diagnostico;
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Diagnostico> getById(Integer id) {
		return repository.findById(id);
	}

}
