package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.Laboratorio;

public interface LaboratorioService {
	Laboratorio crear(Integer idLaboratorio,Laboratorio laboratorio);
	List<Laboratorio> getAll();
	Laboratorio update(Integer id, Laboratorio l);
	void delete(Integer id);
	Optional<Laboratorio> getById(Integer id);
}
