package com.br.unimed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.unimed.entities.Cliente;

public interface ClientRepository extends JpaRepository<Cliente, Long>{

	
	
}
