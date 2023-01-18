package com.example.demo.controller;

import java.util.List;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Funcionarios;
import com.example.demo.repository.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

	
	@Autowired FuncionarioRepository funcionarioRepository;
	


@GetMapping (value="listarfunc")
public List<Funcionarios> listarFuncionario() {
	
	return funcionarioRepository.findAll();
}

	

	@PostMapping(value = "/addfunc")
	
	ResponseEntity<Funcionarios> addfunc(@RequestBody Funcionarios funcionario ) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(funcionarioRepository.save(funcionario));
	}
	
	
	
	
	@PutMapping(value="/updatefunc")
	
	ResponseEntity<Funcionarios> updatefunc(@RequestBody Funcionarios funcioanrio ){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(funcionarioRepository.save(funcioanrio));
	}
	
	
	@DeleteMapping (value="/deletefunc/{id}")
	
	
	 void deletefunc(@PathVariable Long id ){
		
		 funcionarioRepository.deleteById(id);
	}
	
}




	
	
