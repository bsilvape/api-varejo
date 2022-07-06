package com.example.supermercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermercado.models.Cliente;
import com.example.supermercado.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	Funcionario findById(long id);
}
