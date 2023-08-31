package com.peixoto.institutoHumanizze.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peixoto.institutoHumanizze.entities.Cliente;
import com.peixoto.institutoHumanizze.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	public List<Cliente> findAll() {
		List<Cliente> list = repository.findAll();
		return list;
	}
	
	public Optional<Cliente> findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj;
	}
	
	public Cliente update(Integer id, Cliente cliente) {
		findById(id);
		cliente.setId(id);
		return repository.save(cliente);
	}
	
	public Cliente create(Cliente cliente) {
		cliente.setId(null);
		return repository.save(cliente);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	

}
