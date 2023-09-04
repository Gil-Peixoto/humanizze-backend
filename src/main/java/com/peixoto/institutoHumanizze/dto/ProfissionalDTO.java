package com.peixoto.institutoHumanizze.dto;

import com.peixoto.institutoHumanizze.entities.Profissional;

public class ProfissionalDTO {
	
	private Integer id;
	private String nome;
	private String especialidade;
	
	public ProfissionalDTO() {
		
	}
	public ProfissionalDTO(Profissional profissional) {
		this.id = profissional.getId();
		this.nome = profissional.getNome();
		this.especialidade = profissional.getEspecialidade();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
