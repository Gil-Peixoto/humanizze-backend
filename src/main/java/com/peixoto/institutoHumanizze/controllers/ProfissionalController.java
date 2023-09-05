package com.peixoto.institutoHumanizze.controllers;

import java.net.URI;
import java.util.List;

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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.peixoto.institutoHumanizze.dto.ProfissionalDTO;
import com.peixoto.institutoHumanizze.entities.Profissional;
import com.peixoto.institutoHumanizze.services.ProfissionalService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {
	
	@Autowired
	ProfissionalService service;
	
	@GetMapping
	public ResponseEntity<List<ProfissionalDTO>> findAll() {
		List<ProfissionalDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ProfissionalDTO>> findById(@PathVariable Integer id) {
		List<ProfissionalDTO> opt = service.findById(id);
		return ResponseEntity.ok().body(opt);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Profissional> update(@PathVariable Integer id ,@RequestBody @Valid Profissional profissional) {
		Profissional obj = service.update(id, profissional);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Profissional> create(@RequestBody @Valid Profissional profissional) {
		profissional = service.create(profissional);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(profissional.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/{id}")
	public void  delete (@PathVariable Integer id) {
		service.delete(id);
	}
	

}
