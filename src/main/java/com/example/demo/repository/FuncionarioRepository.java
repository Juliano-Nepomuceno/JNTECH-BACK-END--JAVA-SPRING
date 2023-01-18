package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Funcionarios;

public interface FuncionarioRepository  extends JpaRepository<Funcionarios, Long>{

}
