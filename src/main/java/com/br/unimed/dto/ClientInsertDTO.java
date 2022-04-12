package com.br.unimed.dto;

public class ClientInsertDTO {
	
	
private Long id;
	
	
	private String razaoSocial;
	
	
	private String cnpj;
	
	
	private String tipoRegimeTributario;
	
	
	private String email;
	
	public ClientInsertDTO() {
		
	}

	public ClientInsertDTO(Long id,String razaoSocial, String cnpj, String tipoRegimeTributario, String email) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tipoRegimeTributario = tipoRegimeTributario;
		this.email = email;
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
	
	

}
