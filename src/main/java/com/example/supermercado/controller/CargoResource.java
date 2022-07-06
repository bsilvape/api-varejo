package com.example.supermercado.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supermercado.models.Cargo;
import com.example.supermercado.models.Cliente;
import com.example.supermercado.models.Fornecedor;
import com.example.supermercado.models.Produto;
import com.example.supermercado.repository.CargoRepository;
import com.example.supermercado.repository.ClienteRepository;
import com.example.supermercado.repository.FornecedorRepository;
import com.example.supermercado.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//irá receber as requisicoes HTTP
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Cargo")
public class CargoResource {
	
	@Autowired
	CargoRepository cargoRepository;
	
	@GetMapping("/cargo")
	@ApiOperation(value="Retorna uma lista de cargo")
	public List<Cargo> listCargo(){
		return cargoRepository.findAll();
	}
	
	@GetMapping("/cargo/{id}")
	@ApiOperation(value="Retorna um cargo especifico,atraves do seu Id")
	public Cargo listaCargoUnico(@PathVariable(value = "id") long id ) {
		return cargoRepository.findById(id);
	}
	
	@PostMapping("/cargo")
	@ApiOperation(value="Adiciona um cargo")
	public Cargo adicionarCargo(@RequestBody Cargo cargo) {
		return cargoRepository.save(cargo);
	}
	
	@DeleteMapping("/cargo")
	@ApiOperation(value="Deleta um cargo da lista")
	public void deletarCargo(@RequestBody Cargo cargo) {
		cargoRepository.delete(cargo );
	}
	@PutMapping("/cargo")
	@ApiOperation(value="Atualiza dados de um cargo")
	public Cargo atualizarCargo(@RequestBody Cargo cargo) {
		return cargoRepository.save(cargo);
	}
}
