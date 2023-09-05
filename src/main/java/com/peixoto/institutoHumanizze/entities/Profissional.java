package com.peixoto.institutoHumanizze.entities;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_profissional")
public class Profissional implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "Campo nome não informado")
	private String nome;
	@CPF
	@NotBlank(message = "Campo cpf não informado")
	private String cpf;
	@NotBlank(message = "Campo registro não informado")
	private String registro;
	@NotBlank(message = "Campo número não informado")
	private String numeroCelular;
	@NotBlank(message = "Campo especialidade não informado")
	private String especialidade;

	public Profissional() {
		
	}

	public Profissional(Integer id, String nome, String cpf, String registro, String numeroCelular,String especialidade) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.registro = registro;
		this.numeroCelular = numeroCelular;
		this.especialidade = especialidade;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
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
		Profissional other = (Profissional) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
