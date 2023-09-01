package com.peixoto.institutoHumanizze.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.peixoto.institutoHumanizze.services.ProfissionalService;

@RestController
public class ProfissionalController {
	
	@Autowired
	ProfissionalService service;

}
