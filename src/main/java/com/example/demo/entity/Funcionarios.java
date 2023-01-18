package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionarios {
	

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private long id;
 	
		
@Column(name = "Nome", nullable = true, length = 100)
	private String Nome;

@Column(nullable = true, length = 100)
private String Cpf;

@Column(nullable = true, length = 100)
private String Endereco;

@Column(nullable = true, length = 100)
private String Fone;

@Column(nullable = true, length = 100)
private String Cargo;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public String getCpf() {
	return Cpf;
}

public void setCpf(String cpf) {
	Cpf = cpf;
}

public String getEndereco() {
	return Endereco;
}

public void setEndereco(String endereco) {
	Endereco = endereco;
}

public String getFone() {
	return Fone;
}

public void setFone(String fone) {
	Fone = fone;
}

public String getCargo() {
	return Cargo;
}

public void setCargo(String cargo) {
	Cargo = cargo;
}

public String getDataNascimento() {
	return DataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	DataNascimento = dataNascimento;
}

@Column(nullable = true, length = 100)
private String DataNascimento;



}


