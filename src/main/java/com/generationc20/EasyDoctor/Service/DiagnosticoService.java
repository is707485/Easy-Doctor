package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.Diagnostico;


public interface DiagnosticoService {
	Diagnostico crear(Integer idDoctor,Diagnostico diagnostico);
	List<Diagnostico> getAll();
	Diagnostico update(Integer id, Diagnostico d);
	void delete(Integer id);
	Optional<Diagnostico> getById(Integer id);
}
