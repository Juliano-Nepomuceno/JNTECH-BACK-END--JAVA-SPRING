package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Agendamentos;

import jakarta.validation.OverridesAttribute.List;

public interface AgendamentosRepository  extends JpaRepository<Agendamentos, Long> {

    //public Agendamentos findAllQuery()
//@Query(value="select a.id, a.data,
//b.nome Servicos, c.nome clientes, 
//d.nome Funcionarios  from agendamentos a 
//LEFT JOIN  servicosti b on a.servicosti_id = b.id
//LEFT JOIN clientes c on a.clientes_id = c.id/
//LEFT JOIN funcionarios d on a.funcionarios_id = d.id")

//@Query(value = "select a.id, a.Data from Agendamento a 
//left join Funcionarios f in a.id = f.funcionarios.id")    

//@Query(value="select Data from Agendamento")
//public List findAllQuery();


}
