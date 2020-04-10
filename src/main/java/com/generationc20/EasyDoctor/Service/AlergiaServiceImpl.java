package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.AlergiaRepository;
import com.generationc20.EasyDoctor.model.Alergia;

@Service
public class AlergiaServiceImpl implements AlergiaService {

	@Autowired
	private AlergiaRepository repository;
	
	@Override
	public Alergia save(Alergia alergia) {
		alergia.setFecha(new Date());
		return repository.save(alergia);
	}
	@Override
	public List<Alergia> getAll() {
		return repository.findAll();
	}
	
}
