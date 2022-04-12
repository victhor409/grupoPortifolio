package com.br.unimed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unimed.dto.ClientInsertDTO;
import com.br.unimed.dto.ClienteDTO;
import com.br.unimed.entities.Cliente;
import com.br.unimed.service.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity <List<ClienteDTO>> findAll(){
		List<ClienteDTO> list=service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity <ClienteDTO> insert(@RequestBody ClientInsertDTO dto){
		ClienteDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity <Void> delete (@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity update (@PathVariable Long id, @RequestBody Cliente obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
	

}
