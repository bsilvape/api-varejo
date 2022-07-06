package com.example.supermercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermercado.models.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
	Fornecedor findById(long id);
}
