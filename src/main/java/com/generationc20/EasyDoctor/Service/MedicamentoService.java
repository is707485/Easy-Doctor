package com.generationc20.EasyDoctor.Service;

import com.generationc20.EasyDoctor.model.Medicamento;

public interface MedicamentoService {

	Medicamento save(Medicamento medicamento);
	Medicamento getByName(String nombre);
	void delete (Integer id);
}
