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
import com.example.supermercado.models.Funcionario;
import com.example.supermercado.models.Produto;
import com.example.supermercado.repository.FornecedorRepository;
import com.example.supermercado.repository.FuncionarioRepository;
import com.example.supermercado.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//irá receber as requisicoes HTTP
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Funcionario")
public class FuncionarioResource {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/funcionario")
	@ApiOperation(value="Retorna uma lista de funcionario")
	public List<Funcionario> listFuncionario(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/funcionario/{id}")
	@ApiOperation(value="Retorna um funcionario especifico,atraves do seu Id")
	public Funcionario listaFuncionarioUnico(@PathVariable(value = "id") long id ) {
		return funcionarioRepository.findById(id);
	}
	
	@PostMapping("/funcionario")
	@ApiOperation(value="Adiciona um funcionario")
	public Funcionario adicionarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	@DeleteMapping("/funcionario")
	@ApiOperation(value="Deleta um funcionario da lista")
	public void deletarFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
	@PutMapping("/funcionario")
	@ApiOperation(value="Atualiza dados de um funcionario")
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
}
