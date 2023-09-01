package com.peixoto.institutoHumanizze.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.peixoto.institutoHumanizze.repositories.AgendamentoRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String agend_cliente;
	private String agend_profissional;
	
	@Autowired
	AgendamentoRepository repository;
	
	public Agendamento() {
		
	}
	
	public Agendamento(Integer id, Cliente agend_cliente, Profissional agend_profissional) {
		this.id = id;
		this.agend_cliente = agend_cliente.getNome();
		this.agend_profissional = agend_profissional.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAgend_cliente() {
		return agend_cliente;
	}

	public void setAgend_cliente(String agend_cliente) {
		this.agend_cliente = agend_cliente;
	}

	public String getAgend_profissional() {
		return agend_profissional;
	}

	public void setAgend_profissional(String agend_profissional) {
		this.agend_profissional = agend_profissional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
