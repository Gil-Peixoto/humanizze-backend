package com.peixoto.institutoHumanizze.dto;

import com.peixoto.institutoHumanizze.entities.Cliente;

public class ClienteDTO {
	
	private Integer id;
	private String nome;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		
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

}
