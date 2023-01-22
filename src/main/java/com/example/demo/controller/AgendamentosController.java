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
import org.springframework.web.client.HttpStatusCodeException;

import com.example.demo.entity.Agendamentos;
import com.example.demo.entity.Clientes;
import com.example.demo.repository.AgendamentosRepository;
import com.example.demo.repository.ClientesRepository;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentosController {

	
	@Autowired AgendamentosRepository agendamentosRepository;
	
	
@GetMapping(value="listaragendamentos")
public List<Agendamentos> listarAgendamentos(){

	return agendamentosRepository.findAll();
}

@PostMapping(value = "/addagendamentos")
public ResponseEntity<Agendamentos> addAgendamentos(@RequestBody Agendamentos agendamentos){
return ResponseEntity.status(HttpStatus.ACCEPTED).body(agendamentosRepository.save(agendamentos));
}

//@PostMapping(value="addagendamentos")
//public Object addAgendamentos(@RequestBody Agendamentos agendamentos){

//	return agendamentosRepository.save(agendamentos);
//}




@PutMapping(value = "/updateagendamentos")
public ResponseEntity<Agendamentos> updateAgendamentos(@RequestBody Agendamentos agendamentos){
return ResponseEntity.status(HttpStatus.ACCEPTED).body(agendamentosRepository.save(agendamentos));


}

@DeleteMapping(value="/deleteagendamentos/{id}")
public void deleteAgendamentos(@PathVariable Long id){
 agendamentosRepository.deleteById(id);

}

}




	
	
