package com.generationc20.EasyDoctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationc20.EasyDoctor.Service.CitaService;
import com.generationc20.EasyDoctor.model.Cita;

@RestController
@RequestMapping("/cita")
public class CitaController {
	
	@Autowired
	private CitaService service;
	
	@PostMapping("/{idPaciente}")
	public ResponseEntity<Cita> save(@RequestBody Cita cita,@PathVariable("idPaciente")Integer idPaciente){
		return new ResponseEntity<>(service.save(idPaciente,cita),HttpStatus.CREATED);
	}

	@GetMapping("/{fecha}")
	public ResponseEntity<List<Cita>> getByFecha(@PathVariable("fecha")String fecha){
		return new ResponseEntity<>(service.getByFecha(fecha),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delate(@PathVariable("id")Integer id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
