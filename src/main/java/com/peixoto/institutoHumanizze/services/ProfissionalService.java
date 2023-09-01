package com.peixoto.institutoHumanizze.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peixoto.institutoHumanizze.repositories.ProfissionalRepository;

@Service
public class ProfissionalService {
	
	@Autowired
	ProfissionalRepository repository;

}
