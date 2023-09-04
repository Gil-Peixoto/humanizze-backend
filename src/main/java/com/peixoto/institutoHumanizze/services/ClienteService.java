package com.peixoto.institutoHumanizze.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peixoto.institutoHumanizze.dto.ClienteDTO;
import com.peixoto.institutoHumanizze.entities.Cliente;
import com.peixoto.institutoHumanizze.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAll();
		return list.stream().map(x -> new ClienteDTO(x)).toList();
	}
	
	public List<ClienteDTO> findById(Integer id) {
		Optional<Cliente> opt = repository.findById(id);
		return opt.stream().map(x -> new ClienteDTO(x)).toList();
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
