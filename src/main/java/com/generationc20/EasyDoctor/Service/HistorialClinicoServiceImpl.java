package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.HistorialClinicoRepository;
import com.generationc20.EasyDoctor.model.HistorialClinico;


@Service
public class HistorialClinicoServiceImpl implements HistorialClinicoService{
	@Autowired
	private HistorialClinicoRepository repository;
	
	@Override
	public HistorialClinico crear(Integer idPaciente, HistorialClinico hF) {
		hF.setIdPaciente(idPaciente);
		hF.setFecha(new Date());
		return repository.save(hF);
	}
	@Override
	public List<HistorialClinico> getAll() {
		return repository.findAll();
	}
	@Override
	public Optional<HistorialClinico> getById(Integer id) {
		return repository.findById(id);
	}@Override
	public HistorialClinico updata(Integer id, HistorialClinico hC) {
		HistorialClinico hCDB= getById(id).get();
		hCDB.setMedico(hC.getMedico());
		hCDB.setAdicciones(hC.getAdicciones());
		hCDB.setCirugias(hC.getCirugias());
		hCDB.setPsicologico(hC.getPsicologico());
		hCDB.setTraumas(hC.getTraumas());
		hCDB.setOtros(hC.getOtros());
		return repository.save(hCDB);
	}
	@Override
	public void delate(Integer id) {	
	}
	

}
