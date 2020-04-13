package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generationc20.EasyDoctor.model.Laboratorio;
import com.generationc20.EasyDoctor.Respository.LaboratorioRepository;

public class LaboratorioServiceImpl implements LaboratorioService {
	
	@Autowired
	private LaboratorioRepository repository;

	@Override
	public Laboratorio crear(Integer idLaboratorio, Laboratorio laboratorio) {
		laboratorio.setId(idLaboratorio);
		laboratorio.setFecha(new Date());
		return laboratorio;
	}

	@Override
	public List<Laboratorio> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Laboratorio update(Integer id, Laboratorio l) {
		Laboratorio laboratorio = getById(id).get();
		laboratorio.setContacto(l.getContacto());
		laboratorio.setDireccion(l.getDireccion());
		laboratorio.setEmail(l.getEmail());
		laboratorio.setEspecialidad(l.getEspecialidad());
		laboratorio.setFecha(l.getFecha());
		laboratorio.setId(l.getId());
		laboratorio.setNombre(l.getNombre());
		laboratorio.setTelefono(l.getTelefono());
		
		return repository.save(laboratorio);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Laboratorio> getById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
