package com.br.unimed.dto;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.unimed.entities.Cliente;

public class ClienteDTO {
	
	
	
	private Long id;
	
	
	private String razaoSocial;
	
	
	private String cnpj;
	
	
	private String tipoRegimeTributario;
	
	
	private String email;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Long id,String razaoSocial, String cnpj, String tipoRegimeTributario, String email) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tipoRegimeTributario = tipoRegimeTributario;
		this.email = email;
	}
	
	
	public ClienteDTO(Cliente entity) {
		
		id = entity.getId();
		razaoSocial= entity.getRazaoSocial();
		cnpj = entity.getCnpj();
		tipoRegimeTributario = entity.getTipoRegimeTributario();
		email=entity.getEmail();
		
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoRegimeTributario() {
		return tipoRegimeTributario;
	}

	public void setTipoRegimeTributario(String tipoRegimeTributario) {
		this.tipoRegimeTributario = tipoRegimeTributario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	

}
