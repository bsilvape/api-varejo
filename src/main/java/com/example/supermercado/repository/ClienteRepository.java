package com.example.supermercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermercado.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);
}
