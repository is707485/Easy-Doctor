package com.generationc20.EasyDoctor.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.HistorialNoClinicoRepository;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;

@Service
public class HistorialNoClinicoServiceImpl implements HistorialNoClinicoService{

	@Autowired
	private HistorialNoClinicoRepository repository;
	@Override
	public HistorialNoClinico cerar(Integer idPaciente, HistorialNoClinico hNC) {
		hNC.setIdPaciente(idPaciente);
		hNC.setFecha(new Date());
		return repository.save(hNC);
	}
	@Override
	public List<HistorialNoClinico> getAll() {
		return repository.findAll();
	}
	@Override
	public Optional<HistorialNoClinico> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public HistorialNoClinico updata(Integer id, HistorialNoClinico hNC) {
		HistorialNoClinico hNCDB= getById(id).get();
		hNCDB.setActividadfisica(hNC.getActividadfisica());
		hNCDB.setHabitosAlimenticios(hNC.getHabitosAlimenticios());
		hNCDB.setHabitosSueño(hNC.getHabitosSueño());
		hNCDB.setVacunas(hNC.getVacunas());
		return repository.save(hNCDB);
	}
	@Override
	public void delete(Integer id) {
	}
}
