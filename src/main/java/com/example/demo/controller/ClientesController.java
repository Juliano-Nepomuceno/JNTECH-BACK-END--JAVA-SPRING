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

import com.example.demo.entity.Clientes;
import com.example.demo.repository.ClientesRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {

	
	@Autowired ClientesRepository clientesRepository;
	
	


@GetMapping (value="listarcliente")
public List<Clientes> listarcliente() {
	
	return clientesRepository.findAll();
}

	

	@PostMapping(value = "/addcliente")
	
	ResponseEntity<Clientes> addclient(@RequestBody Clientes clientes ) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientesRepository.save(clientes));
	}
	
	
	
	
	@PutMapping(value="/updatecliente")
	
	ResponseEntity<Clientes> updateclient(@RequestBody Clientes clientes ){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientesRepository.save(clientes));
	}
	
	
	@DeleteMapping (value="/deletecliente/{id}")
	
	
	 void deletefunc(@PathVariable Long id ){
		
		 clientesRepository.deleteById(id);
	}
	
}




	
	
