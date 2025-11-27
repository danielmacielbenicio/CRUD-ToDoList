package com.List.ToDo.entities;

import com.List.ToDo.dto.UsuarioDTO;

import jakarta.persistence.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	@Column(unique = true)
	private String email;
	private String senha;
	
	public Usuario() {
		
	}

	public Usuario(UsuarioDTO dto) {
		this.nome = dto.getNome();
		this.email = dto.getEmail();
		this.senha = dto.getSenha();
	}
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
}
