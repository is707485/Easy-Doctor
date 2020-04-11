package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.Cita;

public interface CitaService {

	Cita save(Integer idPaciente,Cita cita);
	List<Cita> getByFecha(String fecha);
	void delete (Integer id);
	

}
