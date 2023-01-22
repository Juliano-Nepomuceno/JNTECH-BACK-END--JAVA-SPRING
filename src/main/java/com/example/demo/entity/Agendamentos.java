package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
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
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = true, length = 100)
	private String data;
	
 	 
	 public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@OneToOne
	 //@JoinColumn(nullable = true, name = "funcionarios_id")
	 private Funcionarios	funcionarios ;
	 
	 public Funcionarios getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}

	@OneToOne
	 //@JoinColumn(nullable = true, name = "servicosti_id")
	 private ServicosTI servicosTI;

	 public ServicosTI getServicosTI() {
		return servicosTI;
	}

	public void setServicosTI(ServicosTI servicosTI) {
		this.servicosTI = servicosTI;
	}

	@OneToOne
	 //@JoinColumn(nullable = true, name = "clientes_id")
	 private Clientes clientes;


	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	 
	 	
	
	
	
	

}
