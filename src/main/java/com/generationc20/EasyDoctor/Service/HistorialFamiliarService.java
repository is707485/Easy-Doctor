package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.HistorialFamiliar;

public interface HistorialFamiliarService {
	
	HistorialFamiliar crear(Integer idPaciente, HistorialFamiliar hF);
	List<HistorialFamiliar> getAll();
	Optional<HistorialFamiliar> getById(Integer id);
	HistorialFamiliar update(Integer id,HistorialFamiliar hF);
	void delate(Integer id);

}
