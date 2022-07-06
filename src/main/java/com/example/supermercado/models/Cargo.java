package com.example.supermercado.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import application.entities.ClassRoom;
import lombok.Data;
@Data
@Entity
@Table(name = "TB_CARGO")
public class Cargo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@OneToOne()
    private Funcionario funcionario; // 1 cargo tem 1 funcionario!
	
	private long id;
	private String cargo;
	
}
