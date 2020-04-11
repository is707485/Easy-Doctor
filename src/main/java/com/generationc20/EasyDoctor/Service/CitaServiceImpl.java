package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.CitaRepository;
import com.generationc20.EasyDoctor.model.Cita;

@Service
public class CitaServiceImpl implements CitaService {
	
	@Autowired
	private CitaRepository repository;
	
	@Override
	public Cita save(Integer idPaciente,Cita cita) {
		cita.setIdPaciente(idPaciente);
		cita.setFecha(new Date());
		return repository.save(cita);
	}
	@Override
	public List<Cita> getByFecha(String fecha) {
		return repository.findByFecha(fecha);
	}
	@Override
	public void delete(Integer id) {
	}

}
