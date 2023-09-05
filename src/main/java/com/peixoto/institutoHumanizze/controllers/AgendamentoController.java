package com.peixoto.institutoHumanizze.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peixoto.institutoHumanizze.entities.Agendamento;
import com.peixoto.institutoHumanizze.services.AgendamentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoController {
	
	@Autowired
	AgendamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Agendamento>> findAll() {
		List<Agendamento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Agendamento>> findById(@PathVariable Integer id) {
		Optional<Agendamento> opt = service.findById(id);
		return ResponseEntity.ok().body(opt);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Agendamento> update(@PathVariable Integer id, @RequestBody @Valid Agendamento agendamento) {
		Agendamento obj = service.update(id, agendamento);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Agendamento> create(@RequestBody @Valid Agendamento agendamento) {
		agendamento = service.create(agendamento);
		return ResponseEntity.ok(agendamento);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Agendamento> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	

}
