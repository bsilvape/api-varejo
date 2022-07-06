package com.example.supermercado.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao;
	private long estoque;
	private BigDecimal valorCusto;
	private BigDecimal margem;
	private BigDecimal valorVenda;
	
	
}
