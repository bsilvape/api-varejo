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

import com.example.supermercado.models.Produto;
import com.example.supermercado.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//irá receber as requisicoes HTTP
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Produtos")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de produtos")
	public List<Produto> listProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto especifico,atraves do seu Id")
	public Produto listaProdutoUnico(@PathVariable(value = "id") long id ) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value="Adiciona um produto")
	public Produto adicionarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta um produto da lista")
	public void deletarProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza dados de um produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
