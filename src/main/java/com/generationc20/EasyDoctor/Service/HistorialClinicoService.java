package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.HistorialClinico;

public interface HistorialClinicoService {
	
	HistorialClinico crear(Integer idPaciente, HistorialClinico hC);
	List<HistorialClinico> getAll();
	HistorialClinico updata(Integer id, HistorialClinico hC);
	Optional<HistorialClinico> getById(Integer id);
	void delate(Integer id);

}
