package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.HistorialNoClinico;

public interface HistorialNoClinicoService {
	
	HistorialNoClinico cerar(Integer idPaciente,HistorialNoClinico hNC);
	List<HistorialNoClinico> getAll();
	Optional<HistorialNoClinico> getById(Integer id);
	HistorialNoClinico updata(Integer id,HistorialNoClinico hNC);
	void delete(Integer id);

}
