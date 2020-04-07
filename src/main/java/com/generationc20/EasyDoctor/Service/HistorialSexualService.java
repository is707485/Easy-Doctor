package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.HistorialSexual;

public interface HistorialSexualService {
	
	HistorialSexual crear(Integer idPaciente, HistorialSexual hS);
	List<HistorialSexual> getAll();
	HistorialSexual updata(Integer id, HistorialSexual hS);
	Optional<HistorialSexual> getById(Integer id);
	void delate(Integer id);

}
