package com.peixoto.institutoHumanizze.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peixoto.institutoHumanizze.entities.Agendamento;
import com.peixoto.institutoHumanizze.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	@Autowired
	AgendamentoRepository repository;
	
	public List<Agendamento> findAll() {
		List<Agendamento> list = repository.findAll();
		return list;
	}
	public Optional<Agendamento> findById(Integer id) {
		Optional<Agendamento> list = repository.findById(id);
		return list;
	}
	
	public Agendamento update(Integer id, Agendamento agendamento) {
		findById(id);
		agendamento.setId(id);
		return repository.save(agendamento);
	}
	
	public Agendamento create(Agendamento agendamento) {
		agendamento.setId(null);
		return repository.save(agendamento); 
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
