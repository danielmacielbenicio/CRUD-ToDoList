package com.List.ToDo.dto;

import com.List.ToDo.entities.Usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioDTO {
	
	private long id;
	@NotBlank(message = "Digite um nome válido")
	private String nome;
	@NotBlank(message = "Digite um email valido") @Email
	private String email;
	@Size(min = 6, max = 40, message = "A senha deve conter mais de 6 caracteres")
	private String senha;
	
	public UsuarioDTO(Usuario user) {
		this.nome = user.getNome();
		this.email = user.getEmail();
	}
	
	public UsuarioDTO( long id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
}
