package com.example.supermercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermercado.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long>{
	Cargo findById(long id);
}
