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
import com.example.demo.repository.ClientesRepository;
import com.example.demo.repository.ServicosRepository;

@RestController
@RequestMapping(value = "/servicosti")
public class ServicosTiController {


@Autowired ServicosRepository servicosRepository;

	@GetMapping(value="/listarservicos")

	public List<ServicosTI> listarservicos(){

return servicosRepository.findAll();

	}


	@PostMapping(value="/addservicos")

	ResponseEntity<ServicosTI> addservicos(@RequestBody ServicosTI servicosTI ){

 return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicosRepository.save(servicosTI));

	}


@PutMapping(value="/updateservicos")

ResponseEntity<ServicosTI> updateservicos(@RequestBody ServicosTI servicosTI){

return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicosRepository.save(servicosTI));

}

@DeleteMapping(value="/deleteservicos/{id}")
void deleteservicos(@PathVariable long id  ){

servicosRepository.deleteById(id);

}







	
	
}




	
	
