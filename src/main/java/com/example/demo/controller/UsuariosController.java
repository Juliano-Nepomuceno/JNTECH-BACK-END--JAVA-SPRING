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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.entity.Clientes;
import com.example.demo.entity.ServicosTI;
import com.example.demo.entity.Usuarios;
import com.example.demo.repository.ClientesRepository;
import com.example.demo.repository.ServicosRepository;
import com.example.demo.repository.UsuariosRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosController {

@Autowired UsuariosRepository usuariosRepository;
	@GetMapping(value="/listarusuarios")

	List<Usuarios> listarusuarios(){

		return usuariosRepository.findAll();
	}

	@PostMapping(value="addusuarios")

	ResponseEntity<Usuarios> addusuario(@RequestBody Usuarios usuarios  ){

return  ResponseEntity.status(HttpStatus.ACCEPTED).body(usuariosRepository.save(usuarios));

	}

	@PutMapping(value="updateusuarios")
	
	ResponseEntity<Usuarios> updateusuarios(@RequestBody Usuarios usuarios){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuariosRepository.save(usuarios));
	}

	@DeleteMapping(value="/delete/{id}")

	void deleteusuarios(@PathVariable long id){

		usuariosRepository.deleteById(id);

	}


	

	










	
	
}




	
	
