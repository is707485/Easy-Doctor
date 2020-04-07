package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.HistorialSexualRepository;
import com.generationc20.EasyDoctor.model.HistorialSexual;

@Service
public class HistorialSexualServiceImpl implements HistorialSexualService {

	@Autowired
	private HistorialSexualRepository repository;
	
	@Override
	public HistorialSexual crear(Integer idPaciente, HistorialSexual hS) {
		hS.setIdPaciente(idPaciente);
		hS.setFecha(new Date());
		return repository.save(hS);
	}
	@Override
	public List<HistorialSexual> getAll() {
		return repository.findAll();
	}
	@Override
	public Optional<HistorialSexual> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public HistorialSexual updata(Integer id, HistorialSexual hS) {
		HistorialSexual hSDB=getById(id).get();
		hSDB.setAbortos(hS.getAbortos());
		hSDB.setCesarias(hS.getCesarias());
		hSDB.setMenarca(hS.getMenarca());
		hSDB.setPrimareRelacionSexual(hS.getPrimareRelacionSexual());
		hSDB.setSexualidad(hS.getSexualidad());
		return repository.save(hSDB);
	}
	@Override
	public void delate(Integer id) {
	}
	
}
