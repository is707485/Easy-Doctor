package com.generationc20.EasyDoctor.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer>{

	@Query(value="select*from cita where fecha_agendada=?",nativeQuery = true)
	List<Cita> findByFecha(String fechaAgendada);
}
