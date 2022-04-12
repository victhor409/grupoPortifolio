package com.br.unimed.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="tipo_regime_tributario")
	private String tipoRegimeTributario;
	
	@Column(name="email")
	private String email;
	
	public Cliente() {
		
	}

	public Cliente(Long id,String razaoSocial, String cnpj, String tipoRegimeTributario, String email) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", tipoRegimeTributario="
				+ tipoRegimeTributario + ", email=" + email + "]";
	}
	
	
	
	

}
