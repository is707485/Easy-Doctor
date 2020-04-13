package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.model.Tratamiento;
import com.generationc20.EasyDoctor.Respository.TratamientoRepository;

@Service
public class TratamientoServiceImpl implements TratamientoService{
	
	@Autowired
	private TratamientoRepository repository;

	@Override
	public Tratamiento crear(Integer idTratamiento, Tratamiento tratamiento) {
		tratamiento.setId(idTratamiento);
		tratamiento.setFecha(new Date());
		//falta
		return tratamiento;
	}

	@Override
	public List<Tratamiento> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Tratamiento update(Integer id, Tratamiento t) {
		Tratamiento tratamiento = getById(id).get();
		tratamiento.setFecha(t.getFecha());
		tratamiento.setIdDiagnostico(t.getIdDiagnostico());
		return null;
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Tratamiento> getById(Integer id) {
		return repository.findById(id);
	}

}
