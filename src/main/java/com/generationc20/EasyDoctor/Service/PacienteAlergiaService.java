package com.generationc20.EasyDoctor.Service;

import java.util.List;

import com.generationc20.EasyDoctor.model.PacienteAlergia;

public interface PacienteAlergiaService {
	
	PacienteAlergia crear(Integer idPaciente,Integer idAlergia,PacienteAlergia pacienteAlergia);
	List<PacienteAlergia> getAll();

}
