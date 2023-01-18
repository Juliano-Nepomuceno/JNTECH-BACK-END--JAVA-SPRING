package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column(nullable = true, length = 100)
	private String Nome;
	
	@Column(nullable = true, length = 100)
	private String Descricao;
	
	@Column(nullable = true, length = 100)
   private String ServicosContratados;
	
	@Column(nullable = true, length = 100)
	private String Endereco;
	
	@Column(nullable = true, length = 100)
	private String Responsavel;
	
	@Column(nullable = true, length = 100)
	private String Fone;
	
	@OneToOne(mappedBy = "clientes", cascade = CascadeType.ALL)
	private Agendamentos agendamentos;
	 
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getServicosContratados() {
		return ServicosContratados;
	}

	public void setServicosContratados(String servicosContratados) {
		ServicosContratados = servicosContratados;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getResponsavel() {
		return Responsavel;
	}

	public void setResponsavel(String responsavel) {
		Responsavel = responsavel;
	}

	public String getFone() {
		return Fone;
	}

	public void setFone(String fone) {
		Fone = fone;
	}
	
	
	
	
}
