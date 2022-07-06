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

import com.example.supermercado.models.Cliente;
import com.example.supermercado.models.Fornecedor;
import com.example.supermercado.models.Produto;
import com.example.supermercado.repository.ClienteRepository;
import com.example.supermercado.repository.FornecedorRepository;
import com.example.supermercado.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//irá receber as requisicoes HTTP
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Cliente")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	@ApiOperation(value="Retorna uma lista de cliente")
	public List<Cliente> listCLiente(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	@ApiOperation(value="Retorna um cliente especifico,atraves do seu Id")
	public Cliente listaClienteUnico(@PathVariable(value = "id") long id ) {
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	@ApiOperation(value="Adiciona um cliente")
	public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta um cliente da lista")
	public void deletarCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza dados de um cliente")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
