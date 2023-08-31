package com.peixoto.institutoHumanizze.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peixoto.institutoHumanizze.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
