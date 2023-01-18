package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Agendamentos;

public interface AgendamentosRepository  extends JpaRepository<Agendamentos, Long> {

}
