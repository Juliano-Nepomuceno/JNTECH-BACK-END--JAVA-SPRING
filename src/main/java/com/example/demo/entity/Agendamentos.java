package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Agendamentos {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	
	@Column(nullable = true, length = 100)
	private Date Data;
	

	
	 @OneToOne
	 @JoinColumn(nullable = true)
	 private Clientes clientes;
	 
	 @OneToOne
	 @JoinColumn(nullable = true)
	 private Funcionarios	funcionarios ;
	 
	 @OneToOne
	 @JoinColumn(nullable = true)
	 private ServicosTI servicosTI;
	 
	 	
	
	
	
	

}
