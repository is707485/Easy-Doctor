package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.PacienteAlergiaRepository;
import com.generationc20.EasyDoctor.model.PacienteAlergia;

@Service
public class PacienteAlergiaServiceImpl implements PacienteAlergiaService{
	
	@Autowired
	private PacienteAlergiaRepository repository;
	
	@Override
	public PacienteAlergia crear(Integer idPaciente,Integer idAlergia,PacienteAlergia pacienteAlergia) {
		pacienteAlergia.setIdAlergia(idAlergia);
		pacienteAlergia.setIdPaciente(idPaciente);
		pacienteAlergia.setFecha(new Date());
		return repository.save(pacienteAlergia);
	}
	@Override
	public List<PacienteAlergia> getAll() {
		return repository.findAll();
	}

}
