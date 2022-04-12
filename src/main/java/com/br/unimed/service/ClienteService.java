package com.br.unimed.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.unimed.dto.ClientInsertDTO;
import com.br.unimed.dto.ClienteDTO;
import com.br.unimed.entities.Cliente;
import com.br.unimed.repository.ClientRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional
	public List<ClienteDTO> findAll(){
		
		List<Cliente> list = repository.findAll();
		
		return list.stream().map( x -> new ClienteDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ClienteDTO insert(ClientInsertDTO dto) {
		
		Cliente entity = new Cliente();
		
		entity.setId(dto.getId());
		entity.setRazaoSocial(dto.getRazaoSocial());
		entity.setCnpj(dto.getCnpj());
		entity.setTipoRegimeTributario(dto.getTipoRegimeTributario());
		entity.setEmail(dto.getEmail());
		
		entity = repository.save(entity);
		
		return new ClienteDTO(entity);
		
	}
	
	@Transactional
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	
	@Transactional
	public Cliente update(Long id, Cliente dto) {
		Cliente entity = repository.getOne(id);
		UpdateData(entity, dto);
		return repository.save(entity);
		
	}
	
	@Transactional
	public void UpdateData(Cliente entity, Cliente dto) {
		
		
		entity.setId(dto.getId());
		entity.setRazaoSocial(dto.getRazaoSocial());
		entity.setCnpj(dto.getCnpj());
		entity.setTipoRegimeTributario(dto.getTipoRegimeTributario());
		entity.setEmail(dto.getEmail());
	}


}
