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

import com.example.supermercado.models.Fornecedor;
import com.example.supermercado.models.Produto;
import com.example.supermercado.repository.FornecedorRepository;
import com.example.supermercado.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//irá receber as requisicoes HTTP
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Fornecedor")
public class FornecedorResource {
	
	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@GetMapping("/fornecedor")
	@ApiOperation(value="Retorna uma lista de fornecedor")
	public List<Fornecedor> listFornecedor(){
		return fornecedorRepository.findAll();
	}
	
	@GetMapping("/fornecedor/{id}")
	@ApiOperation(value="Retorna um fornecedor especifico,atraves do seu Id")
	public Fornecedor listaFornecedorUnico(@PathVariable(value = "id") long id ) {
		return fornecedorRepository.findById(id);
	}
	
	@PostMapping("/fornecedor")
	@ApiOperation(value="Adiciona um fornecedor")
	public Fornecedor adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	@DeleteMapping("/fornecedor")
	@ApiOperation(value="Deleta um fornecedor da lista")
	public void deletarFornecedor(@RequestBody Fornecedor fornecedor) {
		fornecedorRepository.delete(fornecedor);
	}
	@PutMapping("/fornecedor")
	@ApiOperation(value="Atualiza dados de um fornecedor")
	public Fornecedor atualizarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
}
