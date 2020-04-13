package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.Tratamiento;

public interface TratamientoService {
	Tratamiento crear(Integer idTratamiento,Tratamiento tratamiento);
	List<Tratamiento> getAll();
	Tratamiento update(Integer id, Tratamiento t);
	void delete(Integer id);
	Optional<Tratamiento> getById(Integer id);

}
