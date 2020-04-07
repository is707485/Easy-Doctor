package com.generationc20.EasyDoctor.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationc20.EasyDoctor.model.HistorialClinico;

@Repository
public interface HistorialClinicoRepository extends JpaRepository<HistorialClinico, Integer>{

}
