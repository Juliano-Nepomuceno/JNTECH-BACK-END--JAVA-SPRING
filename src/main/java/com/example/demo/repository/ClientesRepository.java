package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
