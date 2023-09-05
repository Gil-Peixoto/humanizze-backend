package com.peixoto.institutoHumanizze.controllers;

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

import com.peixoto.institutoHumanizze.dto.ClienteDTO;
import com.peixoto.institutoHumanizze.entities.Cliente;
import com.peixoto.institutoHumanizze.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<ClienteDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ClienteDTO>> findById(@PathVariable Integer id) {
		List<ClienteDTO> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Cliente> update(@PathVariable Integer id,@RequestBody @Valid Cliente cliente) {
		Cliente newCliente = service.update(id, cliente);
		return ResponseEntity.ok().body(newCliente);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> create(@RequestBody @Valid Cliente cliente) {
		cliente = service.create(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	

}
