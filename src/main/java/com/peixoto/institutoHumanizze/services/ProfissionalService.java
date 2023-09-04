package com.peixoto.institutoHumanizze.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peixoto.institutoHumanizze.dto.ProfissionalDTO;
import com.peixoto.institutoHumanizze.entities.Profissional;
import com.peixoto.institutoHumanizze.repositories.ProfissionalRepository;

@Service
public class ProfissionalService {
	
	@Autowired
	ProfissionalRepository repository;
	
	public List<ProfissionalDTO> findAll() {
		List<Profissional> list = repository.findAll();
		return list.stream().map(x -> new ProfissionalDTO(x)).toList();
	}
	
	public List<ProfissionalDTO> findById(Integer id) {
		Optional<Profissional> opt = repository.findById(id);
		return opt.stream().map(x -> new ProfissionalDTO(x)).toList();
	}
	
	public Profissional update(Integer id, Profissional profissional) {
		findById(id);
		profissional.setId(id);
		return repository.save(profissional);
	}
	
	public Profissional create(Profissional profissional) {
		profissional.setId(null);
		return repository.save(profissional);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	

}
