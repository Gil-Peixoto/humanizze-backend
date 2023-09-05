package com.peixoto.institutoHumanizze.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "Campo nome não informado")
	private String nomeCliente;
	@NotBlank(message = "Campo nome não informado")
	private String nomeProfissional;
	@NotBlank
	private String data;
	@NotBlank
    private String hora;
	
	
	public Agendamento() {
		
	}
	
	public Agendamento(Integer id, Cliente cliente, Profissional profissional, SimpleDateFormat data, SimpleDateFormat hora) {
		SimpleDateFormat data_format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hora_format = new SimpleDateFormat("HH:mm");
		this.id = id;
		nomeCliente = cliente.getNome();
		nomeProfissional = profissional.getNome();
		this.data = data.format(data_format);
		this.hora = hora.format(hora_format);
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeProfissional() {
		return nomeProfissional;
	}

	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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
