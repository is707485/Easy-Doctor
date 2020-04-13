package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.HistorialFamiliarRepository;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;
@Service
public class HistorialFamiliarServeceImpl implements HistorialFamiliarService{
	
	@Autowired
	private HistorialFamiliarRepository repository;
	
	@Override
	public HistorialFamiliar crear(Integer idPaciente, HistorialFamiliar hF) {
		hF.setIdPaciente(idPaciente);
		hF.setFecha(new Date());
		return repository.save(hF);
	}
	@Override
	public List<HistorialFamiliar> getAll() {
		return repository.findAll();
	}
	@Override
	public Optional<HistorialFamiliar> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public HistorialFamiliar update(Integer id, HistorialFamiliar hF) {
		HistorialFamiliar hFDB= getById(id).get();
		hFDB.setPapa(hF.getPapa());
		hFDB.setMama(hF.getMama());
		hFDB.setAbuelosP(hF.getAbuelosP());
		hFDB.setAbuelosM(hF.getAbuelosM());
		return repository.save(hFDB);
	}
	@Override
	public void delate(Integer id) {
		repository.deleteById(id);
	}

}
