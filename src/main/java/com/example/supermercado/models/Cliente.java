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
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long cnpj;
	private long cpf;
	private long ie;
	private long rg;
	private String razaoSocial;
	private String endereco;
	private long numero;
	private long cep;
	private String bairro;
	private String cidade;
	private String estado;	
	private String pais;
}
