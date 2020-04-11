package com.generationc20.EasyDoctor.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationc20.EasyDoctor.Respository.MedicamentoRepository;
import com.generationc20.EasyDoctor.model.Medicamento;

@Service
public class MedicamenteServiceImpl implements MedicamentoService{
	
	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public Medicamento save(Medicamento medicamento) {
		medicamento.setFecha(new Date());
		return repository.save(medicamento);
	}
	@Override
	public Medicamento getByName(String nombre) {
		return repository.findByName(nombre);
	}
	@Override
	public void delete(Integer id) {
		
	}

}
