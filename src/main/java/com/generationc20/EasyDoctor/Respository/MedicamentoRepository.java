package com.generationc20.EasyDoctor.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Medicamento;
@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{

	@Query(value="select*from medicamento where nombre=?",nativeQuery = true)
	Medicamento findByName(String nombre);
}
